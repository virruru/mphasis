import { Component, OnInit } from '@angular/core';
import { Customer } from '../customer';
import { CustomerService } from '../customer.service';

@Component({
  selector: 'app-add-customer',
  templateUrl: './add-customer.component.html',
  styleUrls: ['./add-customer.component.css']
})
export class AddCustomerComponent implements OnInit {
  customerdetails:Customer;
  constructor(private _customerService:CustomerService) {
this.customerdetails=new Customer();
   }
   addCustomer(){

     this._customerService.addCustomer(this.customerdetails).subscribe(x => {
     });
     alert("customer added");
   
  }

  ngOnInit(): void {
  }

}
