import java.util.Scanner;

public class movieDriver {

	public static void main(String[] args) {
		String movieName;
		String movieRating;
		int movieTickets;
		String loop ="no";
		Scanner input = new Scanner(System.in);
		do {
			System.out.println("Enter The Name of a Movie");
			movieName = input.nextLine();
			System.out.println("Enter the rating of the movie");
			movieRating = input.nextLine();
			System.out.println("Enter the number of tickets sold for this movie");
			movieTickets =input.nextInt();
			Movie m2= new Movie(movieName, movieRating, movieTickets);
			System.out.println(m2);
			System.out.println("Do you want to enter another(yes or no)");
			loop= input.nextLine();
			loop= input.nextLine();
			if(loop.equalsIgnoreCase("no")) 
			{
				System.out.println("goodbye");
			}
		} while(loop.equalsIgnoreCase("yes"));
		input.close();
	}

}
