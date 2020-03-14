import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { StkplistComponent } from './stkplist.component';

describe('StkplistComponent', () => {
  let component: StkplistComponent;
  let fixture: ComponentFixture<StkplistComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ StkplistComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(StkplistComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
