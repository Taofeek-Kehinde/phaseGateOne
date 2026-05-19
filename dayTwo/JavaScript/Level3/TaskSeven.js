const prompt = require('prompt-sync')();
let sum = 0;
for (let index = 0; index < 5; index++) 
sum += Number(prompt("Enter number:"));
console.log(sum);
