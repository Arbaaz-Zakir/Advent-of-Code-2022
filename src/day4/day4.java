package day4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class day4 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File file = new File("C:\\Users\\Arbaaz\\eclipse-workspace\\adventOfCode2022\\day4input.txt");
		
		Scanner scanner = new Scanner(file);
		
		int count = 0;
		
		while(scanner.hasNext()) {
			String s = scanner.nextLine();
			String[] str = s.split(",");
			//System.out.println(str[0]+" "+str[1]);
			
			String[] numbers = str[0].split("-");
			
			
			int pair1Number1 = Integer.parseInt(numbers[0]);
			int pair1Number2 = Integer.parseInt(numbers[1]);
			
			numbers = str[1].split("-");
			int pair2Number1 = Integer.parseInt(numbers[0]);
			int pair2Number2 = Integer.parseInt(numbers[1]);
			
			//System.out.println(pair2Number1);
			
			//arrayList
			ArrayList<Integer> firstPair = new ArrayList<>();
			ArrayList<Integer> secondPair = new ArrayList<>();
			
			String t = "";
			int[] numlist = new int[pair1Number1];
			
			for(int i = pair1Number1; i <= pair1Number2; i++) {
				firstPair.add(i);
				//System.out.println(i);
			}
			for(int i = pair2Number1; i <= pair2Number2; i++) {
				secondPair.add(i);
				//System.out.println(i);
			}
			
			
			//System.out.println(firstPair);
			//System.out.println(secondPair);
			
			for(int x : firstPair) {
				if(secondPair.contains(x)) {
					count++;
					break;
				}
			}
//			if(firstPair.contains(secondPair) || secondPair.contains(firstPair)) {
//				count++;
//			}
		}
		
		
		System.out.println("In how many assignment pairs do the ranges overlap? ANSWER: " + count);

	}

}
