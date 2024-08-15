import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

import { Observable } from 'rxjs';
import { Employee } from '../employee';



@Injectable({
  providedIn: 'root'
})
export class ItemService {


  private baseURL = "http://localhost:8080/items";

  constructor(private httpClient: HttpClient) { }

  
  
  getItemList(): Observable<Employee[]>{
    return this.httpClient.get<Employee[]>(`${this.baseURL}`);
  }

  addCartItem(employee: Employee): Observable<Object>{
    return this.httpClient.post(`${this.baseURL}`, employee);
  }

  deleteEmployee(id: number): Observable<Object>{
    return this.httpClient.delete(`${this.baseURL}/${id}`);
  }

  


}
