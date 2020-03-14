import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AddstkpComponent } from './addstkp.component';

describe('AddstkpComponent', () => {
  let component: AddstkpComponent;
  let fixture: ComponentFixture<AddstkpComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AddstkpComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AddstkpComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
