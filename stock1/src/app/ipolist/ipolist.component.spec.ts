import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { IpolistComponent } from './ipolist.component';

describe('IpolistComponent', () => {
  let component: IpolistComponent;
  let fixture: ComponentFixture<IpolistComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ IpolistComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(IpolistComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
