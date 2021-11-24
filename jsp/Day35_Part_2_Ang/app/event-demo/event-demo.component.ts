import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-event-demo',
  templateUrl: './event-demo.component.html',
  styleUrls: ['./event-demo.component.css']
})
export class EventDemoComponent implements OnInit {

  trainer() {
    alert("Trainer is Prasanna...");
  }
  topic() {
    alert("Topic is Angular Foundation...Day1")
  }
  show() {
    alert("Welcome to angular Programming...")
  }
  constructor() { }

  ngOnInit(): void {
  }

}
