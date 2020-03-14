import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {RouterModule,Routes}from '@angular/router'
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NvBarComponent } from './nv-bar/nv-bar.component';
import { LoginComponent } from './login/login.component';
import { SignupComponent } from './signup/signup.component';
import { HomeComponent } from './home/home.component';
import { StockComponent } from './stock/stock.component';
import { Home1Component } from './home1/home1.component';
import { UserComponent } from './user/user.component';
import { UidComponent } from './uid/uid.component';
import { IdComponent } from './id/id.component';
import { McComponent } from './mc/mc.component';
import { AdduserComponent } from './adduser/adduser.component';
import { HttpClientModule } from '@angular/common/http';  
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { UserlistComponent } from './userlist/userlist.component';
import { CompanylistComponent } from './companylist/companylist.component';
import { AddcomComponent } from './addcom/addcom.component';
import { AddiposComponent } from './addipos/addipos.component';
import { IpolistComponent } from './ipolist/ipolist.component';
import { SeclistComponent } from './seclist/seclist.component';
import { AddsecComponent } from './addsec/addsec.component';
import { StockxlistComponent } from './stockxlist/stockxlist.component';
import { AddstkComponent } from './addstk/addstk.component';
import { StkplistComponent } from './stkplist/stkplist.component';
import { AddstkpComponent } from './addstkp/addstkp.component';
import { CompareCompanyComponent } from './comparecompany/comparecompany.component';
import { HighchartsChartModule } from 'highcharts-angular';
import { HighchartService } from './comparecompany/Highchart.service';

@NgModule({
  declarations: [
    AppComponent,
    NvBarComponent,
    LoginComponent,
    SignupComponent,
    HomeComponent,
    StockComponent,
    Home1Component,
    UserComponent,
    UidComponent,
    IdComponent,
    McComponent,
    AdduserComponent,
    UserlistComponent,
    CompanylistComponent,
    AddcomComponent,
    AddiposComponent,
    IpolistComponent,
    SeclistComponent,
    AddsecComponent,
    StockxlistComponent,
    AddstkComponent,
    StkplistComponent,
    AddstkpComponent,
    CompareCompanyComponent,
    
  ],
  imports: [
    BrowserModule,
    HttpClientModule,  
    FormsModule,  
  
    ReactiveFormsModule, 
    RouterModule.forRoot([
      {path:'Login',component:LoginComponent},
      {path: 'signup',component:SignupComponent},
      {path:'home',component:HomeComponent},
      {path:'',component:StockComponent},
      {path:'stock',component:StockComponent},
      {path:'Home1',component:Home1Component},
      {path:'user',component:UserComponent},
      {path:'uid',component:UidComponent},
      {path:'id',component:IdComponent},
      {path:'mc',component:McComponent},
      {path:'userlist',component:UserlistComponent},
      {path:'addcom',component:AddcomComponent},
      {path:'addipos',component:AddiposComponent},
      {path:'ipolist',component:IpolistComponent},
      {path:'seclist',component:SeclistComponent},
      {path:'addsec',component:AddsecComponent},
      {path:'stockxlist',component:StockxlistComponent},
      {path:'addstk',component:AddstkComponent},
      {path:'stkplist',component:StkplistComponent},
      {path:'addstkp',component:AddstkpComponent},
      {path:'comparecompany',component:CompareCompanyComponent}
    ])
  ],
  providers: [HighchartService],
  bootstrap: [AppComponent]
})
export class AppModule { }
