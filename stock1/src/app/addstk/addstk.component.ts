import { Component, OnInit } from '@angular/core';
import { StockxsService } from '../stockxs.service';
import{Stockxm}from '../stockxm';
import {FormControl,FormGroup,Validators} from '@angular/forms';
import { Router } from '@angular/router';
@Component({
  selector: 'app-addstk',
  templateUrl: './addstk.component.html',
  styleUrls: ['./addstk.component.css']
})
export class AddstkComponent implements OnInit {

  constructor(private router:Router,private StockxsService:StockxsService) { }
  stk : Stockxm=new Stockxm();  
  submitted = false;  
  ngOnInit() {
    this.submitted=false;  
    var seid=window.localStorage.getItem("edit-seid");
   this.StockxsService.findOneInAll4(parseInt(seid))
    .subscribe(
     data => {
     this.stk =data;
     this.saveStkxform.setValue(this.stk);
     }) ;
  }
  saveStkxform=new FormGroup({  
    seid:new FormControl('' , [Validators.required , Validators.minLength(2) ] ),

  stockx:new FormControl('' , [Validators.required , Validators.minLength(2) ] ),

  brief:new FormControl('' , [Validators.required , Validators.minLength(2) ] ),
  remarks:new FormControl('' , [Validators.required , Validators.minLength(2) ] ),
  caddress:new FormControl('' , [Validators.required , Validators.minLength(2) ] ),

 /*student_branch:new FormControl()  */
  });  
  
  saveStkx(saveStkx1){  
    this.stk=new Stockxm();     
    this.stk.seid=this.seid.value;  
    this.stk.stockx=this.stockx.value; 
    this.stk.brief=this.brief.value; 
    this.stk.remarks=this.remarks.value; 
    this.stk.caddress=this.caddress.value; 
    this.submitted = true;  
    this.save();  
  }  
  updateStkx(updateStkx1){  
    this.stk=new Stockxm();     
    this.stk.seid=this.seid.value;  
    this.stk.stockx=this.stockx.value; 
    this.stk.brief=this.brief.value; 
    this.stk.remarks=this.remarks.value; 
    this.stk.caddress=this.caddress.value; 
    this.submitted = true;  
    this.save();  
    
  }  
  save() {  
    this.StockxsService.saveStockEx(this.stk)  
      .subscribe(data => console.log(data), error => console.log(error));  
    this.stk = new Stockxm();  
    window.localStorage.removeItem("edit-seid");
    this.router.navigate(['stockxlist'])
  }  
  
  get seid(){  
    return this.saveStkxform.get('seid');  
  }  
  get stockx(){  
    return this.saveStkxform.get('stockx');  
  }  
  get brief(){  
    return this.saveStkxform.get('brief');  
  }  
  get remarks(){  
    return this.saveStkxform.get('remarks');  
  }  
  get caddress(){  
    return this.saveStkxform.get('caddress');  
  }  

  saveStkForm(){  
    this.submitted=false;   
    this.saveStkxform.reset();  
  }  
}
