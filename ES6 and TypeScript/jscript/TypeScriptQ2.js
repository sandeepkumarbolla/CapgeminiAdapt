"use strict";
class Account {
    constructor(sid, sname, balance) {
        this.sid = sid;
        this.sname = sname;
        this.balance = balance;
    }
}
class Saving extends Account {
    constructor(sid, sname, sbalance, interest) {
        super(sid, sname, sbalance);
        this.sid = sid;
        this.sname = sname;
        this.sbalance = sbalance;
    }
}
class Current extends Account {
    constructor(cid, cname, cbalance, credit) {
        super(cid, cname, cbalance);
    }
}
let s1 = new Saving(1, "lucas", 25000, 2);
let s2 = new Saving(2, "will", 35230, 3);
let c1 = new Current(3, "mike", 100, 6);
let c2 = new Current(4, "dustin", 42900, 7);
let total = function () {
    return s1.sbalance + s2.sbalance + c1.balance + c2.balance;
};
console.log("the total balance in the bank " + total());
//# sourceMappingURL=TypeScriptQ2.js.map