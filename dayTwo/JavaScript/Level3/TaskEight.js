const prompt = require('prompt-sync')();
let sum = 0;
while (true) {
    let number = Number(prompt("Enter (0 to stop):"));
    if (number === 0) break;
    sum += number;
}
console.log(sum);
