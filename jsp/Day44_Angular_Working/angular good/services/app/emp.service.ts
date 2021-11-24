import { Injectable } from '@angular/core';
import { Http, Response } from '@angular/http';
import { Observable } from 'rxjs';
// import { User } from './user';
import 'rxjs/add/operator/map';
import { Emp } from './emp';

@Injectable({
  providedIn: 'root'
})
export class EmpService {

  showEmploy() : Observable<Emp[]> {
    return this._http.get("https://localhost:44320/api/EMps").
    map((res:Response)=>res.json())

  }
  constructor(private _http : Http) { }
}
