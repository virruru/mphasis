import { Injectable } from '@angular/core';
import { Http, Response } from '@angular/http';
import { Observable } from 'rxjs';
import { map } from 'rxjs/operators';
import { Vendor } from './vendor';

@Injectable({
  providedIn: 'root'
})
export class VendorService {

  constructor(private _http : Http) { }

  loginVendor(username : string,password:string) : Observable<string> {
    return this._http.get("http://localhost:8080/vendorAuthenticate/"+username+"/"+password)
    .pipe(map((res: Response) => res.json()));
  }
  addVendor(vendor:Vendor) : Observable<string>  {
    return this._http.post("http://localhost:8080/addVendor/",vendor)
    .pipe(map((res : Response) => res.text()));
  }
  showVendors() : Observable<Vendor[]> {
    return this._http.get("http://localhost:8080/showvendor")
    .pipe(map((res: Response) => res.json()));
  }

  searchVendor(vid : number) : Observable<Vendor> {
    return this._http.get("http://localhost:8080/vendor/"+vid)
    .pipe(map((res: Response) => res.json()));
  }

  showVendorInfo(username : string) : Observable<Vendor>{
    return this._http.get("http://localhost:8080/showonevendor/"+username )
    .pipe(map((res: Response) => res.json()));
  }


}
