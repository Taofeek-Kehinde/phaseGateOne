const prompt = require('prompt-sync')();

let age = Number(prompt("Enter your age: "));
console.log(`In five years, you will be ${age + 5} years old.`);
