function bingo(v){
	return v*v;
}

function map(a,fun){
	let arr = [];
	for(i=0; i<a.length;i++){

		arr.push(fun(a[i]));
	}
	return arr;
}
console.log(map([1, 3, 5, 4, 2], bingo));
console.log(map([1, 9, 25, 16, 4], Math.sqrt));