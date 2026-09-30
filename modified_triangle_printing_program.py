
for row in range (1,11):

	for column in range (1, (row + 1)):

		print("*", end="")

	for space in range (1, (11-row) + 1):

		print(' ', end="")


	print("\t",end="")




	for column in range (1, (11 - row) + 1):

		print("*", end="")

	for space in range (10, 11 - row, -1):

		print(' ', end="")


	print("\t",end="")



	for space in range (10, (11 - row), -1):
		print(' ', end="")

	for column in range (1, (11 - row) + 1):

		print("*", end="")



	print("\t",end="")




	for space in range (1, (11 - row) + 1):
		print(' ', end="")

	for column in range (1, (row + 1)):

		print("*", end="")


	print()
