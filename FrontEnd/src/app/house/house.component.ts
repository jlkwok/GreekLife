import { Component, OnInit } from '@angular/core';
import { HouseService } from '../shared/services/house.service';
import { HouseOf } from '../shared/models/houseOf';
import { House } from '../shared/models/house';

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
    switch(attribute) {
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
    }
  }

  addQuery() {
    let address = (<HTMLSelectElement>document.getElementById('address1')).value;
    let location = (<HTMLSelectElement>document.getElementById('location')).value;
    let maxOcc = (<HTMLSelectElement>document.getElementById('maxOcc')).value;
    let mealPlanService = (<HTMLSelectElement>document.getElementById('mealPlanService')).value;
    let summer = (<HTMLSelectElement>document.getElementById('summer')).value;
    let house: House = new House(address, location, maxOcc, mealPlanService, summer);
    this.houseService.addNewHouse(house).subscribe(response => alert(response));
  }

  assignmentQuery() {
    let address = (<HTMLSelectElement>document.getElementById('address2')).value;
    let chapter = (<HTMLSelectElement>document.getElementById('chapter3')).value;
    let houseOf: HouseOf = new HouseOf(chapter, address);
    this.houseService.addNewHouseOf(houseOf).subscribe(response => alert(response));
  }

  getMemsLivingIn() {
    let chapter = (<HTMLSelectElement>document.getElementById('chapter2')).value;
    this.houseService.getMembersLivingIn(chapter).subscribe(response => alert(response));
  }
}
