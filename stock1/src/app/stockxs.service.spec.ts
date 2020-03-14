import { TestBed } from '@angular/core/testing';

import { StockxsService } from './stockxs.service';

describe('StockxsService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: StockxsService = TestBed.get(StockxsService);
    expect(service).toBeTruthy();
  });
});
