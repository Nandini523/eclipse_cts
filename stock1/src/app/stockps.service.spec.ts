import { TestBed } from '@angular/core/testing';

import { StockpsService } from './stockps.service';

describe('StockpsService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: StockpsService = TestBed.get(StockpsService);
    expect(service).toBeTruthy();
  });
});
