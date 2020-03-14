import { Component, OnInit } from '@angular/core';
import { UserService } from '../users.service';
import{Userm}from '../userm';
import {FormControl,FormGroup,Validators} from '@angular/forms';
import { Router } from '@angular/router';
@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent implements OnInit {
  selectedFiles: FileList;
  constructor(private router:Router,private UserService:UserService) { }  
  user : Userm=new Userm();  
  submitted = false;  
  ngOnInit() {  
    this.submitted=false;  
    var username=window.localStorage.getItem("edit-username");
   this.UserService.findOneInAll6(username)
    .subscribe(
     data => {
     this.user =data;
     this.saveUserform.setValue(this.user);
     }) ;
  }  
  selectFile(event) {  
    const file = event.target.files.item(0);  
   
    if (file.type.match('image.*')) {  
      var size = event.target.files[0].size;  
      if(size > 1000000)  
      {  
          alert("size must not exceeds 1 MB");  
          this.saveUserform.get('profileImage').setValue("");  
      }  
      else  
      {  
        this.selectedFiles = event.target.files;  
      }  
    } else {  
      alert('invalid format!');  
    }  
  
  }     
  saveUserform=new FormGroup({  
    id:new FormControl('' , [Validators.required , Validators.minLength(2) ] ),

  username:new FormControl('' , [Validators.required , Validators.minLength(2) ] ),

  password:new FormControl('' , [Validators.required , Validators.minLength(6) ] ),

  

  email:new FormControl('',[Validators.required,Validators.email]),

  mobileno:new FormControl('' , [Validators.required , Validators.minLength(10),Validators.maxLength(11) ]),

  
  profileImage:new FormControl( ),

 
    /*student_branch:new FormControl()  */
  });  
  
  saveUser(saveUser1){  
    this.user=new Userm();     
    this.user.id=this.uid.value;  
    this.user.username=this.uusername.value;  
    this.user.usertype="user"; 
    this.user.mobileno=this.umobile.value;
    this.user.email=this.uemail.value;
    this.user.password=this.upassword.value;
    this.user.confirmed="no";
    this.user.profileImage=this.profileImage.value;
    this.submitted = true;  
    this.save();  
  }  
  updateUser(updateUser1){  
    this.user=new Userm();     
    this.user.id=this.uid.value;  
    this.user.username=this.uusername.value;  
    this.user.usertype=this.utype.value; 
    this.user.mobileno=this.umobile.value;
    this.user.email=this.uemail.value;
    this.user.password=this.upassword.value;
    this.user.confirmed=this.uconfirmed.value;
    this.submitted = true;  
    this.save(); 
  }  
  save() {  
    this.UserService.saveUser(this.user)  
      .subscribe(data => console.log(data), error => console.log(error));  
    this.user = new Userm();  
    window.localStorage.removeItem("edit-username");
    this.router.navigate(['userlist'])
  }  
  
  get uid(){  
    return this.saveUserform.get('id');  
  }  
  
  get uusername(){  
    return this.saveUserform.get('username');  
  }  
  
  get upassword(){  
    return this.saveUserform.get('password');  
  }  
  get utype(){  
    return this.saveUserform.get('usertype');  
  }  
  get uemail(){  
    return this.saveUserform.get('email');  
  } 
  get umobile(){  
    return this.saveUserform.get('mobileno');  
  } 
  get uconfirmed(){  
    return this.saveUserform.get('confirmed');  
  }
  get profileImage(){  
    return this.saveUserform.get('profileImage');  
  }
  saveUserForm(){  
    this.submitted=false;  
    this.saveUserform.reset();  
  }  
  
   
  }


