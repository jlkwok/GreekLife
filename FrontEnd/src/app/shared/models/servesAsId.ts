export class ServesAsId {
    sid: number;
    position: string;
    term: string;
    chapterName: string;

    constructor(sid, position, term, chapterName) {
        this.sid = sid;
        this.position = position;
        this.term = term;
        this.chapterName = chapterName;
    }
}