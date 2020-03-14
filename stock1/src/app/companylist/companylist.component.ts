import { Component, OnInit } from '@angular/core';
import { CompanysService } from '../companys.service';
import { Companym } from '../companym';
import { FormGroup, FormControl } from '@angular/forms';
import { Observable } from 'rxjs/internal/Observable';

@Component({
  selector: 'app-companylist',
  templateUrl: './companylist.component.html',
  styleUrls: ['./companylist.component.css']
})
export class CompanylistComponent implements OnInit {

  isupdated: boolean;


 constructor(private companys: CompanysService) { }

 companylist: Observable<Companym[]>;

 ngOnInit() {

  this.companys.getAllCompanies().subscribe(data => {

  this.companylist = data;

  });

 }


}
