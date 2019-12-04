import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Chapter } from '../models/chapter';
import { Member } from '../models/member';
import { Philanthropy } from '../models/philanthropy';
import { House } from '../models/house';

@Injectable({
  providedIn: 'root'
})
export class ChapterService {
  private chapterUrl = '';
  
  httpOptions = {
    headers: new HttpHeaders({ 'Content-Type': 'application/json' })
  };

  constructor(private http: HttpClient) { }

  getGoverningBody(chapter: string): Observable<string> {
    return this.http.get<string>(`${this.chapterUrl}getGoverningBody?chapter=${chapter}`);
  }

  getLocalFoundingDate(chapter: string): Observable<string> {
    return this.http.get<string>(`${this.chapterUrl}getLocalFoundingDate?chapter=${chapter}`);
  }

  getNationalFoundingDate(chapter: string): Observable<string> {
    return this.http.get<string>(`${this.chapterUrl}getNationalFoundingDate?chapter=${chapter}`);
  }

  getNumMembers(chapter: string): Observable<number> {
    return this.http.get<number>(`${this.chapterUrl}getNumMembers?chapter=${chapter}`);
  }

  getAvgGpa(chapter: string): Observable<number> {
    return this.http.get<number>(`${this.chapterUrl}getAvgGpa?chapter=${chapter}`);
  }  

  getDues(chapter: string): Observable<number> {
    return this.http.get<number>(`${this.chapterUrl}getDues?chapter=${chapter}`);
  }

  getMembers(chapter: string): Observable<Member[]> {
    return this.http.get<Member[]>(`${this.chapterUrl}getMembers?chapter=${chapter}`);
  }

  getPhilanthropy(chapter: string): Observable<Philanthropy[]> {
    return this.http.get<Philanthropy[]>(`${this.chapterUrl}getPhilanthropy?chapter=${chapter}`);
  }

  getHouse(chapter: string): Observable<House> {
    return this.http.get<House>(`${this.chapterUrl}getHouse?chapter=${chapter}`);
  }

  getExecBoard(chapter: string): Observable<Member[]> {
    return this.http.get<Member[]>(`${this.chapterUrl}getExecBoard?chapter=${chapter}`);
  }

  getAvgGpaThreshold(value: number): Observable<Chapter[]> {
    return this.http.get<Chapter[]>(`${this.chapterUrl}getAvgGpaThreshold?value=${value}`);
  }
}
