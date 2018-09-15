import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AppState } from '../reducers';
import { Store, select } from '@ngrx/store';
import { LoadSummoner } from '../base/actions/base.actions';
import { selectLoadingSummoner, selectLoadedSummoner, selectLoadingMatchList } from '../base/reducers/base.reducer';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  loadingSummoner$: Observable<boolean>;
  loadginMatchList$: Observable<boolean>;

  constructor(private router: Router, private store: Store<AppState>) { }

  ngOnInit() {
    this.loadingSummoner$ = this.store.pipe(
      select(selectLoadingSummoner)
    );

    this.loadginMatchList$ = this.store.pipe(
      select(selectLoadingMatchList)
    );

    this.store.pipe(
      select(selectLoadedSummoner)
    ).subscribe((loaded) => {
      if (loaded) {
        this.router.navigate(['/home', { outlets: { top: ['profile'], bottom: ['historic'] } }]);
      } else {
        this.router.navigate(['/home', { outlets: { top: ['nothing'], bottom: null } }]);
      }
    });
  }

  search(event, name) {
    if (event.keyCode === 13) {
      this.store.dispatch(new LoadSummoner({ name }));
    }
  }
}
