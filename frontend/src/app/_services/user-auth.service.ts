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

  public getRole() {
    const roles = this.getRoles();
    if (!roles) {
      return null;
    }
    return roles[0].roleName;
  }

  public setToken(jwtToken: string) {
    localStorage.setItem('jwtToken', jwtToken);
  }

  public getToken(): string {
    return localStorage.getItem('jwtToken');
  }

  public getUsername(): string {
    return localStorage.getItem('username');
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
