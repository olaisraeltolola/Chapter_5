public class ModifiedTrianglePrintingProgram{

	public static void main(String[] args){

for (int row = 1; row <= 10; row++){

	for (int column = 1; column <= row; column++){

System.out.print("*");

}
System.out.print("\t" + "\t");


	for (int column = 1; column <= 11 - row; column++){

System.out.print("*");

}
System.out.print("\t" + "\t");

	for (int space = 10; space > 11 - row; space--){

System.out.print(' ');
}

	for (int column = 1; column <= 11 - row; column++){

System.out.print("*");

}
System.out.print("\t" + "\t");


	for (int space = 9; space >= row; space--){

System.out.print(' ');
}

	for (int column = 1; column <= row; column++){

System.out.print("*");

}
System.out.println();

}







}
}