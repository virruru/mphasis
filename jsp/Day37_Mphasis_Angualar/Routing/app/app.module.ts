import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FirstComponent } from './first/first.component';
import { SecondComponent } from './second/second.component';
import { ThirdComponent } from './third/third.component';
import { TwoWayComponent } from './two-way/two-way.component';
import { EventDemoComponent } from './event-demo/event-demo.component';
import { CalcComponent } from './calc/calc.component';
import { EmployComponent } from './employ/employ.component';
import { EmployDropDownComponent } from './employ-drop-down/employ-drop-down.component';
import { MenuComponent } from './menu/menu.component';
import { RouterModule, Routes } from '@angular/router';

const appRoutes : Routes = 
[
  {path:'',component:MenuComponent},
  {path:'menu',component:MenuComponent},
  {path:'menu',component:MenuComponent,children:[
    {path:'first',component:FirstComponent,outlet:'mphasis'},
    {path:'second',component:SecondComponent,outlet:'mphasis'},
    {path:'third',component:ThirdComponent,outlet:'mphasis'},
    {path:'twoway',component:TwoWayComponent,outlet:'mphasis'},
    {path:'event',component:EventDemoComponent,outlet:'mphasis'},
    {path:'calc',component:CalcComponent,outlet:'mphasis'},
    {path:'employ',component:EmployComponent,outlet:'mphasis'},
    {path:'employdropdown',component:EmployDropDownComponent,outlet:'mphasis'},  
  ]}
]

@NgModule({
  declarations: [
    AppComponent,
    FirstComponent,
    SecondComponent,
    ThirdComponent,
    TwoWayComponent,
    EventDemoComponent,
    CalcComponent,
    EmployComponent,
    EmployDropDownComponent,
    MenuComponent
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot(appRoutes),
    FormsModule,
    
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
