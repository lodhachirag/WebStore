import { Component, OnInit } from '@angular/core';
import { CartService } from '../cart.service';
import { cart } from '../Model/cart';

@Component({
  selector: 'app-cart',
  templateUrl: './cart.component.html',
  styleUrls: ['./cart.component.css']
})
export class CartComponent implements OnInit {
  cart:cart[]=[]
  constructor(public cartService:CartService) { }

  ngOnInit(): void {
    this.cart=this.cartService.cart
    
  }

}
