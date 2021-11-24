import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-condition-ex',
  templateUrl: './condition-ex.component.html',
  styleUrls: ['./condition-ex.component.css']
})
export class ConditionExComponent implements OnInit {

  status : boolean;
  ch1 : boolean;
  ch2 : boolean;
  ch3 : boolean;

  clearAll() {
   // alert("Hi")
   this.ch1=false;
   this.ch2=false;
  }
  constructor() { }

  ngOnInit(): void {
  }

}
