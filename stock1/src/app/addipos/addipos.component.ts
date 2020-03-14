import { Component, OnInit } from '@angular/core';
import { IposService } from '../ipos.service';
import{Addipom}from '../addipom';
import {FormControl,FormGroup,Validators} from '@angular/forms';
import { Router } from '@angular/router';
@Component({
  selector: 'app-addipos',
  templateUrl: './addipos.component.html',
  styleUrls: ['./addipos.component.css']
})
export class AddiposComponent implements OnInit {
  constructor(private router:Router,private IposService:IposService) { }  
  
  ipo : Addipom=new Addipom();  
  submitted = false;  
  
  ngOnInit() {  
    this.submitted=false;  
    var ipoid=window.localStorage.getItem("edit-ipoid");
   this.IposService.findOneInAll2(parseInt(ipoid))
    .subscribe(
     data => {
     this.ipo =data;
     this.saveIpoform.setValue(this.ipo);
     }) ;
  }  
  
  saveIpoform=new FormGroup({  
    ipoid:new FormControl('' , [Validators.required , Validators.minLength(2) ] ),

  companyName:new FormControl('' , [Validators.required , Validators.minLength(2) ] ),

  stockExchange:new FormControl('' , [Validators.required , Validators.minLength(2) ] ),

  priceperShare:new FormControl('' , [Validators.required , Validators.minLength(2) ] ),

  totalnoofShares:new FormControl('',[Validators.required,Validators.minLength(2)]),

  date:new FormControl(),

  time:new FormControl(),

 
    /*student_branch:new FormControl()  */
  });  
  
  saveIpoDetails(saveIpoDetails1){  
    this.ipo=new Addipom();     
    this.ipo.ipoid=this.ipoid.value;  
    this.ipo.companyName=this.companyName.value;  
    this.ipo.stockExchange=this.stockExchange.value; 
    this.ipo.priceperShare=this.priceperShare.value;
    
    this.ipo.totalnoofShares=this.totalnoofShares.value;
    this.ipo.date=this.date.value;
    this.ipo.time=this.time.value;
    this.submitted = true;  
    this.save();  
  }  
  updateCompany(updateCompany1){  
    this.ipo=new Addipom();     
    this.ipo.ipoid=this.ipoid.value;  
    this.ipo.companyName=this.companyName.value;  
    this.ipo.stockExchange=this.stockExchange.value; 
    this.ipo.priceperShare=this.priceperShare.value;
    this.ipo.totalnoofShares=this.totalnoofShares.value;
    this.ipo.date=this.date.value;
    this.ipo.time=this.time.value;   
    this.submitted = true;  
    this.save();  
    
  }  
  save() {  
    this.IposService.saveIpoDetails(this.ipo)  
      .subscribe(data => console.log(data), error => console.log(error));  
    this.ipo = new Addipom();  
    window.localStorage.removeItem("edit-ipoid");
    this.router.navigate(['ipolist'])
  }  
  
  get ipoid(){  
    return this.saveIpoform.get('ipoid');  
  }  
  get companyName(){  
    return this.saveIpoform.get('companyName');  
  }  
  get stockExchange(){  
    return this.saveIpoform.get('stockExchange');  
  }  
  get priceperShare(){  
    return this.saveIpoform.get('priceperShare');  
  }  
  get totalnoofShares(){  
    return this.saveIpoform.get('totalnoofShares');  
  }  
  get date(){  
    return this.saveIpoform.get('date');  
  }  
  get time(){  
    return this.saveIpoform.get('time');  
  }  
  saveIpoForm(){  
    this.submitted=false;  
    this.saveIpoform.reset();  
  }  

}
