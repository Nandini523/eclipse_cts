import { Component, OnInit } from '@angular/core';
import { CompanysService } from '../companys.service';
import{Companym}from '../companym';
import {FormControl,FormGroup,Validators} from '@angular/forms';
import { Router } from '@angular/router';
@Component({
  selector: 'app-addcom',
  templateUrl: './addcom.component.html',
  styleUrls: ['./addcom.component.css']
})
export class AddcomComponent implements OnInit {
  constructor(private router:Router,private CompanyService:CompanysService) { }  
  
  company : Companym=new Companym();  
  submitted = false;  
  
  ngOnInit() {  
    this.submitted=false;  
    var companyname=window.localStorage.getItem("edit-companyname");
   this.CompanyService.findOneInAll1(companyname)
    .subscribe(
     data => {
     this.company =data;
     this.saveCompanyform.setValue(this.company);
     }) ;
  }  
  
  saveCompanyform=new FormGroup({  
    companyname:new FormControl('' , [Validators.required , Validators.minLength(3) ] ),

  ceo:new FormControl('' , [Validators.required , Validators.minLength(2) ] ),

  boardofdirectors:new FormControl('' , [Validators.required , Validators.minLength(2) ] ),

  sector:new FormControl('' , [Validators.required , Validators.minLength(2) ] ),

  briefwriteup:new FormControl('',[Validators.required,Validators.email]),

  turnover:new FormControl(),

  listedinstock:new FormControl('' , [Validators.required , Validators.minLength(2) ] ),

  stockcode:new FormControl('' , [Validators.required , Validators.minLength(2) ] )


 
    /*student_branch:new FormControl()  */
  });  
  
  saveCompany(saveCompany1){  
    this.company=new Companym();     
    this.company.companyname=this.cname.value;  
    this.company.ceo=this.Ceo.value;  
    this.company.boardofdirectors=this.bod.value; 
    this.company.sector=this.sector.value;
    this.company.briefwriteup=this.bwp.value;
    this.company.turnover=this.tover.value;
    this.company.listedinstock=this.lis.value;
    this.company.stockcode=this.stockcode.value;
    this.submitted = true;  
    this.save();  
  }  
  updateCompany(updateCompany1){  
    this.company=new Companym();     
    this.company.companyname=this.cname.value;  
    this.company.ceo=this.Ceo.value;  
    this.company.boardofdirectors=this.bod.value; 
    this.company.sector=this.sector.value;
    this.company.briefwriteup=this.bwp.value;
    this.company.turnover=this.tover.value;
    this.company.listedinstock=this.lis.value;
    this.company.stockcode=this.stockcode.value;
    this.submitted = true;  
    this.save();  
    
  }  
  save() {  
    this.CompanyService.saveCompany(this.company)  
      .subscribe(data => console.log(data), error => console.log(error));  
    this.company = new Companym();  
    window.localStorage.removeItem("edit-companyname");
    this.router.navigate(['mc']);
  
  }  
  
  get cname(){  
    return this.saveCompanyform.get('companyname');  
  }  
  get Ceo(){  
    return this.saveCompanyform.get('ceo');  
  }  
  get bod(){  
    return this.saveCompanyform.get('boardofdirectors');  
  }  
  get sector(){  
    return this.saveCompanyform.get('sector');  
  }  
  get bwp(){  
    return this.saveCompanyform.get('briefwriteup');  
  }  
  get tover(){  
    return this.saveCompanyform.get('turnover');  
  }  
  get lis(){  
    return this.saveCompanyform.get('listedinstock');  
  }  
  get stockcode(){  
    return this.saveCompanyform.get('stockcode');  
  }  
  saveCompanyForm(){  
    this.submitted=false;  
    this.saveCompanyform.reset();  
  }  

  
  }


