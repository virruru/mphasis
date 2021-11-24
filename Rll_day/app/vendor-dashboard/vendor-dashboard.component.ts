import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { OrdersService } from '../orders.service';
import { Vendor } from '../vendor';
import { VendorService } from '../vendor.service';

@Component({
  selector: 'app-vendor-dashboard',
  templateUrl: './vendor-dashboard.component.html',
  styleUrls: ['./vendor-dashboard.component.css']
})
export class VendorDashboardComponent implements OnInit {

  user : string
  vendor : Observable<Vendor>
  ven : Vendor
  constructor( private _service : VendorService) {

    this.user = localStorage.getItem("vendor")
    this._service.showVendorInfo(this.user).subscribe(x=>{
      this.ven = x
      localStorage.setItem('vendorData',JSON.stringify(x))
    })

   }

  ngOnInit(): void {
  }

}
