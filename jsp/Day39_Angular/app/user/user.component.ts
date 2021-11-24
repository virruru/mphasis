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

  users : Observable<User[]>;
  constructor(private _service : UserService) {
    this.users = this._service.showUsers();
   }

  ngOnInit(): void {
  }

}
