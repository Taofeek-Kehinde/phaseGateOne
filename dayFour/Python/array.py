def listNumber(number, result):
    for outer_loop in range(len(number)):
        for inner_loop in range(outer_loop + 1, len(number)):
            if number[outer_loop] + number[inner_loop] == result:
                return [number[outer_loop], number[inner_loop]]

