import { Injectable } from '@angular/core';
import { Http,Response } from '@angular/http';
import { Observable } from 'rxjs';
import { map } from 'rxjs/operators';
import { Wallet } from './wallet';

@Injectable({
  providedIn: 'root'
})
export class WalletService {

  constructor(private _http : Http) { }


  showCustomerWallets(oid : number) : Observable<Wallet[]> {
    return this._http.get("http://localhost:8080/showCustomerWallets/"+oid)
    .pipe(map((res: Response) => res.json()));
  }

  
  showCustomerWallet(oid : number,waltype:string) : Observable<Wallet> {
    return this._http.get("http://localhost:8080/showCustomerWallet/"+oid+"/"+waltype)
    .pipe(map((res: Response) => res.json()));
  }
}
