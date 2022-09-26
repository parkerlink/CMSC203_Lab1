/**
 * This class is built as a Driver for the Movie class to ensure all 
 * of its functions work properly. This program prompts the user for input
 * about the title, rating, and tickets about a movie.
 * Once they enter all of the information it will print the movie and end
 * the program
 * Parker Link
 *
 */

import java.util.Scanner;

public class MovieDriver_Task1 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);		
		
		Movie movie1 = new Movie();

		System.out.println("Enter the title of the movie: ");
		movie1.setTitle(keyboard.nextLine());
		
		System.out.println("Enter the rating of the movie: ");
		movie1.setRating(keyboard.nextLine());
		
		System.out.println("Enter the number of tickets sold for this movie: ");
		movie1.setSoldTickets(keyboard.nextInt());
		
		System.out.println(movie1.toString());
		System.out.println("Goodbye");
		keyboard.close();
	}
}
