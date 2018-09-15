import { Action } from '@ngrx/store';
import { Summoner } from '../../../shared/model/summoner.model';
import { MatchItem } from '../../../shared/model/match-item.moduel';

export enum BaseActionTypes {
  LoadSummoner = '[Base] Load Summoner',
  LoadSummonerSuccess = '[Base] Loaded Summoner Success',
  LoadSummonerFail = '[Base] Load Summoner Fail',

  LoadMatchList = '[Base] Load Match List',
  LoadMatchListSuccess = '[Base] Loaded Match List Success',
  LoadMatchListFail = '[Base] Load Match List Fail'
}

export class LoadSummoner implements Action {
  readonly type = BaseActionTypes.LoadSummoner;

  constructor(public payload: { name: string }) { }
}

export class LoadSummonerSuccess implements Action {
  readonly type = BaseActionTypes.LoadSummonerSuccess;

  constructor(public payload: { summoner: Summoner }) { }
}

export class LoadSummonerFail implements Action {
  readonly type = BaseActionTypes.LoadSummonerFail;
}

export class LoadMatchList implements Action {
  readonly type = BaseActionTypes.LoadMatchList;

  constructor(public payload: { accountId: number, beginIndex: number, endIndex: number }) { }
}

export class LoadMatchListSuccess implements Action {
  readonly type = BaseActionTypes.LoadMatchListSuccess;

  constructor(public payload: { matchList: MatchItem[] }) { }
}

export class LoadMatchListFail implements Action {
  readonly type = BaseActionTypes.LoadMatchListFail;
}

export type BaseActions = LoadSummoner
  | LoadSummonerSuccess
  | LoadSummonerFail
  | LoadMatchList
  | LoadMatchListSuccess
  | LoadMatchListFail;
