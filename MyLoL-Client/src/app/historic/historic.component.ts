import { Component, OnInit } from '@angular/core';
import { Store, select } from '@ngrx/store';
import { AppState } from '../reducers';
import { selectMatchList } from '../base/reducers/base.reducer';
import { Observable } from 'rxjs';
import { MatchItem } from '../../shared/model/match-item.moduel';

@Component({
  selector: 'app-historic',
  templateUrl: './historic.component.html',
  styleUrls: ['./historic.component.css']
})
export class HistoricComponent implements OnInit {

  matchList$: Observable<MatchItem[]>;

  constructor(private store: Store<AppState>) { }

  ngOnInit() {
    this.matchList$ = this.store.pipe(
      select(selectMatchList)
    );
  }

}
