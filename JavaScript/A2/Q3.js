function isEven(num) { return(num%2 == 0); }
function find(a){
	for(i=0; i<a.length;i++){
		if(isEven(a[i])){
			return a[i];
		}
	}
}
console.log(find([1, 3, 5, 4, 2]));
