import { TestBed } from '@angular/core/testing';

import { CompanysService } from './companys.service';

describe('CompanysService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: CompanysService = TestBed.get(CompanysService);
    expect(service).toBeTruthy();
  });
});
