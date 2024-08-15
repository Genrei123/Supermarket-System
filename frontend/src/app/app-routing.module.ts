import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { EmployeeListComponent } from './employee-list/employee-list.component';
import { AddEmployeeComponent } from './add-employee/add-employee.component';
import { UpdateEmployeeComponent } from './update-employee/update-employee.component';
import { ShowDetailsComponent } from './show-details/show-details.component';
import { HomeComponent } from './home/home.component';
import { AdminLoginComponent } from './admin-login/admin-login.component';
import { CartComponent } from './cart/cart.component';
import { AuthGuard } from './_auth/auth.guard';
import { RegisterComponent } from './register/register.component';
import { CheckoutComponent } from './checkout/checkout.component';
import { BuyComponent } from './buy/buy.component';

  

const routes: Routes = [

  {path:"show-all-employees",component: EmployeeListComponent, canActivate:[AuthGuard], data: {roles: ['Admin', 'User']}},
  {path:"add-employee", component: AddEmployeeComponent, canActivate:[AuthGuard], data: {roles: ['Admin']}},
  {path:'', redirectTo: "login", pathMatch:"full"},
  {path:'updating-by-id/:id',component:UpdateEmployeeComponent, canActivate:[AuthGuard], data: {roles: ['Admin']}},
  {path:'user/:id',component:ShowDetailsComponent},
  {path:'home',component:HomeComponent},
  {path:'login',component:AdminLoginComponent},
  {path:'register',component:RegisterComponent},
  {path:'cart',component:CartComponent},,
  {path:'checkout',component:BuyComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
