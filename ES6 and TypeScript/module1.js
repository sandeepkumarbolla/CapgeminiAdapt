import {Saving,Current} from './module2.js';

let s1= new Saving(1,"mike",43,2);
let s2= new Saving(2,"lucas",24,3);

let c1= new Current(3,"dustin",76,6);
let c2= new Current(4,"will",45,7);

let total = function(){
  return s1.balance+s2.balance+c1.balance+c2.balance;
}

console.log(total());