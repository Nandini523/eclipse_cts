import { Component, OnInit } from '@angular/core';
import { StockxsService } from '../stockxs.service';
import { Stockxm } from '../Stockxm';
import { FormGroup, FormControl,Validators } from '@angular/forms';
import { Observable } from 'rxjs/internal/Observable';
import { Router } from '@angular/router';
@Component({
  selector: 'app-stockxlist',
  templateUrl: './stockxlist.component.html',
  styleUrls: ['./stockxlist.component.css']
})
export class StockxlistComponent implements OnInit {
  isupdated: boolean;


  constructor(private router:Router,private stockxs: StockxsService) { }
 
  stockxList: Observable<Stockxm[]>;
 
  ngOnInit() {
 
   this.stockxs.getStockEx().subscribe(data => {
 
   this.stockxList = data;
 
   });
}
deleteStockEx(stockxs:Stockxm)

  {
 
   this.stockxs.deleteStockEx(stockxs.seid).subscribe(data=>{
 
   this.stockxs.getStockEx().subscribe(data=>{this.stockxList=data;});
 
  });
 
  }
  updateStockEx(stockxs : Stockxm ) {
    window.localStorage.removeItem("edit-seid");
   
    window.localStorage.setItem("edit-seid", stockxs.seid.toString());
   
     this.router.navigate(['addstk']);
    }
}