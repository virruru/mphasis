import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Customer } from '../customer';
import { CustomerService } from '../customer.service';

@Component({
  selector: 'app-add-customer',
  templateUrl: './add-customer.component.html',
  styleUrls: ['./add-customer.component.css']
})
export class AddCustomerComponent implements OnInit {

  customerdetails:Customer;
  isFormSubmitted : boolean;

  signup(signupForm : NgForm) {

    if (signupForm.invalid) {
      if(this.isFormSubmitted == false){
        alert("Enter Details ");
      }
    }
    else{
    this.isFormSubmitted = true;
    this._customerService.addCustomer(this.customerdetails).subscribe(x => {
    });
    alert("Customer Registration Successful!");
  }
}
    
  constructor(private _customerService:CustomerService) {
this.customerdetails=new Customer();
this.isFormSubmitted = false;
   }

  //    this._customerService.addCustomer(this.customerdetails).subscribe(x => {
  //    });
  //    alert("customer added");
   
  // }

  ngOnInit(): void {
  }

}
