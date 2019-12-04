export class House {
    address: string;
    campusLocation: string;
    maxOccupancy: number;
    mealPlanService: string;
    summerHousing: boolean;

    constructor(address, campusLocation, maxOccupancy, mealPlanService, summerHousing) {
        this.address = address;
        this.campusLocation = campusLocation;
        this.maxOccupancy = maxOccupancy; 
        this.mealPlanService = mealPlanService;
        this.summerHousing = summerHousing;
    }
}