"use strict";
function getNextArmstrong() {
    let x = 0;
    return {
        next: function () {
            x++;
            function am() {
                let cc = 0;
                for (let i = x; i > 0; i++) {
                    let n;
                    n = i;
                    let a;
                    while (n > 0) {
                        a = n % 10;
                        cc += Math.pow(a, (`${i}`.length));
                        n = Math.floor(n / 10);
                        //  console.log(a+"  "+cc+"  "+i+"  "+`${i}`.length);  
                    }
                    if (i == cc) {
                        x = i;
                        break;
                    }
                    else {
                        cc = 0;
                        x++;
                    }
                }
                return x;
            }
            return { valu: am(), done: false };
        }
    };
}
let obj = getNextArmstrong();
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
//# sourceMappingURL=A2Q2.js.map