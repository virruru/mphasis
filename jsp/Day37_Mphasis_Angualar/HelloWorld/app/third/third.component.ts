import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-third',
  templateUrl: './third.component.html',
  styleUrls: ['./third.component.css']
})
export class ThirdComponent implements OnInit {

  trainer : string;
  company : string;
  constructor() {
    this.trainer = "Prasanna"
    this.company = "Hexaware"
   }

  ngOnInit(): void {
  }

}
