import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class DemoService {

  sayHello() : string {
    return "Welcome to Angular Services...";
  }

  topic() : string {
    return "Angular 8 Services Topic Going on...";
  }
  
  constructor() { }
}
