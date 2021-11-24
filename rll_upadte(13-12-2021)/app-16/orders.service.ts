import { Injectable } from '@angular/core';
import { Http, Response } from '@angular/http';
import { Observable } from 'rxjs';
import { map } from 'rxjs/operators';
import { Orders } from './orders';

@Injectable({
  providedIn: 'root'
})
export class OrdersService {

  constructor(private _http : Http) { }

  placeOrder(orders : Orders) : Observable<string> {
    return this._http.post("http://localhost:8080/placeOrder/",orders)
    .pipe(map((res : Response) => res.text()));
  }

  showVendorOrder(oid : number) : Observable<Orders[]> {
    return this._http.get("http://localhost:8080/vendorOrders/"+oid)
    .pipe(map((res: Response) => res.json()));
  }

  
  showVendorPendingOrder(oid : number) : Observable<Orders[]> {
    return this._http.get("http://localhost:8080/vendorPendingOrders/"+oid)
    .pipe(map((res: Response) => res.json()));
  }

  showCustomerOrder(oid : number) : Observable<Orders[]> {
    return this._http.get("http://localhost:8080/customerOrders/"+oid)
    .pipe(map((res: Response) => res.json()));
  }
  
  showCustomerPendingOrder(oid : number) : Observable<Orders[]> {
    return this._http.get("http://localhost:8080/customerPendingOrders/"+oid)
    .pipe(map((res: Response) => res.json()));
  }

}
