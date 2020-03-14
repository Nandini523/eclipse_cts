import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Stockp } from './stockp';
import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class StockpsService {
  private baseUrl = 'http://localhost:8082/StockPrice/stockPrice';


  
  constructor(private http:HttpClient) { }
 
  getStockPr(): Observable<any> {
 
   return this.http.get(`${this.baseUrl}`+'/getStockPr');
 
  }
 
  saveStockPr(Stockp: object): Observable<object> {
 
   return this.http.post(`${this.baseUrl}`+'/saveStockPr', Stockp);
 
  }
 
  deleteStockPr(stockex: String): Observable<Object> {
 
   return this.http.delete<Stockp>(`${this.baseUrl}/deleteStockPr/${stockex}`);
 
  }
 
  findOneInAll5(stockex: String): Observable<any> {

    return this.http.get(`${this.baseUrl}/findOneInAll5/${stockex}`);
  
   }
 
   updateStockPr(stockex: String, value: any): Observable<any> {
 
   return this.http.put(`${this.baseUrl}/updateStockPr/${stockex}`, value);
  }
 
  uploadFile(file: File, stockex: String): Observable<any> {



    let url = this.baseUrl + "uploadfile/" + stockex;
   
   
   
    const formdata: FormData = new FormData();
   
   
   
    formdata.append('file', file);
   
   
   
    return this.http.post(url, formdata);
   
    }
 
    getmultiplelinechart(): Observable<any> {

      return this.http.get(`${this.baseUrl}`+'/multiplelinechart');
    
     }
    
    
  
}
