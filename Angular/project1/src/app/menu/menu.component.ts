import { ServiceService } from './../service.service';
import { Component, OnInit } from '@angular/core';
import {PeriodicElement} from '../service.service'

@Component({
  selector: 'app-menu',
  templateUrl: './menu.component.html',
  styleUrls: ['./menu.component.css']
})
export class MenuComponent implements OnInit {
 constructor(private service:ServiceService ) { 
 }
  
  ngOnInit() {
  }
  elements: any []= this.service.getElement();
  headElements= ['position','name','quantity','price','edit','assign'];
  
  
}
