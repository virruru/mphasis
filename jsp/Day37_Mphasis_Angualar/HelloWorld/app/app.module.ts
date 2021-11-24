import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FirstComponent } from './first/first.component';
import { SecondComponent } from './second/second.component';
import { ThirdComponent } from './third/third.component';
import { TwoWayComponent } from './two-way/two-way.component';
import { CalcComponent } from './calc/calc.component';
import { ConditionExComponent } from './condition-ex/condition-ex.component';
import { LoopExComponent } from './loop-ex/loop-ex.component';
import { EmployComponent } from './employ/employ.component';
import { EmployDropDownComponent } from './employ-drop-down/employ-drop-down.component';
import { MenuComponent } from './menu/menu.component';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './login/login.component';

const appRoutes : Routes = 
[
  {path:'',component:LoginComponent},
  {path:'menu',component:MenuComponent},
  {path:'menu',component:MenuComponent,
   children : 
   [
     {path:'first',component:FirstComponent,outlet:'hexaware'},
     {path:'second',component:SecondComponent,outlet:'hexaware'},
     {path:'third',component:ThirdComponent,outlet:'hexaware'},
     {path:'condition',component:ConditionExComponent,outlet:'hexaware'},
     {path:'calc',component:CalcComponent,outlet:'hexaware'},
     {path:'loop',component:LoopExComponent,outlet:'hexaware'},
     {path:'twoway',component:TwoWayComponent,outlet:'hexaware'},
     {path:'employ',component:EmployComponent,outlet:'hexaware'},
     {path:'employdropdown',component:EmployDropDownComponent,outlet:'hexaware'},

   ]
  }
]
// const appRoutes : Routes =
// [
//   {path:'first',component:FirstComponent},
//   {path:'second',component:SecondComponent},
//   {path:'third',component:ThirdComponent},
//   {path:'condition',component:ConditionExComponent},
//   {path:'calc',component:CalcComponent},
//   {path:'loop',component:LoopExComponent},
//   {path:'twoway',component:TwoWayComponent},
//   {path:'employ',component:EmployComponent},
//   {path:'employdropdown',component:EmployDropDownComponent},
//   {path:'',component:MenuComponent}
// ]
@NgModule({
  declarations: [
    AppComponent,
    FirstComponent,
    SecondComponent,
    ThirdComponent,
    TwoWayComponent,
    CalcComponent,
    ConditionExComponent,
    LoopExComponent,
    EmployComponent,
    EmployDropDownComponent,
    MenuComponent,
    LoginComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    RouterModule.forRoot(appRoutes),
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
