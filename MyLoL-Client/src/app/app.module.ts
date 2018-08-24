import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { ProfileComponent } from './profile/profile.component';
import { HistoricComponent } from './historic/historic.component';
import { NothingComponent } from './nothing/nothing.component';

import {
  InputTextModule,
  CardModule,
  ButtonModule

} from 'primeng/primeng';
import { SummonerService } from '../shared/service/summoner.service';
import { StoreDevtoolsModule } from '@ngrx/store-devtools';
import { environment } from '../environments/environment';

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
    CardModule,
    ButtonModule,
    HttpClientModule,
    !environment.production ? StoreDevtoolsModule.instrument() : [],
  ],
  providers: [SummonerService],
  bootstrap: [AppComponent]
})
export class AppModule { }
