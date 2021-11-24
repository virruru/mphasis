import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { ObjectUnsubscribedError, Observable } from 'rxjs';
import { Customer } from '../customer';
import { Menu } from '../menu';
import { MenuService } from '../menu.service';
import { Orders } from '../orders';
import { OrdersService } from '../orders.service';
import { Vendor } from '../vendor';
import { VendorService } from '../vendor.service';
import { Wallet } from '../wallet';
import { WalletService } from '../wallet.service';

@Component({
  selector: 'app-place-order',
  templateUrl: './place-order.component.html',
  styleUrls: ['./place-order.component.css']
})
export class PlaceOrderComponent implements OnInit {
 cus:Customer;
 orderdetails:Orders;
 menu:Observable<Menu[]>;
 menufound:Menu;
 price:number;
 vendor:Observable<Vendor[]>;
 wallet:Observable<Wallet[]>;
msg:string;
 placeOrder() {
   alert("hello");
   this.orderdetails.ord_billamount= this.orderdetails.ord_quantity*this.price;
   this._orderService.placeOrder(this.orderdetails).subscribe(x => {
    this.msg = x;

  })
  alert(this.msg);
}
  constructor(private _menuService:MenuService, private _vendorService:VendorService, private _walletService:WalletService, private _orderService:OrdersService) {
    this.orderdetails= new Orders();
   
    this.cus = localStorage.getItem('customerData')?JSON.parse(localStorage.getItem('customerData')):[]
    alert(this.cus.cus_id);
    this.orderdetails.cus_id=this.cus.cus_id;
    this.menu=this._menuService.showMenu();
    this.vendor= this._vendorService.showVendors();
    this.wallet= this._walletService.showCustomerWallets(this.cus.cus_id);

   }
   showAmount(){
    alert(this.orderdetails.men_id);
    this._menuService.searchMenu(this.orderdetails.men_id).subscribe(x => {
      this.menufound = x;
      this.price= x.men_price;

      
    });
   }

  ngOnInit(): void {
  }

}
