const prompt = require('prompt-sync')();
let price = Number(prompt("Enter item price: "));
let newPrice = price * 1.10;
console.log(`Price after 10% increase: ${newPrice}`);

