import { Component, OnInit } from '@angular/core';
import { DemoService } from '../demo.service';


@Component({
  selector: 'app-second',
  templateUrl: './second.component.html',
  styleUrls: ['./second.component.css']
})
export class SecondComponent implements OnInit {

  // _demo : DemoService;
  constructor(private _demoService : DemoService) {
    // this._demo = new DemoService();
  }
  
  hello() {
    alert(this._demoService.sayHello())
  }

  topic() {
    alert(this._demoService.topic());
  }
  ngOnInit(): void {
  }

}
