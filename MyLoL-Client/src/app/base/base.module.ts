import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { NothingComponent } from '../nothing/nothing.component';
import { HomeComponent } from '../home/home.component';
import { ProfileComponent } from '../profile/profile.component';
import { HistoricComponent } from '../historic/historic.component';

import {
  InputTextModule,
  CardModule,
  ButtonModule
} from 'primeng/primeng';
import { RouterModule } from '@angular/router';

@NgModule({
  imports: [
    CommonModule,
    InputTextModule,
    CardModule,
    ButtonModule,
    RouterModule
  ],
  declarations: [
    HomeComponent,
    ProfileComponent,
    HistoricComponent,
    NothingComponent
  ]
})
export class BaseModule { }
