import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { EmployeeListComponent } from './employee-list/employee-list.component';
import { AddEmployeeComponent } from './add-employee/add-employee.component';
import { UpdateEmployeeComponent } from './update-employee/update-employee.component';
import { ShowDetailsComponent } from './show-details/show-details.component';
import { HomeComponent } from './home/home.component';
import { AdminLoginComponent } from './admin-login/admin-login.component';
import { AuthGuard } from './_auth/auth.guard';

  

const routes: Routes = [

  {path:"show-all-employees",component: EmployeeListComponent },
  {path:"add-employee", component: AddEmployeeComponent, canActivate:[AuthGuard], data: {roles: ['Admin']}},
  {path:'', redirectTo: "login", pathMatch:"full"},
  {path:'updating-by-id/:id',component:UpdateEmployeeComponent, canActivate:[AuthGuard], data: {roles: ['Admin']}},
  {path:'details-of-employee/:id',component:ShowDetailsComponent},
  {path:'home',component:HomeComponent},
  {path:'login',component:AdminLoginComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
