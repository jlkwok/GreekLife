import { LivesInId } from './livesInId';

export class LivesIn {
    id: LivesInId;
    address: string;

    constructor(id, address) {
        this.id = id;
        this.address = address;
    }
}