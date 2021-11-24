import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { Customer } from '../customer';
import { Orders } from '../orders';
import { OrdersService } from '../orders.service';

@Component({
  selector: 'app-customer-orders',
  templateUrl: './customer-orders.component.html',
  styleUrls: ['./customer-orders.component.css']
})
export class CustomerOrdersComponent implements OnInit {

  user:string
  customer : Observable<Customer>
  cus : Customer
  orderarr : Observable<Orders[]>
  
  constructor(private _service : OrdersService) { 
    this.user = localStorage.getItem("customer")
    this.cus = localStorage.getItem('customerData')?JSON.parse(localStorage.getItem('customerData')):[]
    //alert(this.ven.ven_id)
    this.orderarr = this._service.showCustomerOrder(this.cus.cus_id)

   //this.vendor = this._service.searchVendor(this.ven.ven_id)
   

  }

  ngOnInit(): void {
  }

}
