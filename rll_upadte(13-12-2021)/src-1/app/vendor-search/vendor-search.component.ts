import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { Vendor } from '../vendor';
import { VendorService } from '../vendor.service';

@Component({
  selector: 'app-vendor-search',
  templateUrl: './vendor-search.component.html',
  styleUrls: ['./vendor-search.component.css']
})
export class VendorSearchComponent implements OnInit {

  vid : number
  vendor : Observable<Vendor>
  search(){
    this.vendor = this._service.searchVendor(this.vid)
  }
  constructor(private _service : VendorService) { }

  ngOnInit(): void {
  }

}
