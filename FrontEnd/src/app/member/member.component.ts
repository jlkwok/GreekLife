import { Component, OnInit } from '@angular/core';
import { ChapterMemberService } from '../shared/services/chapter-member.service';

@Component({
  selector: 'app-member',
  templateUrl: './member.component.html',
  styleUrls: ['./member.component.css']
})
export class MemberComponent implements OnInit {

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
}
