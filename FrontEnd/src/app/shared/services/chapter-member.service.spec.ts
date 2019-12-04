import { TestBed } from '@angular/core/testing';

import { ChapterMemberService } from './chapter-member.service';

describe('ChapterMemberService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: ChapterMemberService = TestBed.get(ChapterMemberService);
    expect(service).toBeTruthy();
  });
});
