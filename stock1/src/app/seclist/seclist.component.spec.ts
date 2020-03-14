import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SeclistComponent } from './seclist.component';

describe('SeclistComponent', () => {
  let component: SeclistComponent;
  let fixture: ComponentFixture<SeclistComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SeclistComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SeclistComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
