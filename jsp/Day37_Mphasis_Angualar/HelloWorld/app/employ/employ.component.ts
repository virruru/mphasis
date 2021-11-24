import { Component, OnInit } from '@angular/core';
import { Employ } from '../employ';

@Component({
  selector: 'app-employ',
  templateUrl: './employ.component.html',
  styleUrls: ['./employ.component.css']
})
export class EmployComponent implements OnInit {

  employs = [
    new Employ(1,"Mansi","Angular","Programmer",88234),
    new Employ(2,"Satyam","Java","TL",90443),
    new Employ(3,"Aryan","Java","Sr. Programmer",91122),
    new Employ(4,"Neha","Angular","Admin",98223),
    new Employ(5,"Ashish","Spring","Consultant",90888),
    new Employ(6,"Anupriya","Spring","Programmer",96633),
    
  ]
  constructor() { }

  ngOnInit(): void {
  }

}
