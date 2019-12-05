import { PhilanthropyId } from './philanthropyId';

export class Philanthropy {
    id: PhilanthropyId;
    cause: string;
    partner: string;
    moneyRaised: number;
    ticketPrice: number;
    totalAttendance: number;
    budget: number;
    location: string;

    constructor(eventName, date, cause, partner, moneyRaised, ticketPrice, totalAttendance, budget, location) {
        this.id = new PhilanthropyId(eventName, date);
        this.cause = cause;
        this.partner = partner;
        this.moneyRaised = moneyRaised;
        this.ticketPrice = ticketPrice;
        this.totalAttendance = totalAttendance;
        this.budget = budget;
        this.location = location;
    }
}