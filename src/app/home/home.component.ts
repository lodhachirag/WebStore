import { Component, OnInit } from '@angular/core';
import { AuthguardGuard } from '../authguard.guard';
import { CartService } from '../cart.service';
import { LoginComponent } from '../login/login.component';
import { product } from '../Model/product';
import { ProductService } from '../product.service';
import { UserService } from '../user.service';



@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  products:product[]=[]
  constructor(public proService:ProductService,public cartService:CartService,public authService:AuthguardGuard) { 
  }
  
  ngOnInit(): void {
    this.products=this.proService.products
  }

  addToCart(p:product){
    alert(this.authService.currUserNo)
    p.uno = this.authService.currUserNo
    // alert(p.name+" "+p.productnumber+" "+p.uno)
    this.cartService.cart.push(p)
  }

}
