import { Component, OnInit } from '@angular/core';
import { UserService } from '../users.service';
import{Userm}from '../userm';
import {FormControl,FormGroup,Validators} from '@angular/forms';
import { Router } from '@angular/router';
@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor(private router: Router,private UserService:UserService) { }  
  userNew : Userm=new Userm(); 
  user : Userm=new Userm();  
  submitted = false;  

  ngOnInit() {
  }
  saveUserform=new FormGroup({  
  username:new FormControl('' , [Validators.required , Validators.minLength(2) ] ),

  password:new FormControl('' , [Validators.required , Validators.minLength(6) ] ),
    /*student_branch:new FormControl()  */
  });  
  saveUser(saveuser) {

    this.user = new Userm();
  
    // this.user.id = this.usersaveform.get('id').value;
  
    //console.log(this.user.id);
  
    this.user.username = this.saveUserform.get('username').value;
  
    this.user.password = this.saveUserform.get('password').value;
  
    // this.user.email = this.usersaveform.get('email').value;
  
    // this.user.contact = this.usersaveform.get('contact').value;
  
    // console.log(this.user.contact);
  
    //this.user.userType = this.usersaveform.get('userType').value;
  
    //this.user.confirmed = this.usersaveform.get('confirmed').value;
  
    //console.log(this.user.confirmed);
  
    this.submitted = true;
  
    this.UserService.findByUsernameAndPassword(this.user.username, this.user.password).subscribe(data =>{
  
    this.userNew=data;
  
    if(this.userNew!=null && this.userNew.usertype=='admin'){
  
     this.router.navigate(['Home1']);
  
    }
  
    else if(this.userNew!=null && this.userNew.usertype=='user'){
  
     this.router.navigate(['user']);
  
    }
  else{
    alert("invalid login")
      this.router.navigate(['Login']);
  
  }
  
   },
  
     error => console.log(console.error()));
  
  }
  
  

  }
