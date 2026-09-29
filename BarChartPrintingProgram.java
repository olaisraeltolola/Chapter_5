import java.util.Scanner;
	public class BarChartPrintingProgram{
		public static void main(String[] args){
		Scanner input = new Scanner(System.in);	
		
System.out.println("Enter the number (1-30): ");
	int numberOne = input.nextInt();

System.out.println("Enter the number (1-30): ");
	int numberTwo = input.nextInt();

System.out.println("Enter the number (1-30): ");
	int numberThree = input.nextInt();

System.out.println("Enter the number (1-30): ");
	int numberFour = input.nextInt();

System.out.println("Enter the number (1-30): ");
	int numberFive = input.nextInt();

	for (int asteriks = 1; asteriks <= numberOne; asteriks++){
	System.out.print("*");
	}
	System.out.println();

	for (int asteriks = 1; asteriks <= numberTwo; asteriks++){
	System.out.print("*");
	}
	System.out.println();

	for (int asteriks = 1; asteriks <= numberThree; asteriks++){
	System.out.print("*");
	}
	System.out.println();

	for (int asteriks = 1; asteriks <= numberFour; asteriks++){
	System.out.print("*");
	}

	System.out.println();

	for (int asteriks = 1; asteriks <= numberFive; asteriks++){
	System.out.print("*");
	}
	System.out.println();

	}
}

