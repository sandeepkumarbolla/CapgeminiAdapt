function getNextArmstrong() {
    let x=0;
    return{
        
        next: function(){
           x++;
            function am(){
                let cc: any=0;
                for(let i=x;i>0;i++){
                    let n: number;
                    n=i;
                    let a: number;
                    
                    while(n>0){
                        a=n%10;
                        cc+=a**(`${i}`.length);
                        n=Math.floor(n/10);
                      //  console.log(a+"  "+cc+"  "+i+"  "+`${i}`.length);  
                    }
                    if(i==cc){
                        x=i;
                        break;
                    }
                    else {
                        cc=0;
                        x++;
                    }
                }
                return x;
            }
            return {valu: am(),  done: false};
        }
        
    }
}
let obj= getNextArmstrong();
console.log(obj.next());
console.log(obj.next());
console.log(obj.next());
console.log(obj.next());
console.log(obj.next());
console.log(obj.next());
console.log(obj.next());
console.log(obj.next());
console.log(obj.next());
console.log(obj.next());
console.log(obj.next());
console.log(obj.next());
