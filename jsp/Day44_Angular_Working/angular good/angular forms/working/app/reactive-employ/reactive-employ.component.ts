import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } 
from '@angular/forms';

@Component({
  selector: 'app-reactive-employ',
  templateUrl: './reactive-employ.component.html',
  styleUrls: ['./reactive-employ.component.css']
})
export class ReactiveEmployComponent implements OnInit {

  isValidFormSubmitted: boolean = null;
	employForm = new FormGroup({
     empno: new FormControl('', Validators.required),
     name: new FormControl('', Validators.required),
     dept: new FormControl('', Validators.required),
     desig: new FormControl('', Validators.required),
     basic: new FormControl('', Validators.required),
  });
  onFormSubmit() {
    this.isValidFormSubmitted = false;
    if(this.employForm.invalid){
     return;	
    } 	
    this.isValidFormSubmitted = true;	
    console.log(this.employForm.valid);
 }

  constructor() { }

  ngOnInit(): void {
  }

}
