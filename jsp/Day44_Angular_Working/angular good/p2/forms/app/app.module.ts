import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { Form1Component } from './form1/form1.component';
import { CalcComponent } from './calc/calc.component';
import { LoginComponent } from './login/login.component';
import { EmployComponent } from './employ/employ.component';

@NgModule({
  declarations: [
    AppComponent,
    Form1Component,
    CalcComponent,
    LoginComponent,
    EmployComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
