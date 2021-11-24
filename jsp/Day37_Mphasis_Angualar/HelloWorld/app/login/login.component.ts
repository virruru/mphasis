import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  userName : string;
  passWord : string;

  login() {
    if (this.userName=="Hexaware" && this.passWord=="Hexaware") {
   //   alert("Correct")
   this._router.navigate(['/menu']);
    } else {
      alert("Invalid")
    }
  }
  constructor(private _router : Router) { }

  ngOnInit(): void {
  }

}
