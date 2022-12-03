package day3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class day3 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File file = new File("C:\\Users\\Arbaaz\\eclipse-workspace\\adventOfCode2022\\day3input.txt");
		
		Scanner scanner = new Scanner(file);
		
		HashMap<Character, Integer> letterValue = new HashMap<Character, Integer>();
		letterValue.put('a', 1);
		letterValue.put('b', 2);
		letterValue.put('c', 3);
		letterValue.put('d', 4);
		letterValue.put('e', 5);
		letterValue.put('f', 6);
		letterValue.put('g', 7);
		letterValue.put('h', 8);
		letterValue.put('i', 9);
		letterValue.put('j', 10);
		letterValue.put('k', 11);
		letterValue.put('l', 12);
		letterValue.put('m', 13);
		letterValue.put('n', 14);
		letterValue.put('o', 15);
		letterValue.put('p', 16);
		letterValue.put('q', 17);
		letterValue.put('r', 18);
		letterValue.put('s', 19);
		letterValue.put('t', 20);
		letterValue.put('u', 21);
		letterValue.put('v', 22);
		letterValue.put('w', 23);
		letterValue.put('x', 24);
		letterValue.put('y', 25);
		letterValue.put('z', 26);
		
		letterValue.put('A', 27);
		letterValue.put('B', 28);
		letterValue.put('C', 29);
		letterValue.put('D', 30);
		letterValue.put('E', 31);
		letterValue.put('F', 32);
		letterValue.put('G', 33);
		letterValue.put('H', 34);
		letterValue.put('I', 35);
		letterValue.put('J', 36);
		letterValue.put('K', 37);
		letterValue.put('L', 38);
		letterValue.put('M', 39);
		letterValue.put('N', 40);
		letterValue.put('O', 41);
		letterValue.put('P', 42);
		letterValue.put('Q', 43);
		letterValue.put('R', 44);
		letterValue.put('S', 45);
		letterValue.put('T', 46);
		letterValue.put('U', 47);
		letterValue.put('V', 48);
		letterValue.put('W', 49);
		letterValue.put('X', 50);
		letterValue.put('Y', 51);
		letterValue.put('Z', 52);
		
		ArrayList<Character> usedChar = new ArrayList<Character>();
		

		int prioritySum = 0;
		while(scanner.hasNext()) {
			String line = scanner.nextLine();
			String compartmentOne = line.substring(0, (line.length()/2));
			String compartmentTwo = line.substring(line.length()/2);
			
			for(int i = 0; i < compartmentOne.length(); i++) {
				char s = compartmentOne.charAt(i);
				if(compartmentTwo.indexOf(s) > -1 && !usedChar.contains(s)) {
					prioritySum += letterValue.get(s);
					System.out.println(s+", prioritySum:"+prioritySum);
					usedChar.add(s);
				}
			}
			usedChar.clear();
		}
		
		
//		System.out.println(line);
//		System.out.println(str);
//		System.out.println(str2);
		System.out.println(prioritySum);

	}

}
