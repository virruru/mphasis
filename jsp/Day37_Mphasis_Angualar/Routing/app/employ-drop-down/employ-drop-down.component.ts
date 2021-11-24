import { Component, OnInit } from '@angular/core';
import { Employ } from '../employ';

@Component({
  selector: 'app-employ-drop-down',
  templateUrl: './employ-drop-down.component.html',
  styleUrls: ['./employ-drop-down.component.css']
})
export class EmployDropDownComponent implements OnInit {

  empname : string;
  employs = [
    new Employ(1,"Aseem","Angular","Programmer",88244),
    new Employ(2,"Somendra","Java","Expert",99444),
    new Employ(3,"Uday","Angular","Programmer",98444),
    new Employ(4,"Pragathi","SpringBoot","Developer",78845),
    new Employ(5,"Sowmya","Java","TL",90444),
    new Employ(6,"Rahul","SpringBoot","Manager",98223),
  ]
  constructor() { }

  ngOnInit(): void {
  }

}
