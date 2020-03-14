import { Component, OnInit } from '@angular/core';
import { SecsService } from '../secs.service';
import{Secm}from '../secm';
import {FormControl,FormGroup,Validators} from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-addsec',
  templateUrl: './addsec.component.html',
  styleUrls: ['./addsec.component.css']
})
export class AddsecComponent implements OnInit {
  
  constructor(private router:Router,private SecsService:SecsService) { }  
  
  sec : Secm=new Secm();  
  submitted = false;  
  
  ngOnInit() {  
    this.submitted=false;  
    var sid=window.localStorage.getItem("edit-sid");
    if(sid!=null && sid!=""){
   this.SecsService.findOneInAll3(parseInt(sid))
    .subscribe(
     data => {
     this.sec =data;
     this.saveSecform.setValue(this.sec);
     }) ;
    }
     this.submitted=false;
  }  
  
  saveSecform=new FormGroup({  
    sid:new FormControl('' , [Validators.required , Validators.minLength(2) ] ),

  sectorname:new FormControl('' , [Validators.required , Validators.minLength(2) ] ),

  brief:new FormControl('' , [Validators.required , Validators.minLength(2) ] ),
 /*student_branch:new FormControl()  */
  });  
  
  saveSectors(saveSectors1){  
    this.sec=new Secm();     
    this.sec.sid=this.sid.value;  
    this.sec.sectorname=this.sectorname.value; 
    this.sec.brief=this.brief.value; 
    this.submitted = true;  
    this.save();  
    
  }  
  updateSector(updateSector1){  
    this.sec=new Secm();     
    this.sec.sid=this.sid.value;  
    this.sec.sectorname=this.sectorname.value; 
    this.sec.brief=this.brief.value; 
    this.submitted = true;  
    this.save();  
    
  }  
  save() {  
    this.SecsService.saveSectors(this.sec)  
      .subscribe(data => console.log(data), error => console.log(error));  
    this.sec = new Secm();  
    window.localStorage.removeItem("edit-sid");
    this.router.navigate(['seclist'])
  }  
  
  get sid(){  
    return this.saveSecform.get('sid');  
  }  
  get sectorname(){  
    return this.saveSecform.get('sectorname');  
  }  
  get brief(){  
    return this.saveSecform.get('brief');  
  }  
  
  saveSecForm(){  
    this.submitted=false;  
    this.saveSecform.reset();  
  }  

  

}
