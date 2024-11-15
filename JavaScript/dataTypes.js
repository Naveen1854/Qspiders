// Data Types in JSON

// Primitive (7)
// Number, String, Boolean, Undefined, Null, BigInt, Symbol

isFollow = true;
console.log(typeof(isFollow));

age  = 23;
console.log(typeof(age));

a=null;
console.log(typeof(a));

let x = BigInt("123");
let y = Symbol("Hello!..")

const student = {
    firstName: "Kusuma",
    lastName: "Naveen",
    fullName: "Kusuma Naveen",
    age: 23,
    cgpa: 8.2,
    isPass: true, 
    address: "hyedrabad"
};
console.log(student);
console.log(student["address"],student["fullName"]);
console.log(student.address,student.age, student.cgpa,student.fullName);
console.log(student.firstName + " " + student.lastName);

const product = {
    title: "Ball Pen",
    rating: 4,
    offer: 5,
    price: 270,
};
console.log(product);

const profile = {
    username: "@Naveen",
    isFollow: false,
    posts: 195 + " posts",
    followers: 569 + " k followers",
    following: 4,
    college: "SR University"
};
console.log(typeof profile.username);

