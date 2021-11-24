import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ReactiveEmployComponent } from './reactive-employ.component';

describe('ReactiveEmployComponent', () => {
  let component: ReactiveEmployComponent;
  let fixture: ComponentFixture<ReactiveEmployComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ReactiveEmployComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ReactiveEmployComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
