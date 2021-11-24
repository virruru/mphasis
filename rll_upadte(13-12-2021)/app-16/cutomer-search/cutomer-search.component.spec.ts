import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CutomerSearchComponent } from './cutomer-search.component';

describe('CutomerSearchComponent', () => {
  let component: CutomerSearchComponent;
  let fixture: ComponentFixture<CutomerSearchComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CutomerSearchComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CutomerSearchComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
