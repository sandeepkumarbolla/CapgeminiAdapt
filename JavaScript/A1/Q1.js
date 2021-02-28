function square (x){
	return x*x;
}
function double (x){
	return x*2;
}
const y =(a,b) => (data) => a(b(data));

const u = y(square,double);
console.log(u(5));
