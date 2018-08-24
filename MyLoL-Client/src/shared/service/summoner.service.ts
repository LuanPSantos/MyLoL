import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Summoner } from '../model/summoner.model';

@Injectable()
export class SummonerService {
  constructor(private http: HttpClient) {

  }

  public getSummonerByName(name: string): Observable<Summoner> {
    return this.http.get<Summoner>('http://localhost:8080/summoner/' + name);
  }
}
