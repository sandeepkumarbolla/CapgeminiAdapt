"use strict";
const promise1 = Promise.resolve(3);
const promise2 = Promise.resolve(4);
Promise.all([promise1, promise2]).then((values) => {
    console.log(values[0] + values[1]);
});
//# sourceMappingURL=TypeScriptQ1.js.map