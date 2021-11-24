import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ConditionExComponent } from './condition-ex.component';

describe('ConditionExComponent', () => {
  let component: ConditionExComponent;
  let fixture: ComponentFixture<ConditionExComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ConditionExComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ConditionExComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
