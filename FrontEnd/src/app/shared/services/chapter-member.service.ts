import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { ChapterMember } from '../models/chapterMember';
import { Observable } from 'rxjs';

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

  getAllChapterMembers(): Observable<ChapterMember[]> {
    return this.http.get<ChapterMember[]>(`${this.chapterMemUrl}all`);
  }

  addNewChapterMember(chapterMem: ChapterMember): Observable<string> {
    return this.http.post<string>(`${this.chapterMemUrl}add`, chapterMem, {responseType:'text' as 'json'});
  }
}
