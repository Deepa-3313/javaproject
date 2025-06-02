package hello;

import java.util.Scanner;
public class Calender {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String Day=sc.nextLine().toLowerCase();
		switch(Day) {
		case "monday":
			System.out.println(" Lets Learn python");
			break;
			
		case "tuesday":
			System.out.println(" Lets Learn Java");
			break;
			
		case "wednesday":
			System.out.println(" Lets Learn Angular JS");
			break;
			
		case "thursday":
			System.out.println(" Lets Learn Swift ");
			break;
			
		case "friday":
			System.out.println(" Lets Learn Ruby");
			break; 
			
		case "saturday":
			System.out.println(" Lets Learn Scala");
			break;
			
		case "sunday":
			System.out.println(" Lets Learn Groovy");
			break;
			
	    default:
	    	System.out.println("choose correct option ");
	    	break;
		}
		sc.close();
	}

}
