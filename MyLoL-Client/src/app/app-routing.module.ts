import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { ProfileComponent } from './profile/profile.component';
import { NothingComponent } from './nothing/nothing.component';
import { HistoricComponent } from './historic/historic.component';

const routes: Routes = [
  {
    path: 'home', component: HomeComponent, children: [
      { path: 'profile', component: ProfileComponent, outlet: 'top' },
      { path: 'nothing', component: NothingComponent, outlet: 'top' },
      { path: 'historic', component: HistoricComponent, outlet: 'bottom' }
    ]
  },
  { path: '**', redirectTo: 'home' }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
