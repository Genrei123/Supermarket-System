import { Component } from '@angular/core';
import { Employee } from '../employee';
import { EmployeeService } from '../employee.service';
import{FormsModule} from '@angular/forms'

import { Router } from '@angular/router';
import { UserService } from '../_services/user.service';
import { ItemService } from './items.service';
@Component({
  selector: 'app-employee-list',
  templateUrl: './employee-list.component.html',
  styleUrls: ['./employee-list.component.css']
})
export class EmployeeListComponent {

  employees: Employee[];
  EnteredID!:number;

  constructor(
    public itemService: ItemService,
    private userAuthService: UserService,
    private employeeService: EmployeeService,  
    private router: Router,
    public userService: UserService) {
    this.employees=[];
   
   }

  ngOnInit(): void {
    
    // this.employees = [
    //   { "id":1,fname: 'John', lname: 'Doe', email: 'john@example.com', salary: 50000, department: 'IT', designation: 'Developer' },
      
    // ];
    
    this.getEmployees();
  }

  

  

 

  


  goToEmployee(){
    console.log(); 
    this.router.navigate(['details-of-employee',this.EnteredID]);
  }

  getEmployees(){
    // this.employeeService.getEmployeesList().subscribe(data => {this.employees = data;});
    this.itemService.getItemList().subscribe({
      next: (data) => {
        this.employees = data;
      },
      error: (error) => {
        console.log(error);
      }
    })
  }

  updateEmployee(id: number){
    this.router.navigate(['updating-by-id', id]);
  }

  deleteEmployee(id: number){

    if(confirm("Are you sure to delete Product ID: "+id)){
    this.itemService.deleteEmployee(id).subscribe( data => {
      console.log(data);
      this.getEmployees();
    })}
  }
 
  detailsOfEmployee(id: number){
    this.router.navigate(['details-of-employee', id]);
  }

  

  

  

  
}
