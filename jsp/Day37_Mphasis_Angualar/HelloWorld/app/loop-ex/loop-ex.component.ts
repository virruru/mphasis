import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-loop-ex',
  templateUrl: './loop-ex.component.html',
  styleUrls: ['./loop-ex.component.css']
})
export class LoopExComponent implements OnInit {

  names = ["Naman", "Arya","Satyam","Prasanna","Neha","Mansi"]
  constructor() { }

  ngOnInit(): void {
  }

}
