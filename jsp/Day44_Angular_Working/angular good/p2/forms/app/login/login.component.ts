import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  userName : string;
  passWord : string; 
  isFormSubmitted : boolean;
  login(loginForm : NgForm) {
    this.isFormSubmitted = false;
    if (loginForm.invalid) {
      return;
    }
    this.isFormSubmitted = true;
    if (this.userName=="Hexaware" && this.passWord=="Hexaware") {
      alert("Correct Credentials...");
    } else {
      alert("Invalid Credentials...");
    }
  }
  constructor() { }

  ngOnInit() {
  }

}
