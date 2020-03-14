import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Stockxm } from './stockxm';

import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class StockxsService {

  private baseUrl = 'http://localhost:8082/StockExchange1/StockEx';

  constructor(private http:HttpClient) { }
 
  getStockEx(): Observable<any> {
 
   return this.http.get(`${this.baseUrl}`+'/getStockEx');
 
  }
 
  saveStockEx(StockEx: object): Observable<object> {
 
   return this.http.post(`${this.baseUrl}`+'/saveStockEx', StockEx);
 
  }
 
  deleteStockEx(seid: number): Observable<Object> {
 
    return this.http.delete<Stockxm>(`${this.baseUrl}/deleteStockEx/${seid}`);
  
   }
  
   findOneInAll4(seid: number): Observable<any> {
 
   return this.http.get(`${this.baseUrl}/findOneInAll4/${seid}`);
 
  }
 
  updateStockEx(seid: number, value: any): Observable<any> {
 
   return this.http.put(`${this.baseUrl}/updateStockEx/${seid}`, value);
  }
}
