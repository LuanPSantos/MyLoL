import { BaseActions, BaseActionTypes } from '../actions/base.actions';
import { Summoner } from '../../../shared/model/summoner.model';
import { createFeatureSelector, createSelector } from '@ngrx/store';
import { MatchItem } from '../../../shared/model/match-item.moduel';

export interface BaseState {
  summoner: Summoner;
  loadingSummoner: boolean;
  loadedSummoner: boolean;
  matchList: MatchItem[];
  biginIndex: number;
  endIndex: number;
  loadedMatchList: boolean;
  loadingMatchList: boolean;
}

export const initialState: BaseState = {
  summoner: null,
  loadedSummoner: false,
  loadingSummoner: false,
  biginIndex: 0,
  endIndex: 0,
  loadedMatchList: false,
  loadingMatchList: false,
  matchList: []
};

export function reducer(state = initialState, action: BaseActions): BaseState {
  switch (action.type) {

    case BaseActionTypes.LoadSummoner:
      return {
        ...state,
        loadingSummoner: true,
        loadedSummoner: false
      };

    case BaseActionTypes.LoadSummonerSuccess:
      return {
        ...state,
        summoner: action.payload.summoner,
        loadingSummoner: false,
        loadedSummoner: true
      };

    case BaseActionTypes.LoadSummonerFail:
      return {
        ...state,
        loadingSummoner: false,
        loadedSummoner: false
      };

    case BaseActionTypes.LoadMatchList:
      return {
        ...state,
        loadingMatchList: true,
        loadedMatchList: false
      };

    case BaseActionTypes.LoadMatchListSuccess:
      return {
        ...state,
        matchList: action.payload.matchList,
        loadingMatchList: false,
        loadedMatchList: true
      };

    case BaseActionTypes.LoadMatchListFail:
      return {
        ...state,
        loadingMatchList: false,
        loadedMatchList: false
      };


    default:
      return state;
  }
}

export const selectState = createFeatureSelector<BaseState>('base');

export const selectSummoner = createSelector(
  selectState,
  baseState => baseState.summoner
);

export const selectLoadingSummoner = createSelector(
  selectState,
  baseState => baseState.loadingSummoner
);

export const selectLoadedSummoner = createSelector(
  selectState,
  baseState => baseState.loadedSummoner
);

export const selectMatchList = createSelector(
  selectState,
  baseState => baseState.matchList
);

export const selectLoadingMatchList = createSelector(
  selectState,
  baseState => baseState.loadingMatchList
);

export const selectLoadedMatchList = createSelector(
  selectState,
  baseState => baseState.loadedMatchList
);
