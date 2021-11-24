import { NgModule } from '@angular/core';
import { HttpModule } from '@angular/http';
import { BrowserModule } from '@angular/platform-browser';
import { RouterModule,Routes} from '@angular/router'

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { VendorComponent } from './vendor/vendor.component';
import { VendorSearchComponent } from './vendor-search/vendor-search.component';
import { FormsModule } from '@angular/forms';
import { CustomerComponent } from './customer/customer.component';
import { CutomerSearchComponent } from './cutomer-search/cutomer-search.component';
import { CustomerloginComponent } from './customerlogin/customerlogin.component';
import { VendorloginComponent } from './vendorlogin/vendorlogin.component';
import { HomePageComponent } from './home-page/home-page.component';
import { CustomerDashboardComponent } from './customer-dashboard/customer-dashboard.component';
import { VendorDashboardComponent } from './vendor-dashboard/vendor-dashboard.component';
import { CustomerInfoComponent } from './customer-info/customer-info.component';
import { VendorInfoComponent } from './vendor-info/vendor-info.component';
import { VendorOrdersComponent } from './vendor-orders/vendor-orders.component';
import { VendorPendingOrdersComponent } from './vendor-pending-orders/vendor-pending-orders.component';
import { CustomerOrdersComponent } from './customer-orders/customer-orders.component';
import { CustomerPendingOrdersComponent } from './customer-pending-orders/customer-pending-orders.component';
import { CustomerWalletComponent } from './customer-wallet/customer-wallet.component';
import { CustomerWalletsComponent } from './customer-wallets/customer-wallets.component';
import { PlaceOrderComponent } from './place-order/place-order.component';
import { AddCustomerComponent } from './add-customer/add-customer.component';
import { AddVendorComponent } from './add-vendor/add-vendor.component';
import { AddMenuComponent } from './add-menu/add-menu.component';

const appRoutes: Routes=
[
  {path:'' ,component:HomePageComponent},
  {path:'HomePage' ,component:HomePageComponent},

  {path: 'CustomerDashboard',component:CustomerDashboardComponent},
  {path: 'CustomerDashboard',component:CustomerDashboardComponent,children : [
    {path: 'Customer',component:CustomerComponent,outlet : "Rllproject"},
    {path: 'CustomerSearch',component:CutomerSearchComponent,outlet : "Rllproject"},
    {path: 'CustomerInfo',component:CustomerInfoComponent,outlet : "Rllproject"},
    {path: 'CustomerOrders',component:CustomerOrdersComponent,outlet : "Rllproject"},
    {path: 'CustomerPendingOrders',component:CustomerPendingOrdersComponent,outlet : "Rllproject"},
    {path: 'CustomerWallets',component:CustomerWalletsComponent,outlet : "Rllproject"},
    {path: 'CustomerWallet',component:CustomerWalletComponent,outlet : "Rllproject"},
    {path: 'PlaceOrder',component:PlaceOrderComponent,outlet : "Rllproject"},

  ]},

  {path: 'VendorDashboard',component:VendorDashboardComponent},
  {path: 'VendorDashboard',component:VendorDashboardComponent,children : [
    {path: 'Vendor',component:VendorComponent,outlet : "Rllproject"},
    {path: 'VendorSearch',component:VendorSearchComponent,outlet : "Rllproject"},
    {path: 'VendorInfo',component:VendorInfoComponent,outlet : "Rllproject"},
    {path: 'VendorOrders',component:VendorOrdersComponent,outlet : "Rllproject"},
    {path: 'VendorPendingOrders',component:VendorPendingOrdersComponent,outlet : "Rllproject"},
    {path: 'addMenu',component:AddMenuComponent,outlet : "Rllproject"},

  ]},

  {path:'CustomerLogin',component:CustomerloginComponent}, 
   {path:'addCustomer',component:AddCustomerComponent},
   {path:'addVendor',component:AddVendorComponent},


  {path:'VendorLogin',component:VendorloginComponent}

]

@NgModule({
  declarations: [
    AppComponent,
    VendorComponent,
    VendorSearchComponent,
    CustomerComponent,
    CutomerSearchComponent,
    CustomerloginComponent,
    VendorloginComponent,
    HomePageComponent,
    CustomerDashboardComponent,
    VendorDashboardComponent,
    CustomerInfoComponent,
    VendorInfoComponent,
    VendorOrdersComponent,
    VendorPendingOrdersComponent,
    CustomerOrdersComponent,
    CustomerPendingOrdersComponent,
    CustomerWalletComponent,
    CustomerWalletsComponent,
    PlaceOrderComponent,
    AddCustomerComponent,
    AddVendorComponent,
    AddMenuComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpModule,
    FormsModule,
    RouterModule.forRoot(appRoutes)
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
