package day1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/**
 * 
 * @author Arbaaz
 * Calculate which elf has the highest number of calories 
 * Calculate which 3 elves have the highest combined number of calories
 * 
 */
public class day1Task1 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		//String output = getUrlContents("https://adventofcode.com/2022/day/1/input");
		
		File file = new File("C:\\Users\\Arbaaz\\eclipse-workspace\\adventOfCode2022\\day1input.txt");
		
		Scanner scanner = new Scanner(file);

		ArrayList<Integer> topThreeCalories = new ArrayList<>();
		topThreeCalories.add(0);
		topThreeCalories.add(0);
		topThreeCalories.add(0);
		//
		
		int largestCalories = 0;
		int currentCalories = 0;
		
		while(scanner.hasNextLine()) {
			String currentLine = scanner.nextLine();
			if(!currentLine.isBlank()) {
				currentCalories += Integer.parseInt(currentLine); //add calories until reaching a blank line

			}
			else {
				largestCalories = Collections.min(topThreeCalories); // find lowest number of calories out of current 2 calories
				
				if(currentCalories > largestCalories) {
					topThreeCalories.remove(Integer.valueOf(largestCalories)); // if currentCalories are bigger remove from list the smallest of the largest three then replace with new value
					largestCalories = currentCalories;
					topThreeCalories.add(largestCalories);
				}
				currentCalories = 0; //reset calories
			}
		}
		int sum = 0;
		// calculate total value of calories
		for(int num : topThreeCalories) {
			sum+=num;
		}
		System.out.println("Single elf with the largest number of calories: " + largestCalories);
		System.out.println("Total sum of calories of the top 3 elves with the largest toal number of calories: " + sum);
	
	}
}
