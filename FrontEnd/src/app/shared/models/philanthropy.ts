export class Philanthropy {
    eventName: string;
    date: string;
    cause: string;
    partner: string;
    moneyRaised: number;
    ticketPrice: number;
    totalAttendance: number;
    budget: number;
    location: string;

    constructor(eventName, date, cause, partner, moneyRaised, ticketPrice, totalAttendance, budget, location) {
        this.eventName = eventName;
        this.date = date;
        this.cause = cause;
        this.partner = partner;
        this.moneyRaised = moneyRaised;
        this.ticketPrice = ticketPrice;
        this.totalAttendance = totalAttendance;
        this.budget = budget;
        this.location = location;
    }
}