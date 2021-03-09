console.log("7th A")
let arr =['steve','nancy','jonathan','bob'];
let [,x,] =arr;
console.log(x);

console.log("7th B")
let org ={
    name: "sunshine technologies",
    address:{
        state: "california",pin: 5074862
    }
}; 
let {address:{pin: pos}}=org;
console.log(pos);   