import { LeaguePosition } from './league-position.model';

export class Summoner {
  public id: number;
  public accountId: number;
  public name: string;
  public profileIconURL: string;
  public summonerLevel: number;
  public leaguePositions: LeaguePosition[];
  public splashURL;
}
