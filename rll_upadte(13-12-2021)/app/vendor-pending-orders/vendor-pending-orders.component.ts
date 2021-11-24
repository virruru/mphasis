import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { Orders } from '../orders';
import { OrdersService } from '../orders.service';
import { Vendor } from '../vendor';

@Component({
  selector: 'app-vendor-pending-orders',
  templateUrl: './vendor-pending-orders.component.html',
  styleUrls: ['./vendor-pending-orders.component.css']
})
export class VendorPendingOrdersComponent implements OnInit {

  user:string
  vendor : Observable<Vendor>
  ven : Vendor
  orderarr : Observable<Orders[]>
  
  constructor(private _service : OrdersService) { 
    this.user = localStorage.getItem("vendor")
    this.ven = localStorage.getItem('vendorData')?JSON.parse(localStorage.getItem('vendorData')):[]
    //alert(this.ven.ven_id)
    this.orderarr = this._service.showVendorPendingOrder(this.ven.ven_id)

   //this.vendor = this._service.searchVendor(this.ven.ven_id)
    
   

  }


  ngOnInit(): void {
  }

}
