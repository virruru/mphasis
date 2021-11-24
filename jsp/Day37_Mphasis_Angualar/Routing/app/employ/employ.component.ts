import { Component, OnInit } from '@angular/core';
import {Employ} from '../employ'
@Component({
  selector: 'app-employ',
  templateUrl: './employ.component.html',
  styleUrls: ['./employ.component.css']
})
export class EmployComponent implements OnInit {

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
