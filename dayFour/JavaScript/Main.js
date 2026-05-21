function listNumber(number, result) {
    for (let outer_loop = 0; outer_loop < number.length; outer_loop++) {
        for (let inner_loop = outer_loop + 1; inner_loop < number.length; inner_loop++) {
            if (number[outer_loop] + number[inner_loop] == result) {
                return [number[outer_loop], number[inner_loop]];
            }
        }
    }
}

console.log(listNumber([8, 6, 12, 4, -2], 6)); 
console.log(listNumber([1, 2, 5, 7, 6, 8, 9], 12));


