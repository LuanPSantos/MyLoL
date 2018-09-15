import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { Summoner } from '../../shared/model/summoner.model';
import { Store, select } from '@ngrx/store';
import { AppState } from '../reducers';
import { selectSummoner } from '../base/reducers/base.reducer';

@Component({
  selector: 'app-profile',
  templateUrl: './profile.component.html',
  styleUrls: ['./profile.component.css']
})
export class ProfileComponent implements OnInit {

  summoner$: Observable<Summoner>;

  constructor(private store: Store<AppState>) { }

  ngOnInit() {
    this.summoner$ = this.store.pipe(
      select(selectSummoner)
    );
  }
}
