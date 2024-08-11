import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { UserService } from '../_services/user.service';
import { NgForm } from '@angular/forms';
import { UserAuthService } from '../_services/user-auth.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-admin-login',
  templateUrl: './admin-login.component.html',
  styleUrls: ['./admin-login.component.css']
})
export class AdminLoginComponent implements OnInit{

  constructor(private httpClient: HttpClient, 
    private userAuthService: UserAuthService, 
    private userService: UserService, private router: Router) { }

  ngOnInit(): void {
    
  }

  public login(loginForm: NgForm) {
    this.userService.login(loginForm.value).subscribe({
      
      next: (response:any) => {
        this.userAuthService.setRoles(response.roles);
        this.userAuthService.setToken(response.jwtToken);

        const role = response.user.role[0]

        if (role === 'Admin') {
          this.router.navigate(['/show-all-employees']);

        } else {
          this.router.navigate(['/home']);
        }
      }, 
      error: (error) =>{
        console.log("wtf");
      }
  });
    

  }

  // public loginAdmin(): Observable<any> {
  //   return this.httpClient.get<any>(`${this.baseURL}/1`);
  // }

}
