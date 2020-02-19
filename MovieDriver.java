import java.util.Scanner;
import java.io.*;

public class MovieDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char answer, a;
		do{
		
		Scanner input = new Scanner(System.in);
		
		
		 String title;
		 String rating;
		 int  soldTickets;
		 String again;
		 	 
		System.out.print("Enter the movie's title");
		title = input.nextLine();
		
		System.out.print("Enter the movie's rating: ");
		rating = input.nextLine();
		
		System.out.print("Enter the number of ticket sold");
		soldTickets = input.nextInt();
		
		Movie m1=new Movie(title,rating,soldTickets);
		System.out.println(m1);
		
		System.out.println("Do you want to enter another? (y or n)");
		
		 a = input.next().charAt(0);
		}while(a=='y');

	}}


