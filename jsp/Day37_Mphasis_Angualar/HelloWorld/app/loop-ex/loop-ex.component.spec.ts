import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LoopExComponent } from './loop-ex.component';

describe('LoopExComponent', () => {
  let component: LoopExComponent;
  let fixture: ComponentFixture<LoopExComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ LoopExComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(LoopExComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
