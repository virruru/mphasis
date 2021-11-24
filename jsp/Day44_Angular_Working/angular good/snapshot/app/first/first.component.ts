import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-first',
  templateUrl: './first.component.html',
  styleUrls: ['./first.component.css']
})
export class FirstComponent implements OnInit {

  trainer : string;
  third() {
    this._router.navigate(['/third/',this.trainer]);
  }
  constructor(private _router : Router) {
    this.trainer="Prasanna...";
   }

  ngOnInit(): void {
  }

}
