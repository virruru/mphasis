import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Observable } from 'rxjs';
import { Vendor } from '../vendor';
import { VendorService } from '../vendor.service';

@Component({
  selector: 'app-vendorlogin',
  templateUrl: './vendorlogin.component.html',
  styleUrls: ['./vendorlogin.component.css']
})
export class VendorloginComponent implements OnInit {

  username : string
  password : string
  vendor : string
  status : Observable<string>
  venlogin(){
    
      this._service.loginVendor(this.username,this.password).subscribe(x=>
      {
        if(x == "1"){
          this._router.navigate(['VendorDashboard']);
          localStorage.setItem("vendor",this.username)
        }
        else{
          alert("Invalid Username or Password")
        }
      });
  }

  
  constructor(private _service : VendorService,private _router : Router) { }

  ngOnInit(): void {
  }

}
