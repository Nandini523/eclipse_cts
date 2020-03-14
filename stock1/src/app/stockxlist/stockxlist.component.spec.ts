import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { StockxlistComponent } from './stockxlist.component';

describe('StockxlistComponent', () => {
  let component: StockxlistComponent;
  let fixture: ComponentFixture<StockxlistComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ StockxlistComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(StockxlistComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
