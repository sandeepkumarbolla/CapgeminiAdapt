function * getNextArmstrong1() {
    let x=0;
            
    let y: any=0;
    try {
    for(let i=x;i>-1;i++){
        if(i>1000){ throw "v";}
        let n: number;
        n=i;
        let a: number;
                        
        while(n>0){
            a=n%10;
            y+=a**(`${i}`.length);
            n=Math.floor(n/10);
        
        }
        if(i==y){
            x=i;
            yield x;
            x++;
        }
        else {
            y=0;
            x++;
        }
    }  
    }
    catch (err){
        console.log("it  is above 1000");
    }       
}
for(const v of getNextArmstrong1()){
   console.log(v);
}