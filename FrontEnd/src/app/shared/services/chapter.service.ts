import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Chapter } from '../models/chapter';

@Injectable({
  providedIn: 'root'
})
export class ChapterService {
  private chapterUrl = 'http://localhost:8080/chapter/';
  
  httpOptions = {
    headers: new HttpHeaders({ 'Content-Type': 'application/json' })
  };

  constructor(private http: HttpClient) { }

  getGoverningBody(chapter: string): Observable<GoverningBody> {
    return this.http.get<GoverningBody>(`${this.chapterUrl}governingBody/${chapter}`);
  }

  getLocalFoundingDate(chapter: string): Observable<string> {
    return this.http.get<string>(`${this.chapterUrl}localFoundingDate/${chapter}`);
  }

  getNationalFoundingDate(chapter: string): Observable<string> {
    return this.http.get<string>(`${this.chapterUrl}nationalFoundingDate/${chapter}`);
  }

  getNationalDesignation(chapter: string): Observable<number> {
    return this.http.get<number>(`${this.chapterUrl}nationalDesignation/${chapter}`);
  }

  getDues(chapter: string): Observable<number> {
    return this.http.get<number>(`${this.chapterUrl}dues/${chapter}`);
  }

  getAvgGpa(chapter: string): Observable<number> {
    return this.http.get<number>(`${this.chapterUrl}avgGpa/${chapter}`);
  }

  getMemberCount(chapter: string): Observable<number> {
    return this.http.get<number>(`${this.chapterUrl}memberCount/${chapter}`);
  }

  getChaptersWithMinGpa(gpa: number): Observable<Chapter[]> {
    return this.http.get<Chapter[]>(`${this.chapterUrl}chaptersWithMinGpa/${gpa}`);
  }

  getChapterWithAvgGpa(gpa: number): Observable<Chapter[]> {
    return this.http.get<Chapter[]>(`${this.chapterUrl}chaptersWithAvgGpa/${gpa}`);
  }

  getChaptersWithAllInHouse(): Observable<Chapter[]> {
    return this.http.get<Chapter[]>(`${this.chapterUrl}chaptersWithAllInHouse`);
  }

  getAllChapters(): Observable<Chapter[]> {
    return this.http.get<Chapter[]>(`${this.chapterUrl}all`);
  }

  addNewChapter(chapter: Chapter): Observable<string> {
    return this.http.post<string>(`${this.chapterUrl}add`, chapter, {responseType:'text' as 'json'});
  }
}
