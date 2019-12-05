import { Component, OnInit } from '@angular/core';
import { HouseService } from '../shared/services/house.service';

@Component({
  selector: 'app-house',
  templateUrl: './house.component.html',
  styleUrls: ['./house.component.css']
})
export class HouseComponent implements OnInit {

  constructor(private houseService: HouseService) { }

  ngOnInit() {
  }

  attributeQuery() {
    let attribute = (<HTMLSelectElement>document.getElementById('attribute')).value;
    let chapter = (<HTMLSelectElement>document.getElementById('chapter1')).value;
    switch (attribute) {
      case "Address": {
        this.houseService.getAddress(chapter).subscribe(address => alert(address));
        break;
      }
      case "Campus Location": {
        this.houseService.getCampusLocation(chapter).subscribe(cl => alert(cl));
        break;
      }
      case "Max Occupancy": {
        this.houseService.getMaxOccupancy(chapter).subscribe(mo => alert(mo));
        break;
      }
      case "Meal Plan Service": {
        this.houseService.getMealPlanService(chapter).subscribe(mps => alert(mps));
        break;
      }
      case "Summer Availability": {
        this.houseService.isAvailableInSummer(chapter).subscribe(avail => alert(avail));
        break;
      }
      default: {
        //statements; 
        break;
      }
    }
  }

  assignmentQuery() {
    let address = (<HTMLSelectElement>document.getElementById('address2')).value;
    let chapter = (<HTMLSelectElement>document.getElementById('chapter3')).value;
    switch (attribute) {
      case "Address": {
        this.houseService.getAddress(chapter).subscribe(address => alert(address));
        break;
      }
      case "Campus Location": {
        this.houseService.getCampusLocation(chapter).subscribe(cl => alert(cl));
        break;
      }
      case "Max Occupancy": {
        this.houseService.getMaxOccupancy(chapter).subscribe(mo => alert(mo));
        break;
      }
      case "Meal Plan Service": {
        this.houseService.getMealPlanService(chapter).subscribe(mps => alert(mps));
        break;
      }
      case "Summer Availability": {
        this.houseService.isAvailableInSummer(chapter).subscribe(avail => alert(avail));
        break;
      }
      default: {
        //statements; 
        break;
      }
    }
  }
}
