let q5 ={
    add: function(a=534,b=547){
        return a+b;
    },
    userFriends: function(x: any,...y: any[]){
        console.log(x);
        y.forEach(e => { console.log(e);});
    },
    printCapitalnames: function(a: any,b: any,c: any,d: any,e: any){
        for(let i=0;i<arguments.length;i++){
            let s=arguments[i].toUpperCase();
            console.log(s);
        }
    }
}
console.log(q5.add());
q5.userFriends("mike",'dustin','Lucas','Will buyers','Mad max');
q5.printCapitalnames("steve harrington","Nancy Wheelers",'Bob','Jonathan buyers',"ferf");