import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Philanthropy } from '../models/philanthropy';

@Injectable({
  providedIn: 'root'
})
export class PhilanthropyService {
  private philUrl = 'http://localhost:8080/philanthropy/';
  
  httpOptions = {
    headers: new HttpHeaders({ 'Content-Type': 'application/json' })
  };

  constructor(private http: HttpClient) { }

  getCause(eventName: string, eventDate: string): Observable<string> {
    return this.http.get<string>(`${this.philUrl}cause/${eventName}/${eventDate}`);
  }

  getPartner(eventName: string, eventDate: string): Observable<string> {
    return this.http.get<string>(`${this.philUrl}partner/${eventName}/${eventDate}`);
  }

  getMoneyRaised(eventName: string, eventDate: string): Observable<number> {
    return this.http.get<number>(`${this.philUrl}moneyRaised/${eventName}/${eventDate}`);
  }

  getTicketPrice(eventName: string, eventDate: string): Observable<number> {
    return this.http.get<number>(`${this.philUrl}TicketPrice/${eventName}/${eventDate}`);
  }

  getTotalAttendance(eventName: string, eventDate: string): Observable<number> {
    return this.http.get<number>(`${this.philUrl}totalAttendance/${eventName}/${eventDate}`);
  }

  getBudget(eventName: string, eventDate: string): Observable<number> {
    return this.http.get<number>(`${this.philUrl}budget/${eventName}/${eventDate}`);
  }

  getLocation(eventName: string, eventDate: string): Observable<string> {
    return this.http.get<string>(`${this.philUrl}location/${eventName}/${eventDate}`);
  }

  getAllPhilanthropies(): Observable<Philanthropy[]> {
    return this.http.get<Philanthropy[]>(`${this.philUrl}all`);
  }

  addNewPhilanthropy(philanthropy: Philanthropy): Observable<string> {
    return this.http.post<string>(`${this.philUrl}add`, philanthropy, {responseType:'text' as 'json'});
  }
}