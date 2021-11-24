import { Component, OnInit } from '@angular/core';
import { Menu } from '../menu';
import { MenuService } from '../menu.service';

@Component({
  selector: 'app-add-menu',
  templateUrl: './add-menu.component.html',
  styleUrls: ['./add-menu.component.css']
})
export class AddMenuComponent implements OnInit {
  menudetails:Menu;
  constructor(private _menuService:MenuService) {
this.menudetails=new Menu();
   }
   addMenu(){

     this._menuService.addMenu(this.menudetails).subscribe(x => {
     });
     alert("menu added");
   
  }
 

  ngOnInit(): void {
  }

}
