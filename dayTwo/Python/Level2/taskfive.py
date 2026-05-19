first_number = float(input(" Enter first number: "))
second_number = float(input("   Enter second number: "))
third_number = float(input("   Enter third number: "))
if first_number >= second_number and first_number >= third_number:
    largest = first_number
elif second_number >= first_number and second_number >= first_number:
    largest = second_number
else:
    largest = third_number
print(f"Largest number: {largest}"
