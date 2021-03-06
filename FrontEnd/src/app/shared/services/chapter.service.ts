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
    headers: new HttpHeaders({ 'Content-Type': 'application/json', 'Response-Type':'text'})
  };

  constructor(private http: HttpClient) { }

  getGoverningBody(chapter: string): Observable<GoverningBody> {
    return this.http.get<GoverningBody>(`${this.chapterUrl}governingBody/${chapter}`);
  }

  getLocalFoundingDate(chapter: string) {
    return this.http.get(`${this.chapterUrl}localFoundingDate/${chapter}`, {responseType: 'text'});
  }

  getNationalFoundingDate(chapter: string) {
    return this.http.get(`${this.chapterUrl}nationalFoundingDate/${chapter}`, {responseType: 'text'});
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

  getMembers(chapter: string): Observable<string[]> {
    return this.http.get<string[]>(`${this.chapterUrl}members/${chapter}`);
  }

  getPhilanthropy(chapter: string): Observable<string[]> {
    return this.http.get<string[]>(`${this.chapterUrl}philanthropy/${chapter}`);
  }

  getHouse(chapter: string) {
    return this.http.get(`${this.chapterUrl}house/${chapter}`, {responseType: 'text'});
  }

  getExec(chapter: string): Observable<string[]> {
    return this.http.get<string[]>(`${this.chapterUrl}exec/${chapter}`);
  }

  getChaptersWithMinGpa(gpa: number): Observable<string[]> {
    return this.http.get<string[]>(`${this.chapterUrl}chaptersWithMinGpa/${gpa}`);
  }

  getChapterWithAvgGpa(gpa: number): Observable<string[]> {
    return this.http.get<string[]>(`${this.chapterUrl}chaptersWithAvgGpa/${gpa}`);
  }

  getChaptersWithAllInHouse(): Observable<string[]> {
    return this.http.get<string[]>(`${this.chapterUrl}chaptersWithAllInHouse`);
  }

  getAllChapters(): Observable<string[]> {
    return this.http.get<string[]>(`${this.chapterUrl}all`);
  }

  updateDues(chapter: string, dues: number) {
    return this.http.get(`${this.chapterUrl}updateDues/${chapter}/${dues}`, {responseType: 'text'});
  }

  addNewChapter(chapter: Chapter): Observable<string> {
    return this.http.post<string>(`${this.chapterUrl}add`, chapter, {responseType:'text' as 'json'});
  }
}
