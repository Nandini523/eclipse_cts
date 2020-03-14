import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AddsecComponent } from './addsec.component';

describe('AddsecComponent', () => {
  let component: AddsecComponent;
  let fixture: ComponentFixture<AddsecComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AddsecComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AddsecComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
