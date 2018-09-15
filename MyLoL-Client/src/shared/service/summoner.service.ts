import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Summoner } from '../model/summoner.model';
import { environment } from '../../environments/environment';

const BASE_URL = environment.BASE_URL;

@Injectable()
export class SummonerService {

  CONTEXT = 'summoner/';

  constructor(private http: HttpClient) {

  }

  public getSummonerByName(name: string): Observable<Summoner> {
    return this.http.get<Summoner>(BASE_URL + this.CONTEXT + name);
  }
}
