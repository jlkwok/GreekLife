import { Component, OnInit } from '@angular/core';
import { ChapterMemberService } from '../shared/services/chapter-member.service';
import { formatDate } from "@angular/common";
import { Member } from '../shared/models/member';
import { MemberOf } from '../shared/models/memberOf';
import { LivesIn } from '../shared/models/livesIn';
import { LivesInId } from '../shared/models/livesInId';
import { ServesAs } from '../shared/models/servesAs';
import { ServesAsId } from '../shared/models/servesAsId';

@Component({
  selector: 'app-member',
  templateUrl: './member.component.html',
  styleUrls: ['./member.component.css']
})
export class MemberComponent implements OnInit {
  format = 'MM-dd-yyyy';
  locale = 'en-US';

  constructor(private memberService: ChapterMemberService) { }

  ngOnInit() {
  }

  attributeQuery() {
    let attribute = (<HTMLSelectElement>document.getElementById('attribute1')).value;
    let sid = parseInt((<HTMLSelectElement>document.getElementById('sid1')).value);
    switch(attribute) {
      case "Name": {
        this.memberService.getName(sid).subscribe(name => alert(name));
        break;
      }
      case "Year": {
        this.memberService.getYear(sid).subscribe(year => alert(year));
        break;
      }
      case "Join Date": {
        this.memberService.getJoinDate(sid).subscribe(date => alert(date));
        break;
      }
      case "Badge Number": {
        this.memberService.getBadgeNumber(sid).subscribe(badgeNum => alert(badgeNum));
        break;
      }
      case "Major": {
        this.memberService.getMajor(sid).subscribe(major => alert(major));
        break;
      }
      case "GPA": {
        this.memberService.getGPA(sid).subscribe(gpa => alert(gpa));
        break;
      }
    }
  }

  relationshipQuery() {
    let relationship = (<HTMLSelectElement>document.getElementById('relationship')).value;
    let sid = parseInt((<HTMLSelectElement>document.getElementById('sid2')).value);
    switch(relationship) {
      case "Living Location": {
        this.memberService.getLivingLocation(sid).subscribe(location => alert(location));
        break;
      }
      case "Executive Positions": {
        this.memberService.getExecPositions(sid).subscribe(positions => alert(positions));
        break;
      }
    }
  }

  updateQuery() {
    let attribute = (<HTMLSelectElement>document.getElementById('attribute2')).value;
    let sid = parseInt((<HTMLSelectElement>document.getElementById('sid3')).value);
    let value = (<HTMLSelectElement>document.getElementById('value')).value;
    switch(attribute) {
      case "Name": {
        this.memberService.updateName(sid, value).subscribe(response => alert(response));
        break;
      }
      case "Major": {
        this.memberService.updateMajor(sid, value).subscribe(response => alert(response));
        break;
      }
      case "GPA": {
        let gpa = parseInt(value);
        this.memberService.updateGpa(sid, gpa).subscribe(response => alert(response));
        break;
      }
    }
  }

  getStanding(year: string): number {
    switch(year) {
      case "Freshman": {
        return 0;
      }
      case "Sophomore": {
        return 1;
      }
      case "Junior": {
        return 2;
      }
      case "Senior": {
        return 3;
      }
    }
  }

  addQuery() {
    let name = (<HTMLSelectElement>document.getElementById('name')).value;
    let yearVal = (<HTMLSelectElement>document.getElementById('year')).value;
    let year = this.getStanding(yearVal);
    let joinDate = (<HTMLSelectElement>document.getElementById('joinDate')).value;
    joinDate = formatDate(joinDate, this.format, this.locale);
    let badgeNum = parseInt((<HTMLSelectElement>document.getElementById('badgeNum')).value);
    let major = (<HTMLSelectElement>document.getElementById('major')).value;
    let gpa = parseInt((<HTMLSelectElement>document.getElementById('gpa')).value);
    let member: Member = new Member(name, year, joinDate, badgeNum, major, gpa);
    this.memberService.addNewChapterMember(member).subscribe(response => alert(response));
  }

  addMemToChapt() {
    let sid = parseInt((<HTMLSelectElement>document.getElementById('sid4')).value);
    let chapter = (<HTMLSelectElement>document.getElementById('chapter2')).value;
    let memberOf: MemberOf = new MemberOf(sid, chapter);
    this.memberService.addMemberOf(memberOf).subscribe(response => alert(response));
  }

  setLivingLocationQuery() {
    let sid = parseInt((<HTMLSelectElement>document.getElementById('sid5')).value);
    let address = (<HTMLSelectElement>document.getElementById('address')).value;
    let academicYear = (<HTMLSelectElement>document.getElementById('academicYear1')).value;
    let livesInId: LivesInId = new LivesInId(sid, academicYear)
    let livesIn: LivesIn = new LivesIn(livesInId, address);
    this.memberService.addLivesIn(livesIn).subscribe(response => alert(response));
  }

  executiveQuery() {
    let sid = parseInt((<HTMLSelectElement>document.getElementById('sid6')).value);
    let position = (<HTMLSelectElement>document.getElementById('position')).value;
    let chapter = (<HTMLSelectElement>document.getElementById('chapter3')).value;
    let academicYear = (<HTMLSelectElement>document.getElementById('academicYear2')).value;
    let servesAsId: ServesAsId = new ServesAsId(sid, position, academicYear, chapter);
    let servesAs: ServesAs = new ServesAs(servesAsId);
    this.memberService.addServesAs(servesAs).subscribe(response => alert(response));
  }
}
