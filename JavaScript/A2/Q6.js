var arr1=[];
function map1(a,fun){
	arr1.push(fun(a.shift()));
	if(a.length===0){return arr1;}
	else {return map1(a,fun);}
}
console.log(map1([1, 3, 5, 4, 2], bingo));
var arr1=[];
console.log(map1([1, 9, 25, 16, 4], Math.sqrt));