import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { User } from '../user';
import { UserService } from '../user.service';

@Component({
  selector: 'app-user-search',
  templateUrl: './user-search.component.html',
  styleUrls: ['./user-search.component.css']
})
export class UserSearchComponent implements OnInit {

  uid : number;
  user : Observable<User>;

  search() {
    this.user=this._service.searchUser(this.uid);
  }
  constructor(private _service : UserService) 
  { 
    
  }

  ngOnInit(): void {
  }

}
