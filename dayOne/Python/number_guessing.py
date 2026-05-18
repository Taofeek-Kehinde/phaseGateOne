import random

number = random.randint(1, 101) 
number_of_attempts = 0

print("Enter a number between 1 and 100")

while number_of_attempts < 5:
    guess_number = input("Guess Number: ")
    
    if not guess_number.isdigit():
        print("That's not a number! Try again")
        continue
    
    guess_number = int(guess_number)
    
    if guess_number < 1 or guess_number > 100:
        print("Between 1 and 100 only!")
        continue
    
    number_of_attempts = number_of_attempts + 1
    
    if guess_number == number:
        print("YOU WIN!")
        break
    elif guess_number < number:
        print("Too low!")
    else:
        print("Too high!")
# if  a user gess the number once! => display legendary!
print("The number was", number)
print("Rating ", rate)
print("You used", number_of_attempts, "attempts")
