import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { ProfileComponent } from './profile/profile.component';
import { HistoricComponent } from './historic/historic.component';
import { NothingComponent } from './nothing/nothing.component';

import {
  InputTextModule,
  CardModule

} from 'primeng/primeng';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    ProfileComponent,
    HistoricComponent,
    NothingComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    InputTextModule,
    CardModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
