import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { NewMemberClassComponent } from './new-member-class.component';

describe('NewMemberClassComponent', () => {
  let component: NewMemberClassComponent;
  let fixture: ComponentFixture<NewMemberClassComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ NewMemberClassComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(NewMemberClassComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
