import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { Emp } from '../emp';
import { EmpService } from '../emp.service';

@Component({
  selector: 'app-emp',
  templateUrl: './emp.component.html',
  styleUrls: ['./emp.component.css']
})
export class EmpComponent implements OnInit {

  emps : Observable<Emp[]>;
  constructor(private _empService : EmpService) { 
    this.emps=this._empService.showEmploy();
  }

  ngOnInit(): void {
  }

}
