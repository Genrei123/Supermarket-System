import { Component } from '@angular/core';
import { ItemService } from '../employee-list/items.service';

@Component({
  selector: 'app-cart',
  templateUrl: './cart.component.html',
  styleUrls: ['./cart.component.css']
})
export class CartComponent {

  constructor(public itemService: ItemService) { }

  ngOnInit(): void {
  }

 



  

}
