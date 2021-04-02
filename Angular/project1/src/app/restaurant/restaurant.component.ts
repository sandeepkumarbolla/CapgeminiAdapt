import { ServiceService } from './../service.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-restaurant',
  templateUrl: './restaurant.component.html',
  styleUrls: ['./restaurant.component.css']
})
export class RestaurantComponent implements OnInit {

  constructor( private service: ServiceService) { }

  ngOnInit(): void {
  }
  elements: any []= this.service.getele();
  headElements= ['NO.','Name','Rating','Edit','Delete'];
}
