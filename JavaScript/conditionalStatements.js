// conditional Statements

let mode = "dark";
let color;

if(mode === "dark"){
    color = "black";
}else if(mode === "blue"){
    color = "blue";
}else if(mode === "pink"){
    color = "pink";
}else{
    color = "white";
}

console.log(color);

// tarnary operator

let age = 24;
let res = age > 18 ? "adult":"not adult";
console.log(res);

// switch

const expr = 'papayas';
switch (expr) {
    case 'Oranges':
        console.log('Oranges are $0.59 a pound');
        break;
        case 'Mangoes':
        case 'papayas':
            console.log('Mangoes and Papayas are $2.79 a pound.');
            break;
    default:
        console.log('sorry we are out of stock');
}

const foo = 0;
switch (foo) {
    case -1:
        console.log("Negative 1");
        break;
    case 0:
        console.log(0);
    case 1:
        console.log(1);
        break;
    case 2:
        console.log(2);
        break;
    default:
        console.log("default");
}

const action = "say_hello";
switch (action) {
    case "say_hello": {
        const message = "hello";
        console.log(message);
        break;
    }
    case "say_hi":{
        const message = "hi";
        console.log(message);
        break;
    }
    default:
        console.log("empty action received.");
}


/* alert("hello!...");

let name = prompt("hello");
console.log(name);

let name1 =  prompt("hi...");
console.log(name1);

practice question-1

let num = prompt("Enter any Number: ");
if(num % 5 === 0){
    console.log(num, "is a miltiple of 5");
}else{
    console.log(num, "is not a multiple of 5");
} */

// practice question-1

let score = prompt("Enter your Score (0-100)");
let grade;
if(score >= 90 && score <= 100){
    grade = 'A';
}else if(score >= 80 && score <=89){
    grade = 'B';
}else if(score >= 70 && score <= 79){
    grade = 'C';
}else if(score >= 60 && score <= 69){
    grade = 'D';
}else{
    grade = 'E';
}
console.log("according to your scores, your grade was: " , grade);