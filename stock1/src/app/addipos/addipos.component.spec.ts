import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AddiposComponent } from './addipos.component';

describe('AddiposComponent', () => {
  let component: AddiposComponent;
  let fixture: ComponentFixture<AddiposComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AddiposComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AddiposComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
