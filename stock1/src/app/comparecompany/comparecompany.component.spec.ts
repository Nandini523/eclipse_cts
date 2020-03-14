import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ComparecompanyComponent } from './comparecompany.component';

describe('ComparecompanyComponent', () => {
  let component: ComparecompanyComponent;
  let fixture: ComponentFixture<ComparecompanyComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ComparecompanyComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ComparecompanyComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
