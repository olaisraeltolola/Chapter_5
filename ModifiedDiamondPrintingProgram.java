import java.util.Scanner;
public class ModifiedDiamondPrintingProgram{

	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

System.out.println("Enter a number (1-19): ");
int number = input.nextInt();

	for (int row = 1; row <= (number/2) + 1; row ++){

		for (int space = 1; space <= ((number/2) + 1) - row; space++){
			System.out.print(" ");
		}

		for (int column = 1; column <= (2 * row) - 1; column++){
		
			System.out.print("*");


		}

		System.out.println();
	}
number = number/2;

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