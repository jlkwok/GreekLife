export class Member {
    sid: number;
    name: string;
    year: string;
    joinDate: string;
    badgeNum: number;
    major: string;
    gpa: number;

    constructor (name, year, joinDate, badgeNum, major, gpa) {
        this.name = name;
        this.year = year;
        this.joinDate = joinDate; 
        this.badgeNum = badgeNum;
        this.major = major;
        this.gpa = gpa;
    }
}