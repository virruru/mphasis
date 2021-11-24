import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { Customer } from '../customer';
import { Wallet } from '../wallet';
import { WalletService } from '../wallet.service';

@Component({
  selector: 'app-customer-wallet',
  templateUrl: './customer-wallet.component.html',
  styleUrls: ['./customer-wallet.component.css']
})
export class CustomerWalletComponent implements OnInit {
  
  
  waltype:string
  user:string
  customer : Observable<Customer>
  cus : Customer
  wallet : Observable<Wallet>
 search(){

  
  //alert(this.ven.ven_id)
  this.wallet = this._service.showCustomerWallet(this.cus.cus_id,this.waltype)


 }

  constructor(private _service : WalletService) { 
    this.user = localStorage.getItem("customer")
  this.cus = localStorage.getItem('customerData')?JSON.parse(localStorage.getItem('customerData')):[]
   //this.vendor = this._service.searchVendor(this.ven.ven_id)
   

  
}

  ngOnInit(): void {
  }

}
