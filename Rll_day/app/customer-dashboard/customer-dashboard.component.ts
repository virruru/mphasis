import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { Customer } from '../customer';
import { CustomerService } from '../customer.service';

@Component({
  selector: 'app-customer-dashboard',
  templateUrl: './customer-dashboard.component.html',
  styleUrls: ['./customer-dashboard.component.css']
})
export class CustomerDashboardComponent implements OnInit {

  user : string
  customer : Observable<Customer>
  cus : Customer
  constructor( private _service : CustomerService) {

    this.user = localStorage.getItem("customer")
   
   this._service.showCustomerInfo(this.user).subscribe(x=>{
    this.cus = x
    localStorage.setItem('customerData',JSON.stringify(x))
  })

   }

  ngOnInit(): void {
  }

}
