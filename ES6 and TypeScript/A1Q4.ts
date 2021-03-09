let arrow = (a: any) => {
    let arr=[];
    for(let x of a){
        let str=x;
        let strl=x.length;
        arr.push({str,strl});
    }
    return arr;
}
let f=["steve harington","nancy wheeler",'jim hopper',"will buyers"];

 let c=[];
 c=arrow(f);

 for(let y of c){
     console.log(y);
 }