import { Component, OnInit } from '@angular/core';
import { StockpsService } from '../stockps.service';
import { Stockp } from '../Stockp';
import { FormGroup, FormControl,Validators } from '@angular/forms';
import { Observable } from 'rxjs/internal/Observable';
import { Router } from '@angular/router';
@Component({
  selector: 'app-stkplist',
  templateUrl: './stkplist.component.html',
  styleUrls: ['./stkplist.component.css']
})
export class StkplistComponent implements OnInit {
  isupdated: boolean;


  constructor(private router:Router,private stocks: StockpsService) { }
 
  stkpList: Observable<Stockp[]>;
 
  ngOnInit() {
 
   this.stocks.getStockPr().subscribe(data => {
 
   this.stkpList = data;
 
   });
 
  }
  deleteStockPr(stocks:Stockp)

  {
 
   this.stocks.deleteStockPr(stocks.stockex).subscribe(data=>{
 
   this.stocks.getStockPr().subscribe(data=>{this.stkpList=data;});
 
  });
 
  }
  updateStockPr(stocks:Stockp ) {
    window.localStorage.removeItem("edit-stockex");
   
    window.localStorage.setItem("edit-stockex", stocks.stockex.toString());
   
     this.router.navigate(['addstkp']);
}
}
