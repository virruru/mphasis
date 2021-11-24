import { Component, OnInit } from '@angular/core';
import { Vendor } from '../vendor';
import { VendorService } from '../vendor.service';

@Component({
  selector: 'app-add-vendor',
  templateUrl: './add-vendor.component.html',
  styleUrls: ['./add-vendor.component.css']
})
export class AddVendorComponent implements OnInit {

  vendordetails:Vendor;
  constructor(private _vendorService:VendorService) {
this.vendordetails=new Vendor();
   }
   addVendor(){

     this._vendorService.addVendor(this.vendordetails).subscribe(x => {
     });
     alert("Vendor added");
   
  }

  ngOnInit(): void {
  }

}
