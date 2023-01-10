import { Injectable } from '@angular/core';
import { product } from './Model/product';

@Injectable({
  providedIn: 'root'
})
export class ProductService {
  products:product[]=[]
  constructor() { 
    let p1 = new product(1,"pen",100,-1)
    let p2 = new product(2,"laptop",200,-1)
    let p3 = new product(1,"pen",100,-1)
    let p4 = new product(2,"laptop",200,-1)
    let p5 = new product(1,"pen",100,-1)
    let p6 = new product(2,"laptop",200,-1)
    this.products.push(p1)
    this.products.push(p2)
    this.products.push(p3)
    this.products.push(p4)
    this.products.push(p5)
    this.products.push(p6)
  }
}
