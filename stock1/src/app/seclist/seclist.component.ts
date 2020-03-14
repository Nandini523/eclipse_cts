import { Component, OnInit } from '@angular/core';

import { SecsService } from '../secs.service';
import { Secm } from '../Secm';
import { FormGroup, FormControl,Validators } from '@angular/forms';
import { Observable } from 'rxjs/internal/Observable';
import { Router } from '@angular/router';
@Component({
  selector: 'app-seclist',
  templateUrl: './seclist.component.html',
  styleUrls: ['./seclist.component.css']
})
export class SeclistComponent implements OnInit {
  isupdated: boolean;


  constructor(private router:Router,private secs: SecsService) { }
 
  secList: Observable<Secm[]>;
 
  ngOnInit() {
 
   this.secs.getSectors().subscribe(data => {
 
   this.secList = data;
 
   });
 
  }
  deleteSector(secs:Secm)

  {
 
   this.secs.deleteSector(secs.sid).subscribe(data=>{
 
   this.secs.getSectors().subscribe(data=>{this.secList=data;});
 
  });
 
  }
  updateSector(secs : Secm ) {
    window.localStorage.removeItem("edit-sid");
   
    window.localStorage.setItem("edit-sid", secs.sid.toString());
   
     this.router.navigate(['addsec']);
    }
}
