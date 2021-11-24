import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { Customer } from '../customer';
import { CustomerService } from '../customer.service';

@Component({
  selector: 'app-cutomer-search',
  templateUrl: './cutomer-search.component.html',
  styleUrls: ['./cutomer-search.component.css']
})
export class CutomerSearchComponent implements OnInit {


 cid : number
 customer : Observable<Customer>
  search(){
    this.customer = this._service.searchCustomer(this.cid)
  }
  constructor(private _service : CustomerService) { }

  ngOnInit(): void {
  }

}
