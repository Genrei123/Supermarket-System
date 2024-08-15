import { Component } from '@angular/core';
import { Employee } from '../employee';
import { HttpClient } from '@angular/common/http';
import { Route, Router } from '@angular/router';

@Component({
  selector: 'app-buy',
  templateUrl: './buy.component.html',
  styleUrls: ['./buy.component.css']
})
export class BuyComponent {
  
    constructor(private http: HttpClient, private router: Router) { }
  
    ngOnInit(): void {
    }

    deleteEmployee() {
      if(confirm("Your order is on the way!")) {
        this.router.navigate(['home']);
      }

    }





}
