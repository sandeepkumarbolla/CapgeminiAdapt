import { Injectable } from '@angular/core';
export interface PeriodicElement {
  name: string;
  position: number;
  quantity: number;
  price: number;
}
export interface PeriodicElement1 {
  name: string;
  position: number;
 rating: number;
}
@Injectable({
  providedIn: 'root'
})

export class ServiceService {

  constructor() { }  
  ELEMENT_DATA: PeriodicElement[] = [
    {position: 1, name: 'Biryani', quantity: 1, price:330 },
    {position: 2, name: 'EggRice', quantity: 1, price: 120},
    {position: 3, name: 'Chicken Fry', quantity: 1, price: 200},
    {position: 4, name: 'Veg Biryani', quantity: 1, price: 250},
    {position: 5, name: 'Cake', quantity: 1, price: 50},
    {position: 6, name: 'CoolDrink', quantity: 1, price: 90},
    {position: 7, name: 'Kawab', quantity: 1, price: 100},];

Element:PeriodicElement1[]=[
  {position: 1, name: 'Taj', rating:4.5},
  {position: 2, name: 'Bawarchi', rating:4.5},
  {position: 3, name: 'Hyderabadi', rating:4.5},
  {position: 4, name: 'Sreenivasa', rating:4.5},
  {position: 5, name: 'Srekrisna', rating:4.5},

]
getElement(){
return this.ELEMENT_DATA;
} 
getele(){
  return this.Element;
}
}

