import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AddstkComponent } from './addstk.component';

describe('AddstkComponent', () => {
  let component: AddstkComponent;
  let fixture: ComponentFixture<AddstkComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AddstkComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AddstkComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
