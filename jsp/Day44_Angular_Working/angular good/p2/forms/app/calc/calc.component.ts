import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-calc',
  templateUrl: './calc.component.html',
  styleUrls: ['./calc.component.css']
})
export class CalcComponent implements OnInit {

  firstNo : number;
  secondNo : number;
  result : number;
  isValidFormSubmitted=false;
  calc(form : NgForm) {
    if(form.invalid) {
      return;
    } 
    this.isValidFormSubmitted=true;
    if (this.isValidFormSubmitted==true) {
      this.result = this.firstNo + this.secondNo;
    }
      
  }
  constructor() { }

  ngOnInit() {
  }

}
