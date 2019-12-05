import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Member } from '../models/member';
import { NewMemberOf } from '../models/newMemberOf';
import { MemberOf } from '../models/memberOf';
import { LivesIn } from '../models/livesIn';
import { ServesAs } from '../models/servesAs';

@Injectable({
  providedIn: 'root'
})
export class ChapterMemberService {
  private chapterMemUrl = 'http://localhost:8080/chapterMember/';
  
  httpOptions = {
    headers: new HttpHeaders({ 'Content-Type': 'application/json' })
  };

  constructor(private http: HttpClient) { }

  getName(sid: number): Observable<string> {
    return this.http.get<string>(`${this.chapterMemUrl}name/${sid}`);
  }

  getYear(sid: number): Observable<Standing> {
    return this.http.get<Standing>(`${this.chapterMemUrl}year/${sid}`);
  }

  getJoinDate(sid: number): Observable<string> {
    return this.http.get<string>(`${this.chapterMemUrl}joinDate/${sid}`);
  }

  getBadgeNumber(sid: number): Observable<number> {
    return this.http.get<number>(`${this.chapterMemUrl}badgeNumber/${sid}`);
  }

  getMajor(sid: number): Observable<string> {
    return this.http.get<string>(`${this.chapterMemUrl}major/${sid}`);
  }

  getGPA(sid: number): Observable<number> {
    return this.http.get<number>(`${this.chapterMemUrl}gpa/${sid}`);
  }

  getLivingLocation(sid: number): Observable<string> {
    return this.http.get<string>(`${this.chapterMemUrl}livingLocation/${sid}`);
  }

  getExecPositions(sid: number): Observable<ServesAs[]> {
    return this.http.get<ServesAs[]>(`${this.chapterMemUrl}execPositions/${sid}`);
  }

  getAllChapterMembers(): Observable<Member[]> {
    return this.http.get<Member[]>(`${this.chapterMemUrl}all`);
  }

  updateName(sid: number, name: string): Observable<string> {
    return this.http.get<string>(`${this.chapterMemUrl}updateName/${sid}/${name}`);
  }

  updateMajor(sid: number, major: string): Observable<string> {
    return this.http.get<string>(`${this.chapterMemUrl}updateMajor/${sid}/${major}`);
  }

  updateGpa(sid: number, gpa: number): Observable<string> {
    return this.http.get<string>(`${this.chapterMemUrl}updateGpa/${sid}/${gpa}`);
  }

  addNewChapterMember(chapterMem: Member): Observable<string> {
    return this.http.post<string>(`${this.chapterMemUrl}add`, chapterMem, {responseType:'text' as 'json'});
  }

  addMemberOf(memberOf: MemberOf): Observable<string> {
    return this.http.post<string>(`${this.chapterMemUrl}addMemberOf`, memberOf, {responseType:'text' as 'json'});
  }

  addLivesIn(livesIn: LivesIn): Observable<string> {
    return this.http.post<string>(`${this.chapterMemUrl}addLivesIn`, livesIn, {responseType:'text' as 'json'});
  }

  addServesAs(servesAs: ServesAs): Observable<string> {
    return this.http.post<string>(`${this.chapterMemUrl}addServesAs`, servesAs, {responseType:'text' as 'json'});
  }
}
