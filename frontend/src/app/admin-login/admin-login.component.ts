import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-admin-login',
  templateUrl: './admin-login.component.html',
  styleUrls: ['./admin-login.component.css']
})
export class AdminLoginComponent {

  constructor(private httpClient: HttpClient) { }

  ngOnInit(): void {
    
  }
  private baseURL = "http://localhost:8080/api/v1/admin";

  public getAdmin(): void {
    this.httpClient.get<any>(`${this.baseURL}/1`).subscribe(
      (response) => {
        console.log(response);
      },
      (error) => {
        console.log("this is an error" + error);
      }
    );
  }

  // public loginAdmin(): Observable<any> {
  //   return this.httpClient.get<any>(`${this.baseURL}/1`);
  // }

}
