import { Component, OnInit } from '@angular/core';
import { ChapterMemberService } from '../shared/services/chapter-member.service';
import { formatDate } from "@angular/common";
import { Member } from '../shared/models/member';

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
    let attribute = (<HTMLSelectElement>document.getElementById('attribute')).value;
    let sid = parseInt((<HTMLSelectElement>document.getElementById('sid1')).value);
    switch (attribute) {
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
      case "Average GPA": {
        this.memberService.getGPA(sid).subscribe(gpa => alert(gpa));
        break;
      }
      default: {
        //statements; 
        break;
      }
    }
  }

  getStanding(year: string): Standing {
    switch(year) {
      case "Freshman": {
        return Standing.FRESHMAN;
      }
      case "Sophomore": {
        return Standing.SOPHOMORE;
      }
      case "Junior": {
        return Standing.JUNIOR;
      }
      case "Senior": {
        return Standing.SENIOR;
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
}
