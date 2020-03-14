import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

import { Companym } from './companym';
import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class CompanysService {

  private baseUrl = 'http://localhost:8082/Company1/Company1';

 constructor(private http:HttpClient) { }

 getAllCompanies(): Observable<any> {

  return this.http.get(`${this.baseUrl}`+'/getAllCompanies');

 }

 saveCompany(Company: object): Observable<object> {

  return this.http.post(`${this.baseUrl}`+'/saveCompany', Company);

 }

 deleteCompany(companyname: String): Observable<Object> {

  return this.http.delete<Companym>(`${this.baseUrl}/deleteCompany/${companyname}`);

 }


 findOneInAll1(companyname: String): Observable<any> {

  return this.http.get(`${this.baseUrl}/findOneInAll1/${companyname}`);

 }

 updateCompany(companyname: String, value: any): Observable<any> {

  return this.http.put(`${this.baseUrl}/updateCompany/${companyname}`, value);
 }


}
