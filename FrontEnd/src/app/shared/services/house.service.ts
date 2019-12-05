import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { House } from '../models/house';
import { HouseOf } from '../models/houseOf';

@Injectable({
  providedIn: 'root'
})
export class HouseService {
  private houseUrl = 'http://localhost:8080/chapterHouse/';
  
  httpOptions = {
    headers: new HttpHeaders({ 'Content-Type': 'application/json' })
  };

  constructor(private http: HttpClient) { }

  getAddress(chapter: string): Observable<string> {
    return this.http.get<string>(`${this.houseUrl}address/${chapter}`);
  }

  getCampusLocation(chapter: string): Observable<string> {
    return this.http.get<string>(`${this.houseUrl}campusLocation/${chapter}`);
  }

  getMaxOccupancy(chapter: string): Observable<number> {
    return this.http.get<number>(`${this.houseUrl}maxOccupancy/${chapter}`);
  }

  getMealPlanService(chapter: string): Observable<string> {
    return this.http.get<string>(`${this.houseUrl}mealPlanService/${chapter}`);
  }

  isAvailableInSummer(chapter: string): Observable<boolean> {
    return this.http.get<boolean>(`${this.houseUrl}summer/${chapter}`);
  }

  getAllHouses(): Observable<House[]> {
    return this.http.get<House[]>(`${this.houseUrl}all`);
  }

  addNewHouse(house: House): Observable<string> {
    return this.http.post<string>(`${this.houseUrl}add`, house, {responseType:'text' as 'json'});
  }

  addNewHouseOf(houseOf: HouseOf): Observable<string> {
    return this.http.post<string>(`${this.houseUrl}add`, houseOf, {responseType:'text' as 'json'});
  }
}
