import { Injectable } from '@angular/core';
import { Actions, Effect, ofType } from '@ngrx/effects';
import {
  BaseActionTypes,
  LoadSummoner,
  LoadSummonerSuccess,
  LoadSummonerFail,
  LoadMatchList,
  LoadMatchListSuccess,
  LoadMatchListFail
} from '../actions/base.actions';
import { tap, mergeMap, catchError } from 'rxjs/operators/';
import { SummonerService } from '../../../shared/service/summoner.service';
import { of } from 'rxjs';
import { Store } from '@ngrx/store';
import { AppState } from '../../reducers';
import { MatchService } from '../../../shared/service/match.service';
import { environment } from '../../../environments/environment';

const BEGIN_INDEX = environment.BEGIN_INDEX;
const END_INDEX = environment.END_INDEX;

@Injectable()
export class BaseEffects {

  @Effect({ dispatch: false })
  loadSummoner$ = this.actions$.pipe(
    ofType<LoadSummoner>(BaseActionTypes.LoadSummoner),
    mergeMap(action => this.summonerService.getSummonerByName(action.payload.name).pipe(
      tap(summoner => {
        this.store.dispatch(new LoadSummonerSuccess({ summoner }));
        this.store.dispatch(new LoadMatchList({ accountId: summoner.accountId, beginIndex: BEGIN_INDEX, endIndex: END_INDEX }));
      }),
      catchError(error => {
        this.store.dispatch(new LoadSummonerFail());

        return of([]);
      })
    ))
  );

  @Effect({ dispatch: false })
  LoadMatchList$ = this.actions$.pipe(
    ofType<LoadMatchList>(BaseActionTypes.LoadMatchList),
    mergeMap(action => {
      return this.matchService.getMatchList(action.payload.accountId, action.payload.beginIndex, action.payload.endIndex).pipe(
        tap(matchList => {
          this.store.dispatch(new LoadMatchListSuccess({ matchList }));
        }),
        catchError(error => {
          this.store.dispatch(new LoadMatchListFail());

          return of([]);
        })
      );
    })
  );

  constructor(
    private actions$: Actions,
    private summonerService: SummonerService,
    private matchService: MatchService,
    private store: Store<AppState>) { }
}
