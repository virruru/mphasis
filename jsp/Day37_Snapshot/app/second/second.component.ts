import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-second',
  templateUrl: './second.component.html',
  styleUrls: ['./second.component.css']
})
export class SecondComponent implements OnInit {

  company : string;
  student : string;
  constructor(private _activatedRoute : ActivatedRoute) {
    this.company = this._activatedRoute.snapshot.params["company"];
    this.student = this._activatedRoute.snapshot.params["student"]
   }

  ngOnInit(): void {
  }

}
