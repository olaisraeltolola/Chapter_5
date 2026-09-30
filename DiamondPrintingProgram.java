public class DiamondPrintingProgram{

	public static void main(String[] args){
int number = 5;

	for (int row = 1; row <= number; row ++){

		for (int space = 1; space <= number - row; space++){
			System.out.print(" ");
		}

		for (int column = 1; column <= (2 * row) - 1; column++){
		
			System.out.print("*");


		}

		System.out.println();
	}
number = 4;

	for (int row = number; row >= 1; row--){

		for (int space = 0; space <= number - row; space++){

		System.out.print(" ");
}

	for (int column = (2 * row) - 1; column >= 1; column--){

		System.out.print("*");
}

System.out.println();
}

}
}