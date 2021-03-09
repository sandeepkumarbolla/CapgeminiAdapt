interface Printable {
    s:string
}

let circle: Printable ={
    s:"circle"
}
let employee: Printable ={
    s:"steve"
}

let printAll= function(a: Object,b:object) {
    console.log(a);
    console.log(b);

}
printAll(circle,employee);

