import { Injectable } from '@angular/core';
import { Http, Response } from '@angular/http';
import { Observable } from 'rxjs';
import { map } from 'rxjs/operators';
import { Customer } from './customer';

@Injectable({
  providedIn: 'root'
})
export class CustomerService {



  constructor(private _http : Http) { }

  loginCustomer(username : string,password:string) : Observable<string>{
    return this._http.get("http://localhost:8080/customerAuthenticate/"+username +"/"+password)
    .pipe(map((res: Response) => res.json()));
  }


  showCustomers() : Observable<Customer[]> {
    return this._http.get("http://localhost:8080/showcustomer")
    .pipe(map((res: Response) => res.json()));
  }

  searchCustomer(cid : number) : Observable<Customer> {
    return this._http.get("http://localhost:8080/customer/"+cid)
    .pipe(map((res: Response) => res.json()));
  }

  showCustomerInfo(username : string) : Observable<Customer>{
    return this._http.get("http://localhost:8080/showonecustomer/"+username )
    .pipe(map((res: Response) => res.json()));
  }

}
