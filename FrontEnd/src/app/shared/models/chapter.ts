export class Chapter {
    chapterName: string;
    governingBody: GoverningBody;
    localFoundingDate: string;
    natFoundingDate: string;
    natDesignation: number;
    dues: number;

    constructor (name, governingBody, localFoundingDate, natFoundingDate, natDesignation, dues) {
        this.chapterName = name;
        this.governingBody = governingBody;
        this.localFoundingDate = localFoundingDate;
        this.natFoundingDate = natFoundingDate;
        this.natDesignation = natDesignation;
        this.dues = dues;
    }
}