export class Chapter {
    name: string;
    governingBody: GoverningBody;
    localFoundingDate: string;
    natFoundingDate: string;
    natDesignation: number;
    dues: number;

    constructor (name, governingBody, localFoundingDate, natFoundingDate, natDesignation, dues) {
        this.name = name;
        this.governingBody = governingBody;
        this.localFoundingDate = localFoundingDate;
        this.natFoundingDate = natFoundingDate;
        this.natDesignation = natDesignation;
        this.dues = dues;
    }
}