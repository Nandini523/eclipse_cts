import { TestBed } from '@angular/core/testing';

import { SecsService } from './secs.service';

describe('SecsService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: SecsService = TestBed.get(SecsService);
    expect(service).toBeTruthy();
  });
});
