let old= {
    id: 528,
    title: "world",
    price: 9862,
    printOrder: function(){
        console.log(this.id+" "+this.title+" "+this.price);
    },
    getprice: function(){
        return this.price;
    }
}
old.printOrder();
console.log(old.getprice());
let nwe={};
Object.assign(nwe,old);
console.log(nwe);