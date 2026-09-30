public class PythagoreanTriples{
public static void main(String[] args){

System.out.println("side one\tside two\tside three");

for (int sideOne = 1; sideOne <= 500; sideOne++){

	for (int sideTwo = 1; sideTwo <= 500; sideTwo++){

		for (int sideThree = 1; sideThree <= 500; sideThree++){

if ((sideOne*sideOne) + (sideTwo*sideTwo) == (sideThree*sideThree)){

System.out.println(sideOne + "\t" + sideTwo + "\t" + sideThree);
}

}
}
}

}
}