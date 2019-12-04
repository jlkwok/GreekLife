export class ChapterMember {
    sid: number;
    name: string;
    year: Standing;
    joinDate: string;
    badgeNumber: number;
    major: string;
    gpa: number;

    constructor(name, year, joinDate, badgeNumber, major, gpa) {
        this.name = name;
        this.year = year; 
        this.joinDate = joinDate;
        this.badgeNumber = badgeNumber;
        this.major =  major;
        this.gpa = gpa;
    }
}