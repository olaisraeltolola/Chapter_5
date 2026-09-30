number = int(input("Enter a number (1-19): "))

for row in range (1, ((number//2)+1) + 1):

	for space in range (1, (((number//2)+1) - row) + 1):
		print(" ",end="")

	for column in range (1, (2 * row)):
		print("*",end="")

	print()
	
number = number//2

for row in range (number, 0,-1):

	for space in range (0, (number - row) + 1):
		print(" ",end="")

	for column in range ((2 * row) - 1, 0, -1):
		print("*",end="")

	print()
