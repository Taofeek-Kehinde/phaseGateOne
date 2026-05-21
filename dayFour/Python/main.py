def listNumber(number, result):

    for outer_loop in range(len(number)):

        for inner_loop in range(outer_loop + 1, len(number)):

            if number[outer_loop] + number[inner_loop] == result:

                return [number[outer_loop], number[inner_loop]]



print(listNumber([8, 6, 12, 4, -2], 6))
print(listNumber([1, 2, 5, 7, 6, 8, 9], 12))

