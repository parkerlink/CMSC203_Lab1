/**
 * This program was built to improve upon MovieDriver_Task1.
 * This class is built as a Driver for the Movie class to ensure all 
 * of its functions work properly. This program prompts the user for input
 * about the title, rating, and tickets about a movie and will print it back.
 * It will then ask the user if they would like to enter more movies. The program
 * will continue until they say 'n;
 * Parker Link
 *
 */

import java.util.Scanner;

public class MovieDriver_Task2 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		boolean repeat = false;
		
		do {
			Movie movie1 = new Movie();

			System.out.println("Enter the title of the movie: ");
			movie1.setTitle(keyboard.nextLine());
			System.out.println("Enter the rating of the movie: ");
			movie1.setRating(keyboard.nextLine());
			System.out.println("Enter the number of tickets sold for this movie: ");
			movie1.setSoldTickets(keyboard.nextInt());
			System.out.println(movie1.toString());
			
			System.out.println("Do you want to enter another? (y or n)");
			keyboard.nextLine();
			String repeatInput = keyboard.nextLine();
			if(repeatInput.toLowerCase().equals("y")) {
				repeat = true;
			}else {
				repeat = false;
			}
		}while(repeat);
		
		System.out.println("Goodbye");
		keyboard.close();
	}

}
