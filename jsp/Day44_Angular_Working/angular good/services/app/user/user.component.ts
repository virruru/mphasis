import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { User } from '../user';
import { UserService } from '../user.service';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {

  searchString : string;
  users : Observable<User[]>;

  constructor(private _userService : UserService) {
    this.users=this._userService.showUsers();
   }

  ngOnInit(): void {
  }

}
