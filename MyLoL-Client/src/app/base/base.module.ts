import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { NothingComponent } from '../nothing/nothing.component';
import { HomeComponent } from '../home/home.component';
import { ProfileComponent } from '../profile/profile.component';
import { HistoricComponent } from '../historic/historic.component';

import {
  InputTextModule,
  CardModule,
  ButtonModule,
  ProgressSpinnerModule
} from 'primeng/primeng';
import { RouterModule } from '@angular/router';
import { StoreModule } from '@ngrx/store';
import * as fromBase from './reducers/base.reducer';
import { EffectsModule } from '@ngrx/effects';
import { BaseEffects } from './effects/base.effects';
import { SummonerService } from '../../shared/service/summoner.service';
import { MatchService } from '../../shared/service/match.service';

@NgModule({
  imports: [
    CommonModule,
    InputTextModule,
    CardModule,
    ButtonModule,
    RouterModule,
    ProgressSpinnerModule,
    StoreModule.forFeature('base', fromBase.reducer),
    EffectsModule.forFeature([BaseEffects])
  ],
  declarations: [
    HomeComponent,
    ProfileComponent,
    HistoricComponent,
    NothingComponent
  ],
  providers: [
    SummonerService,
    MatchService
  ]
})
export class BaseModule { }
