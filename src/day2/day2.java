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
	
	static int score(char d, char e) {
        char A = 'A'; // rock +1
        char B = 'B'; // paper +2
        char C = 'C'; // scissors +3

        char X = 'X'; // loss +0
        char Y = 'Y'; // draw +3
        char Z = 'Z'; // win +6

        int rock = 1;
        int paper = 2;
        int scissors = 3;

        //int loss = 0;
        int draw = 3;
        int win = 6;

        int result = 0;

        if(d == A && e == X) {
            result += scissors;
            System.out.println(result);
        }
        else if (d == A && e == Y) {
            result += rock + draw;
            System.out.println(result);
        }
        else if (d == A && e == Z) {
            result += paper + win;
            System.out.println(result);
        }
        else if (d == B && e == X) {
            result += rock;
            System.out.println(result);
        }
        else if (d == B && e == Y) {
            result += paper + draw;
            System.out.println(result);
        }
        else if (d == B && e == Z) {
            result += scissors + win;
            System.out.println(result);
        }
        else if (d == C && e == X) {
            result += paper;
            System.out.println(result);
        }
        else if (d == C && e == Y) {
            result += scissors + draw;
            System.out.println(result);
        }
        else if (d == C && e == Z) {
            result += rock + win;
            System.out.println(result);
        }

        return result;

    }
	

}
