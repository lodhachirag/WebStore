import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { user } from './Model/user';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UserService {
  baseUrl = "http://localhost:8080/users"
  constructor(public http:HttpClient) { }

  performLogin(user:user):Observable<any>
  {
    return this.http.post(`${this.baseUrl}`,[user.username,
      user.password]);
  }
  
}
