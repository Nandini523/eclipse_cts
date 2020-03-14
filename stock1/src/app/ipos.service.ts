import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Addipom } from './addipom';

import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class IposService {
  private baseUrl = 'http://localhost:8082/IpoDetails1/IpoDetails';

  constructor(private http:HttpClient) { }
 
  getIpoDetails(): Observable<any> {
 
   return this.http.get(`${this.baseUrl}`+'/getIpoDetails');
 
  }
 
  saveIpoDetails(IpoDetails: object): Observable<object> {
 
   return this.http.post(`${this.baseUrl}`+'/saveIpoDetails', IpoDetails);
 
  }
 
  deleteIpos(ipoid: number): Observable<Object> {
 
   return this.http.delete<Addipom>(`${this.baseUrl}/deleteIpos/${ipoid}`);
 
  }
 
  findOneInAll2(ipoid: number): Observable<any> {

    return this.http.get(`${this.baseUrl}/findOneInAll2/${ipoid}`);
  
   }
 
   updateIpoDetails(ipoid: number, value: any): Observable<any> {

    return this.http.put(`${this.baseUrl}/updateIpoDetails/${ipoid}`, value);
   }
}
