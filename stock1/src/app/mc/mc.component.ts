import { Component, OnInit } from '@angular/core';
import { CompanysService } from '../companys.service';
import{Companym}from '../companym';
import {FormControl,FormGroup,Validators} from '@angular/forms';
import { Observable } from 'rxjs/internal/Observable';
import { Router } from '@angular/router';
@Component({
  selector: 'app-mc',
  templateUrl: './mc.component.html',
  styleUrls: ['./mc.component.css']
})
export class McComponent implements OnInit {

  constructor(private router:Router,private Companys:CompanysService) { }  
  
  companylist:Observable<Companym[]>;
  submitted = false;  
  
  ngOnInit() {  
    this.submitted=false;  
    this.Companys.getAllCompanies().subscribe(data => {

      this.companylist = data;
    
      });
    
     }
     deleteCompany(companys:Companym)

 {

  this.Companys.deleteCompany(companys.companyname).subscribe(data=>{

  this.Companys.getAllCompanies().subscribe(data=>{this.companylist=data;});

 });

 }
 updateCompany(companys : Companym ) {
  window.localStorage.removeItem("edit-companyname");
 
  window.localStorage.setItem("edit-companyname", companys.companyname.toString());
 
   this.router.navigate(['addcom']);
  }
  }  
  
    
  
  

