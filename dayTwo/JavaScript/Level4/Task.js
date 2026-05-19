
function getTwoNumbers(firstNumber, secondNumber) {
  return firstNumber + secondNumber;
}


function getEven(number) {
  return number % 2 === 0 ? "even" : "odd";
}

function getSquare(number) {
  return number * number;
}

function celsiusToFahrenheit(celsius) {
  return (celsius * 9/5) + 32;
}

function getLargest(a, b, c) {
  return max(a, b, c);
}


console.log(getTwoNumbers(4, 6));      
console.log(getEven(4));               
console.log(getSquare(3));             
console.log(celsiusToFahrenheit(30));  
console.log(getLargest(10, 25, 7));    

