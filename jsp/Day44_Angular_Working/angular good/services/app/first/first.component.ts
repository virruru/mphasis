import { Component, OnInit } from '@angular/core';
import { DemoService } from '../demo.service';

@Component({
  selector: 'app-first',
  templateUrl: './first.component.html',
  styleUrls: ['./first.component.css']
})
export class FirstComponent implements OnInit {

  hello() {
    alert(this._demoService.sayHello())
  }

  topic() {
    alert(this._demoService.topic());
  }
  
  constructor(private _demoService : DemoService) { }

  ngOnInit(): void {
  }

}
