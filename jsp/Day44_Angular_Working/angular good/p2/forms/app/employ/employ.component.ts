import { Component, OnInit } from '@angular/core';
import { Employ } from '../employ';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-employ',
  templateUrl: './employ.component.html',
  styleUrls: ['./employ.component.css']
})
export class EmployComponent implements OnInit {

  isValidFormSubmitted=false;
  employ = new Employ();

 onFormSubmit(form:NgForm) {
   this.isValidFormSubmitted=false;
   if(form.invalid){
     return;
   }
   this.isValidFormSubmitted=true;
 }
  constructor() { }

  ngOnInit() {
  }

}
