import { Component } from '@angular/core';
import { NgForm } from '@angular/forms';
import { UserService } from '../_services/user.service';
import { UserAuthService } from '../_services/user-auth.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent {

  constructor(private userService: UserService, private userAuthService: UserAuthService, private router: Router) { }

  ngOnInit(): void {
  }

  register(form : NgForm) {
    // Send the form data to the server
    console.log(form.value);
    
    this.userService.register(form.value).subscribe({
      
      next: (response:any) => {
        console.log(response);
        this.router.navigate(['/home']);
      }, 
      error: (error) =>{
        console.log("wtf");
      }
  });
    
  }

}
