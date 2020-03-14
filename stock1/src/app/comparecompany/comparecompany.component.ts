/*import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-comparecompany',
  templateUrl: './comparecompany.component.html',
  styleUrls: ['./comparecompany.component.css']
})
export class ComparecompanyComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }

}
*/
import { Component, OnInit,ViewChild,

  ElementRef,
 AfterViewInit,
  OnDestroy,
  ChangeDetectorRef, } from '@angular/core';
 
 import { CompanysService } from 'src/app/companys.service';
 
 import { StockpsService } from 'src/app/stockps.service';
 
 import { Router } from '@angular/router';
 
 import { Companym } from 'src/app/companym';
 
 import { Observable } from 'rxjs/internal/Observable';
 
 import { Stockp } from 'src/app/stockp';
 
 import { SecsService } from 'src/app/secs.service';
 
 import { FormGroup, FormControl, FormBuilder, Validators } from '@angular/forms';
 
 import { Secm } from 'src/app/secm';
 
 import { of } from 'rxjs';
 
 import { getSyntheticPropertyName } from '@angular/compiler/src/render3/util';
 
 //import { HighchartService } from './Highchart.service';
 
 import * as Highcharts from 'highcharts';
 
 @Component({
 
  selector: 'app-comparecompany',
 
  templateUrl: './comparecompany.component.html',
 
  styleUrls: ['./comparecompany.component.css']
 
 })
 
 export class CompareCompanyComponent implements OnInit {
 
 
  myGroup: FormGroup;
 
  constructor(private formBuilder: FormBuilder,private router:Router,private companyserviceservice:CompanysService,private sectorsserviceservice: SecsService,private stockpriceservice:StockpsService) { }
 
  companyList: Companym[];
 
  companyListAll: Companym[];
 
  sectorsList: Secm[];
 
  stockpriceList: Observable<Stockp[]>;
 
  ngOnInit() {
 
    this.stockpriceservice.getmultiplelinechart().subscribe(result => {

      var formatteddata = [];
   
      for (var key in result) {
   
       var singleObject = {
   
        name: '',
   
        data: []
   
       }
   
       singleObject.name = key.toUpperCase();
   
       for (var i = 0; i < result[key].length; i++) {
   
        singleObject.data.push(parseInt(result[key][i].cprice));
   
       }
   
       formatteddata.push(singleObject);
   
      }
   
      this.drawMultipleLineChart(formatteddata);
   
     });
   
     this.myGroup = this.formBuilder.group({
   
    
    "choose": new FormControl([ Validators.required ]),
 
    "sectorname": new FormControl([ Validators.required ]),
 
    "companyname": new FormControl([ Validators.required ]),
 
    "fromdate":new FormControl([ Validators.required ]),
 
    "todate":new FormControl([ Validators.required ])
 
    })
 
   this.companyserviceservice.getAllCompanies().subscribe(data => {
 
    this.companyList = data;
 
    this.companyListAll=data;
 
    this.companyList=this.companyList.filter(comp=>comp.sector == 'NSE') ;
 
    })
 
    this.stockpriceservice.getStockPr().subscribe(data => {
 
    this.stockpriceList = data;
 
    })
 
    this.sectorsserviceservice.getSectors().subscribe(data => {
 
     this.sectorsList = data;
 
     })
 
  }
 
  sectorChange()
 
  {
 
   alert(1234);
 
   var sectorValue=this.myGroup.controls['sectorname'].value;
 
   this.companyList=this.companyListAll.filter(comp=>comp.sector == sectorValue) ;
 
  }
  drawMultipleLineChart(formatteddata) {

    Highcharts.chart('container', {
   
      title: {
   
       text: 'Current Price'
   
      },
   
      subtitle: {
   
       text: 'Growth of Stock-Price'
   
      },
   
      yAxis: {
   
       title: {
   
        text: 'Number of Companies'
   
       }
   
      },
   
      legend: {
   
       layout: 'vertical',
   
       align: 'right',
   
       verticalAlign: 'middle'
   
      },
   
      plotOptions: {
   
       series: {
   
        label: {
   
         connectorAllowed: false
   
        },
   
        pointStart: 2000
   
       }
   
      },
   
      series: formatteddata,
   
      responsive: {
   
       rules: [{
   
        condition: {
   
         maxWidth: 500
   
        },
   
        chartOptions: {
   
         legend: {
   
          layout: 'horizontal',
   
          align: 'center',
   
          verticalAlign: 'bottom'
   
         }
   
        }
   
       }]
   
      }
   
     });
   
    }
 
  }
 
 
 
 