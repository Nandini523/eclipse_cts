import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import{LoginComponent} from './login/login.component';
import { SignupComponent } from './signup/signup.component';
import{HomeComponent}from './home/home.component'
import { StockComponent } from './stock/stock.component';
import { Home1Component } from './Home1/Home1.component';
import { UserComponent } from './user/user.component';
import { UidComponent } from './uid/uid.component';
import { IdComponent } from './id/id.component';
import { McComponent } from './mc/mc.component';
import { UserlistComponent } from './userlist/userlist.component';
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
const routes: Routes = [{path:"login",
component:LoginComponent
},
{path:'userlist',component:UserlistComponent},
{path:"signup",component:SignupComponent},
{path:"home",component:HomeComponent},
{path:'Home1',component:Home1Component},
{path:'',component:StockComponent},
{path:'stock',component:StockComponent},
{path:'user',component:UserComponent},
{path:'uid',component:UidComponent},
{path:'id',component:IdComponent},
{path:'mc',component:McComponent},
{path:'addipos',component:AddiposComponent},
{path:'ipolist',component:IpolistComponent},
{path:'seclist',component:SeclistComponent},
{path:'addsec',component:AddsecComponent},
{path:'stockxlist',component:StockxlistComponent},
{path:'addstk',component:AddstkComponent},
{path:'stkplist',component:StkplistComponent},
{path:'addstkp',component:AddstkpComponent},
{path:'comparecompany',component:CompareCompanyComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
