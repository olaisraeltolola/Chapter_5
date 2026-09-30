print("side one\tside two\tside three")

for side_one in range (1,501):

	for side_two in range (1,501):

		for side_three in range (1,501):

			if (side_one*side_one) + (side_two*side_two) == (side_three*side_three):
				print(side_one,side_two,side_three, sep="\t\t")
