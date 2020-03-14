import { Component, OnInit } from '@angular/core';
import { UserService } from '../users.service';
import{Userm}from '../userm';
import {FormControl,FormGroup,Validators} from '@angular/forms';  

@Component({
  selector: 'app-adduser',
  templateUrl: './adduser.component.html',
  styleUrls: ['./adduser.component.css']
})
export class AdduserComponent implements OnInit {
  
  constructor() { }  
  
  ngOnInit() {  
      
  }  
  
  
}
