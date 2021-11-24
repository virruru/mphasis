import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { Vendor } from '../vendor';
import { VendorService } from '../vendor.service';

@Component({
  selector: 'app-vendor',
  templateUrl: './vendor.component.html',
  styleUrls: ['./vendor.component.css']
})
export class VendorComponent implements OnInit {

  vendors : Observable<Vendor[]>
  constructor(private _service : VendorService) { 
    this.vendors = this._service.showVendors();
  }

  ngOnInit(): void {
  }

}
