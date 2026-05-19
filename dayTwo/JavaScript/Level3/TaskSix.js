const prompt = require('prompt-sync')();
let number = Number(prompt("Enter number ")); 
let sum = 0;
for (let index = 1; index <= number; index++) 
sum += number;
console.log(sum);
