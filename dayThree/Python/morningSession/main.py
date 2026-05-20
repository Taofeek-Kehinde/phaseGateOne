"""
START
We are to create system like facebook that detects when a user like a post
we are to create a text that displayed the names of people if there is no user we have to return no user
if there is user we have to get the lenght of the users and to get that we need array to store the user and index to point to the user
END
"""
def likes (names):
    number = len(names)
    if number == 0:
        return "no one likes this"
    elif number == 1:
        return f"{names[0]} likes this"
    elif number == 2:
        return f"{names[0]} and {names[1]} like this"
    elif number == 3:
        return f"{names[0]}, {names[1]} and {names[2]} like this"
    else:
        return f"{names[0]}, {names[1]} and {names[2]} and  {names[3]}  others like this"

print(likes([]))
print(likes(["peter"]))
print(likes(["jacob", "alex"]))
print(likes(["Max", "john", "Mark"]))
print(likes(["Alex", "Jacob", "Mark", "Max"]))
