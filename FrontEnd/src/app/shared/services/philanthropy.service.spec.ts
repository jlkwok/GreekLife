import { TestBed } from '@angular/core/testing';

import { PhilanthropyService } from './philanthropy.service';

describe('PhilanthropyService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: PhilanthropyService = TestBed.get(PhilanthropyService);
    expect(service).toBeTruthy();
  });
});
