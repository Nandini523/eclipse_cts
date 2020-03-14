import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Secm } from './secm';
import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class SecsService {
  private baseUrl = 'http://localhost:8082/Sector1/Sector';

  constructor(private http:HttpClient) { }
 
  getSectors(): Observable<any> {
 
   return this.http.get(`${this.baseUrl}`+'/getSectors');
 
  }
 
  saveSectors(Sector: object): Observable<object> {
 
   return this.http.post(`${this.baseUrl}`+'/saveSectors', Sector);
 
  }
 
  deleteSector(sid: number): Observable<Object> {
 
   return this.http.delete<Secm>(`${this.baseUrl}/deleteSector/${sid}`);
 
  }
 
  findOneInAll3(sid: number): Observable<any> {

    return this.http.get(`${this.baseUrl}/findOneInAll3/${sid}`);
  
   }
 
  updateSector(sid: number, value: any): Observable<any> {
 
   return this.http.put(`${this.baseUrl}/updateSector/${sid}`, value);
  }
 
 
 
}
