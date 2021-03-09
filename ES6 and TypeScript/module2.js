class Account {
    constructor (id, name, balance){
        this.id=id;
        this.name=name;
        this.balance=balance;
    }
}

class Saving extends Account{
    constructor(id,name,balance,interest){
        super(id,name,balance);
        this.interest=interest;
    }
}

class Current extends Account{
    constructor(id,name,balance,credit){
        super(id,name,balance);
        this.credit=this.credit;
    }
}


export {Saving,Current};