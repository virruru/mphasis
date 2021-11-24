import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { Customer } from '../customer';
import { Wallet } from '../wallet';
import { WalletService } from '../wallet.service';

@Component({
  selector: 'app-customer-wallets',
  templateUrl: './customer-wallets.component.html',
  styleUrls: ['./customer-wallets.component.css']
})
export class CustomerWalletsComponent implements OnInit {

  user:string
  customer : Observable<Customer>
  cus : Customer
  walletarr : Observable<Wallet[]>
  
  constructor(private _service : WalletService) { 
    this.user = localStorage.getItem("customer")
    this.cus = localStorage.getItem('customerData')?JSON.parse(localStorage.getItem('customerData')):[]
    //alert(this.ven.ven_id)
    this.walletarr = this._service.showCustomerWallets(this.cus.cus_id)

   //this.vendor = this._service.searchVendor(this.ven.ven_id)
   

  }

  ngOnInit(): void {
  }

}
