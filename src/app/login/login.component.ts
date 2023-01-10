import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AuthguardGuard } from '../authguard.guard';
import { user } from '../Model/user';
import { UserService } from '../user.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  foundUser:user=new user('','',0)
  constructor(public userService:UserService,public router:Router,public auth:AuthguardGuard) { }

  ngOnInit(): void {
  }
  performLogin(){
    this.userService.performLogin(this.foundUser).subscribe(
      resp=>{
        if(resp){
          alert(resp.id)
          this.foundUser.uno=resp.id
          this.router.navigate(['home'])

          this.auth.isUserLoggedIn=true
          this.auth.currUserNo=resp.id
        }
        else{
          alert("Please Enter Valid Username and Password")
        }
      }
    )
  }

}
