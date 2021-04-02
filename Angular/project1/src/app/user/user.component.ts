import { ServiceService } from './../service.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {

  constructor(private service:ServiceService) { }

  ngOnInit(): void {
  }
  elements: any []= this.service.getele();
  element: any []= this.service.getElement();
  headElements= ['position','name','quantity','price', 'Add'];
}
