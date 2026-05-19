const prompt = require('prompt-sync')();
 let length = Number(prompt("Enter length: "));
let width = Number(prompt("Enter width: "));
let area = length * width;
console.log(`Area of rectangle: ${area}`);
