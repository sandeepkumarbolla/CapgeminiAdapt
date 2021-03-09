"use strict";
class Fibonacci {
    constructor() { this.n = 0; }
    next1(n) {
        if (n <= 1) {
            return n;
        }
        return this.next1(n - 1) + this.next1(n - 2);
    }
    next() {
        const pre = Symbol("previousNo");
        const cur = Symbol("currentNo");
        const obj = {
            [pre]: this.next1(this.n),
            [cur]: this.next1(++this.n)
        };
        return {
            value: obj,
            done: false
        };
    }
}
let m = new Fibonacci();
console.log(m.next());
console.log(m.next());
console.log(m.next());
console.log(m.next());
//# sourceMappingURL=A2Q1.js.map