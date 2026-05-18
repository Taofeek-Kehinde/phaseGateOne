const prompt = require('prompt-sync')();

const number = Math.floor(Math.random() * 100) + 1;
let attempts = 0;
let guess = 0;

while (attempts < 5) {
   
    guess = Number(prompt('Enter a number between 1 and 100: '));

    // Check if input is valid
    if (isNaN(guess) || guess < 1 || guess > 100) {
        console.log('Between 1 and 100 only!');
        continue; 
    }

    attempts++;

    if (guess === number) {
        console.log('YOU WIN!');
        break;
    } else if (guess < number) {
        console.log('Too low!');
    } else {
        console.log('Too high!');
    }

    if (attempts === 5) {
        console.log('Game Over! You ran out of tries.');
    }
}

console.log('Number was: ' + number);
console.log('Attempts used: ' + attempts);

