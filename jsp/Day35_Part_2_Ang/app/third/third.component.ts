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
    this.company="Mphasis";
    this.trainer="Prasanna";
   }

  ngOnInit(): void {
  }

}
