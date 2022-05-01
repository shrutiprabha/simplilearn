import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AddproductComponent } from './addproduct/addproduct.component';
import { ListComponent } from './list/list.component';
import { AdminComponent } from './admin/admin.component';
import { AdminlogoutComponent } from './adminlogout/adminlogout.component';
import { OrderdetailsComponent } from './orderdetails/orderdetails.component';
import { PurchaseComponent } from './purchase/purchase.component';
import { SearchproductComponent } from './searchproduct/searchproduct.component';
import { UserComponent } from './user/user.component';
import { AdmindashboardComponent } from './admindashboard/admindashboard.component';
import { UserdashboardComponent } from './userdashboard/userdashboard.component';
import { UserlogoutComponent } from './userlogout/userlogout.component';

@NgModule({
  declarations: [
    AppComponent,
    AddproductComponent,
    ListComponent,
    AdminComponent,
    AdminlogoutComponent,
    OrderdetailsComponent,
    PurchaseComponent,
    SearchproductComponent,
    UserComponent,
    AdmindashboardComponent,
    UserdashboardComponent,
    UserlogoutComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
