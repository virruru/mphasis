import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-second',
  templateUrl: './second.component.html',
  styleUrls: ['./second.component.css']
})
export class SecondComponent implements OnInit {

  trainer : string;
  constructor(private _activatedRoute : ActivatedRoute) {
    this.trainer = this._activatedRoute.snapshot.params["trainer"];
   }

  ngOnInit(): void {
  }

}
