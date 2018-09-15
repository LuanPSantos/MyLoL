import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders, HttpParams } from '@angular/common/http';
import { Observable } from 'rxjs';
import { environment } from '../../environments/environment';
import { MatchItem } from '../model/match-item.moduel';

const BASE_URL = environment.BASE_URL;

@Injectable()
export class MatchService {
  CONTEXT = 'match/';

  constructor(private http: HttpClient) {

  }

  public getMatchList(accountId: number, beginIndex: number, endIndex: number): Observable<MatchItem[]> {
    return this.http.get<MatchItem[]>(BASE_URL + this.CONTEXT + accountId, {
      params: {
        beginIndex: beginIndex.toString(),
        endIndex: endIndex.toString()
      }
    });
  }
}
