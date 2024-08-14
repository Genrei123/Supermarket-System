import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root',
})
export class UserAuthService {
  constructor() {}

  public setRoles(roles: []) {
    localStorage.setItem('roles', JSON.stringify(roles));
  }

  public getRoles() {
    const roleString = localStorage.getItem('roles');
    if (!roleString) {
      return null;
    } 
    try {
      return JSON.parse(roleString);
    } catch (error) {
      return null;
    }
  }

  public setToken(jwtToken: string) {
    localStorage.setItem('jwtToken', jwtToken);
  }

  public getToken(): string {
    return localStorage.getItem('jwtToken') as string;
  }

  public getUsername(): any {
    return localStorage.getItem('username') as string;
  }

  public setUsername(username: string) {
    localStorage.setItem('username', username);
  }

  

  public clear() {
    localStorage.clear();
  }

  public isLoggedIn() {
    return this.getRoles() && this.getToken();
  }
}
