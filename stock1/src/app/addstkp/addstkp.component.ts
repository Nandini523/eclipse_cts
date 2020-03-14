import { Component, OnInit } from '@angular/core';
import { StockpsService } from '../stockps.service';
import{Stockp}from '../stockp';
import {FormControl,FormGroup,Validators} from '@angular/forms';
import { Router } from '@angular/router';
@Component({
  selector: 'app-addstkp',
  templateUrl: './addstkp.component.html',
  styleUrls: ['./addstkp.component.css']
})
export class AddstkpComponent implements OnInit {
  constructor(private router:Router,private StockpsService:StockpsService) { }
  stkp : Stockp=new Stockp();  
  submitted = false;  
  ngOnInit() {
    this.submitted=false;  
    var stockex=window.localStorage.getItem("edit-stockex");
   this.StockpsService.findOneInAll5(stockex)
    .subscribe(
     data => {
     this.stkp =data;
     this.saveStkpform.setValue(this.stkp);
     }) ;
  }
  saveStkpform=new FormGroup({  
    companyname:new FormControl('' , [Validators.required , Validators.minLength(2) ] ),

  stockex:new FormControl('' , [Validators.required , Validators.minLength(2) ] ),

  cprice:new FormControl('' , [Validators.required , Validators.minLength(2) ] ),
  date:new FormControl('' , [Validators.required , Validators.minLength(2) ] ),
  time:new FormControl('' , [Validators.required , Validators.minLength(1) ] ),
  uploadfile:new FormControl('' ),

 /*student_branch:new FormControl()  */
  });  
  
  saveStkp(saveStkp1){  
    this.stkp=new Stockp();     
    this.stkp.companyname=this.companyname.value;  
    this.stkp.stockex=this.stockex.value; 
    this.stkp.cprice=this.cprice.value; 
    this.stkp.date=this.date.value; 
    this.stkp.time=this.time.value;
    this.stkp.uploadfile=this.uploadfile.value;
    
    this.submitted = true;  
    this.save();  
  }  
  updateStkp(updateStkp1){  
    this.stkp=new Stockp();     
    this.stkp.companyname=this.companyname.value;  
    this.stkp.stockex=this.stockex.value; 
    this.stkp.cprice=this.cprice.value; 
    this.stkp.date=this.date.value; 
    this.stkp.time=this.time.value;
    this.stkp.uploadfile=this.uploadfile.value;
    this.submitted = true;  
    this.save();  
  }  
  save() {  
    this.StockpsService.saveStockPr(this.stkp)  
      .subscribe(data => console.log(data), error => console.log(error));  
    this.stkp = new Stockp();  
    window.localStorage.removeItem("edit-stockex");
    this.router.navigate(['stkplist'])
  }  
  
  get companyname(){  
    return this.saveStkpform.get('companyname');  
  }  
  get stockex(){  
    return this.saveStkpform.get('stockex');  
  }  
  get cprice(){  
    return this.saveStkpform.get('cprice');  
  }  
  get date(){  
    return this.saveStkpform.get('date');  
  }  
  get time(){  
    return this.saveStkpform.get('time');  
  }  
  get uploadfile(){  
    return this.saveStkpform.get('uploadfile');  
  }  
  
  saveStkpForm(){  
    this.submitted=false;  
    this.saveStkpform.reset();  
  }  
  
}
