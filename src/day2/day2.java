package day2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class day2 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		// loss = 0
		// tie = 3
		// win = 6
		// rock = 1 A X 
		// paper = 2 B Y
		// scissor = 3 C Z
		
		File file = new File("C:\\Users\\Arbaaz\\eclipse-workspace\\adventOfCode2022\\day2input.txt");
		
		Scanner scanner = new Scanner(file);
		
		int myScore = 0;
		
		while(scanner.hasNext()) {
			String line = scanner.nextLine();
			myScore += score(line.charAt(0), line.charAt(2));
			
		}
		
		System.out.println("my score is: " + myScore);

	}
	
	static int score(char opponentsMove, char myMove) {
		char A = 'A'; //rock
		char B = 'B'; // paper
		char C = 'C'; // scissors
		
		char X = 'X'; // rock
		char Y = 'Y'; // paper
		char Z = 'Z'; // scissors
		
		int loss = 0;
		int tie = 3;
		int win = 6;
		
		int result = 0;
		
		if(opponentsMove == A && myMove == X) {
			result += tie + 1;
			System.out.println(result);
		}
		else if (opponentsMove == A && myMove == Y) {
			result += win + 2;
			System.out.println(result);
		}
		else if (opponentsMove == A && myMove == Z) {
			result += loss + 3;
			System.out.println(result);
		}
		else if (opponentsMove == B && myMove == X) {
			result += loss + 1;
			System.out.println(result);
		}
		else if (opponentsMove == B && myMove == Y) {
			result += tie + 2;
			System.out.println(result);
		}
		else if (opponentsMove == B && myMove == Z) {
			result += win + 3;
			System.out.println(result);
		}
		else if (opponentsMove == C && myMove == X) {
			result += win + 1;
			System.out.println(result);
		}
		else if (opponentsMove == C && myMove == Y) {
			result += loss + 2;
			System.out.println(result);
		}
		else if (opponentsMove == C && myMove == Z) {
			result += tie + 3;
			System.out.println(result);
		}
		
		return result;
		
	}
	
	

}
