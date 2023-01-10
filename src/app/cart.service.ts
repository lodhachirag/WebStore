import { Injectable } from '@angular/core';
import { cart } from './Model/cart';

@Injectable({
  providedIn: 'root'
})
export class CartService {
  cart:cart[] = []
  constructor() { }
}
