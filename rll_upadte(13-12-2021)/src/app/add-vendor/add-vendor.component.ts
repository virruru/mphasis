import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Vendor } from '../vendor';
import { VendorService } from '../vendor.service';

@Component({
  selector: 'app-add-vendor',
  templateUrl: './add-vendor.component.html',
  styleUrls: ['./add-vendor.component.css']
})
export class AddVendorComponent implements OnInit {

  vendordetails:Vendor;
  isFormSubmitted : boolean;

  signup(signupForm : NgForm) {

    if (signupForm.invalid) {
      if(this.isFormSubmitted == false){
        alert("Enter Details ");
      }
    }
    else{
    this.isFormSubmitted = true;
      this._vendorService.addVendor(this.vendordetails).subscribe(x => {
      });
      alert("Vendor Registration Successful!");
    
   }
 

    }

  constructor(private _vendorService:VendorService) {
this.vendordetails=new Vendor();
this.isFormSubmitted = false;
   }
  //  addVendor(){

  //    this._vendorService.addVendor(this.vendordetails).subscribe(x => {
  //    });
  //    alert("Vendor added");
   
  // }

  

  ngOnInit(): void {
  }

}
