// Scopes 
// 1. Global Scope
// 2. Function / Local Scope
// 3. Block Scope


var a = 'Naveen';
let b = 'Akshay';
const c = 'Kiran';

// 1. Global Scope
// Accessing Directly
console.log(a);
console.log(b);
console.log(c);

// Accessing inside Function
function test() {
    console.log(a);
    console.log(b);
    console.log(c);
}
test();

// Accessing inside Block
{
    console.log(a);
    console.log(b);
    console.log(c);
}

// 2. Function / Local Scope
// Accessing inside Function
function galaxy() {
    var x = 'sun';
    let y = 'moon';
    const z = 'stars';  
    console.log(x);
    console.log(y);
    console.log(z);  
}
galaxy();

// Accessing directly(Not accessable out side the Function)
// console.log(x);
// console.log(y);
// console.log(z);

// Accesing inside block (Not accessable out side the Function)
{
    // console.log(x);
    // console.log(y);
    // console.log(z);
}

// 3. Block Scope
// Accesing inside block
{
    var l = 'mercury';
    let m = 'venus';
    const n = 'Earth';
    console.log(l);
    console.log(m);
    console.log(n);
}

// 2. Accessing Directly (Not accessable out side the Block)
       console.log(l);
    // console.log(m);
    // console.log(n);

// 3. Function / Local Scope
// Accessing inside Function (Not accessable out side the Block)
function sun() { 
    console.log(l);
    // console.log(m);
    // console.log(n);  
}
sun();