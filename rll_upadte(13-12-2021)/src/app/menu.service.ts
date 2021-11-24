import { Injectable } from '@angular/core';
import { Http,Response } from '@angular/http';
import { Observable } from 'rxjs';
import { Menu } from './menu';
import { map } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class MenuService {
  constructor(private _http : Http) { }


  showMenu() : Observable<Menu[]> {
    return this._http.get("http://localhost:8080/showMenu/")
    .pipe(map((res: Response) => res.json()));
  }
  searchMenu(vid : number) : Observable<Menu> {
    return this._http.get("http://localhost:8080/menu/"+vid)
    .pipe(map((res: Response) => res.json()));
  }
}
