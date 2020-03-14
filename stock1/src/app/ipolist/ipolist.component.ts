import { Component, OnInit } from '@angular/core';
import { IposService } from '../ipos.service';
import { Addipom } from '../Addipom';
import { FormGroup, FormControl,Validators } from '@angular/forms';
import { Observable } from 'rxjs/internal/Observable';
import { Router } from '@angular/router';
@Component({
  selector: 'app-ipolist',
  templateUrl: './ipolist.component.html',
  styleUrls: ['./ipolist.component.css']
})
export class IpolistComponent implements OnInit {

  isupdated: boolean;


 constructor(private router:Router,private ipos: IposService) { }

 ipoList: Observable<Addipom[]>;

 ngOnInit() {

  this.ipos.getIpoDetails().subscribe(data => {

  this.ipoList = data;

  });
 }
 deleteIpos(ipos:Addipom)

 {

  this.ipos.deleteIpos(ipos.ipoid).subscribe(data=>{

  this.ipos.getIpoDetails().subscribe(data=>{this.ipoList=data;});

 });
  }
  updateIpoDetails(ipos : Addipom ) {
    window.localStorage.removeItem("edit-ipoid");
   
    window.localStorage.setItem("edit-ipoid", ipos.ipoid.toString());
   
     this.router.navigate(['addipos']);
    }
 }



