 class Rectangle {
  constructor(m, w) {
    this._h = m;           //$$$$$$$$$ to make h protected
    this.w = w;
  }
  get h(){ return this._h;}   // $$$$$$$$$ it is making the h protected so it will only take the value when the obj is created 

  areaa(){
  	return this.h * this.w;
  }
}

let my = new Rectangle(5, 30);
my.h=50;
console.log(my.areaa());

console.log("-----------------")

let bike = {fname: 'SuperSport', lname:'Ducati'};
bike.lname = "bingo";
bike.mname ="mani";
let a = eval("bike.fname + bike.lname");
console.log(a);
console.log(bike.mname);
var text = '{"name":"John", "age":"function() {return 30;}", "city":"New York"}';
var obj = JSON.parse(text);
console.log(obj.name);

console.log("-----------------")

let bb = {
	p1 : {
		fname : "dustin",
		lname : "henderson",
		age : 22,
		skills : ['java','c++','python'],
		address : {
			city : "hawkins",
			pincode : 522265
		},
		dateofbirst : "1999-09-29",
		married : false,
		profession : "bingo"
	},

	p2 : {
		fname : "dustindustin",
		lname : "hendersonhenderson",
		age : 2222,
		skills : ['javajava','c++c++','pythonpython'],
		address : {
			city : "hawkinshawkins",
			pincode : 522265
		},
		dateofbirst : "1998-06-05",
		married : true,
		profession : "bingobingo"
	}

}

console.log(bb);

console.log("-----------------")

var cc = function person(fname,lname,age,skills,dateofbirth,address,married,profession){
	 this.fname=fname;
	 this.lname=lname;
	 this.age=age;
	 this.skills=skills;
	 this.dateofbirth=dateofbirth;
	 this.address=address;
	 this.married=married;
	 this.profession=profession;	
}

var abhi = new cc("abhi","sheak","25",["acting", "dance"],'1990-02-23', {city : "hawkins",pincode : 522265},true,"hero");
var vis = new cc("vis","shake", 30,abhi.skills,"1980-30-8",abhi.address,"false","side actor");
console.log(vis);

console.log("-----------------");

var Aaradhya = new cc("Aaradhya","sing", vis.age, abhi.skills,"1980-20-9",abhi.address,"false",vis.profession);
console.log(Aaradhya);

console.log("-----------------");

var acc = function account(an,ahn,ab) {
	this.accountNumber=an;
	this.accountHolderName=ahn;
	this.accountBalance=ab;

	this.withdraw = function wit(a){
		if(this.accountBalance>=a) {this.accountBalance-=a;}
		else {console.log("insufficient balance");}
	}
	this.getBalance = function getB(){console.log(this.accountBalance);}
}
let save = function savings(an,ahn,ab){
	acc.call(this,an,ahn,ab);
}
let cur = function current(an,ahn,ab){
	acc.call(this,an,ahn,ab);
}

let account1 =new save(123456,"sandeep",300);
let account2 =new cur(789,"bolla",500);
account1.withdraw(50);
account2.withdraw(100);

account1.getBalance();
account2.getBalance();
