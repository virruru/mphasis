import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { Vendor } from '../vendor';
import { VendorService } from '../vendor.service';

@Component({
  selector: 'app-vendor-info',
  templateUrl: './vendor-info.component.html',
  styleUrls: ['./vendor-info.component.css']
})
export class VendorInfoComponent implements OnInit {

  user:string
  vendor : Observable<Vendor>
  ven : Vendor

  constructor(private _service : VendorService) { 
    this.user = localStorage.getItem("vendor")
    this.ven = localStorage.getItem('vendorData')?JSON.parse(localStorage.getItem('vendorData')):[]
    //alert(this.ven.ven_id)
    this.vendor = this._service.showVendorInfo(this.user)

  }

  ngOnInit(): void {
  }

}
