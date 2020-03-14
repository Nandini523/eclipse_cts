import { Component, OnInit } from '@angular/core';
import { UserService } from '../users.service';
import { Userm } from '../userm';
import { FormGroup, FormControl,Validators } from '@angular/forms';
import { Observable } from 'rxjs/internal/Observable';
import { Router } from '@angular/router';
@Component({
 selector: 'app-userlist',
 templateUrl: './userlist.component.html',
styleUrls: ['./userlist.component.css']
})
export class UserlistComponent implements OnInit {

 isupdated: boolean;


 constructor(private router:Router,private users: UserService) { }

 userList: Observable<Userm[]>;

 ngOnInit() {

  this.users.getAllUsers().subscribe(data => {

  this.userList = data;
  });
 }
 deleteUser(users:Userm)

 {

  this.users.deleteUser(users.username).subscribe(data=>{

  this.users.getAllUsers().subscribe(data=>{this.userList=data;});

 });

 }
 updateUser(users : Userm ) {
   window.localStorage.removeItem("edit-username");
  
   window.localStorage.setItem("edit-username", users.username.toString());
  
    this.router.navigate(['signup']);
   }
  }

