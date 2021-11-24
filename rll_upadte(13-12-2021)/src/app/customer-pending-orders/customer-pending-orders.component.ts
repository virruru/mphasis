import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { Customer } from '../customer';
import { Orders } from '../orders';
import { OrdersService } from '../orders.service';

@Component({
  selector: 'app-customer-pending-orders',
  templateUrl: './customer-pending-orders.component.html',
  styleUrls: ['./customer-pending-orders.component.css']
})
export class CustomerPendingOrdersComponent implements OnInit {

  user:string
  customer : Observable<Customer>
  cus : Customer
  orderarr : Observable<Orders[]>
  
  constructor(private _service : OrdersService) { 
    this.user = localStorage.getItem("customer")
    this.cus = localStorage.getItem('customerData')?JSON.parse(localStorage.getItem('customerData')):[]
    //alert(this.ven.ven_id)
    this.orderarr = this._service.showCustomerPendingOrder(this.cus.cus_id)

   //this.vendor = this._service.searchVendor(this.ven.ven_id)
    
   

  }

  ngOnInit(): void {
  }

}
