import { Component, OnInit } from '@angular/core';
import {OrderServiceService} from "../../service/order-service.service";
import {Order} from "../../model/order";

@Component({
  selector: 'app-order-item',
  templateUrl: './order-item.component.html',
  styleUrls: ['./order-item.component.css']
})
export class OrderItemComponent implements OnInit {

  orders: Order[] = [];
  constructor(private order:OrderServiceService) { }

  ngOnInit(): void {

    this.getOrders();

  }

  getOrders(){
    this.order.getOrders().subscribe(
      value => {
        this.orders = value
      }
    )
  }


}
