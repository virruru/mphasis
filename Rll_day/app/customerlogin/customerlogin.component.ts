import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Observable } from 'rxjs';
import { Customer } from '../customer';
import { CustomerService } from '../customer.service';

@Component({
  selector: 'app-customerlogin',
  templateUrl: './customerlogin.component.html',
  styleUrls: ['./customerlogin.component.css']
})
export class CustomerloginComponent implements OnInit {

  username : string
  password : string
  status : Observable<string>
  cuslogin(){
    
      this._service.loginCustomer(this.username,this.password).subscribe(x=>
      {
        if(x == "1"){
          this._router.navigate(['CustomerDashboard']);
          localStorage.setItem("customer",this.username)
        }
        else{
          alert("Invalid Username or Password")
        }
        
      });

  }

  constructor(private _service : CustomerService,private _router : Router) {
    
   }

  ngOnInit(): void {
  }

}
