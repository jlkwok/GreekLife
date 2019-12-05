import { Component, OnInit } from '@angular/core';
import { formatDate } from "@angular/common";
import { PhilanthropyService } from '../shared/services/philanthropy.service';

@Component({
  selector: 'app-philanthropy',
  templateUrl: './philanthropy.component.html',
  styleUrls: ['./philanthropy.component.css']
})
export class PhilanthropyComponent implements OnInit {
  format = 'MM-dd-yyyy';
  locale = 'en-US';

  constructor(private philService: PhilanthropyService) { }

  ngOnInit() {
  }

  attributeQuery() {
    let attribute = (<HTMLSelectElement>document.getElementById('attribute')).value;
    let name = (<HTMLSelectElement>document.getElementById('name1')).value;
    let date = (<HTMLSelectElement>document.getElementById('date1')).value;
    switch (attribute) {
      case "Cause": {
        this.philService.getCause(name, date).subscribe(cause => alert(cause));
        break;
      }
      case "Partners": {
        this.philService.getPartner(name, date).subscribe(partner => alert(partner));
        break;
      }
      case "Money Raised": {
        this.philService.getMoneyRaised(name, date).subscribe(money => alert(money));
        break;
      }
      case "Ticket Price": {
        this.philService.getTicketPrice(name, date).subscribe(ticketPrice => alert(ticketPrice));
        break;
      }
      case "Total Attendance": {
        this.philService.getTotalAttendance(name, date).subscribe(totAttendance => alert(totAttendance));
        break;
      }
      case "Budget": {
        this.philService.getBudget(name, date).subscribe(budget => alert(budget));
        break;
      }
      case "Location": {
        this.philService.getLocation(name, date).subscribe(location => alert(location));
        break;
      }
      default: {
        //statements; 
        break;
      }
    }
  }

}
