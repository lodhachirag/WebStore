import { Component, OnInit } from '@angular/core';
import { Route, Router } from '@angular/router';
import { AuthguardGuard } from '../authguard.guard';

@Component({
  selector: 'app-logout',
  templateUrl: './logout.component.html',
  styleUrls: ['./logout.component.css']
})
export class LogoutComponent implements OnInit {

  constructor(public auth:AuthguardGuard,public route:Router) { }

  ngOnInit(): void {
    this.auth.isUserLoggedIn=false
    this.route.navigate(['login'])
  }

}
