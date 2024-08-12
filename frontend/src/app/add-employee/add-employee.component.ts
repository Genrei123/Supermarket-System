import { Component } from '@angular/core';
import { Employee } from '../employee';
import { Observable } from 'rxjs';
import { EmployeeService } from '../employee.service';
import { Router } from '@angular/router';
import { FormsModule, NgForm } from '@angular/forms';
import { HttpClient } from '@angular/common/http';





@Component({
  selector: 'app-add-employee',
  templateUrl: './add-employee.component.html'
  ,
  styleUrls: ['./add-employee.component.css']
})
export class AddEmployeeComponent //implements OnInit//
{

  constructor(
    private employeeService: EmployeeService,
    private router: Router,
    private http: HttpClient

  ) {

  }




 
 

  submitform!: NgForm;
  private baseURL = "http://localhost:8080/add";
  employee: Employee = new Employee();
  

  saveEmployee() {
    this.employeeService.addEmployee(this.employee).subscribe(data => {
      console.log("hello" + data);
      this.goToEmployeeList();
    },
      error => console.log(error));
  }

  goToEmployeeList() {
    this.router.navigate(['/show-all-employees']);
  }

  ngOnInit(): void { }
  onSubmit( form: NgForm) {
    if (form.valid) {
      this.http.post(this.baseURL, form.value)
      .subscribe((response) => {
        console.log(response);
        this.router.navigate(['/show-all-employees']);
      });
    }
  }


}









