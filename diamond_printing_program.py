number = 5

for row in range (1, number + 1):

	for space in range (1, (number - row) + 1):
		print(" ",end="")

	for column in range (1, (2 * row)):
		print("*",end="")

	print()
	
number = 4

for row in range (number, 0,-1):

	for space in range (0, (number - row) + 1):
		print(" ",end="")

	for column in range ((2 * row) - 1, 0, -1):
		print("*",end="")

	print()
