function find1(a,fun){
	var b= a.shift();
	if(fun(b))
		{return b;}
	if(a.length===0){return "not found";}
	else {return find(a,fun);}
	
}
console.log(find1([1, 4, 9, 2, 7],isEven));