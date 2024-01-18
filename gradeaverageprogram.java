package codetest1;
import java.util.Scanner;
public class gradeaverageprogram {

	public static void main(String[] args) 
	{
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Subject1: ");
		float SUBJECT1 = s.nextFloat();
		
		System.out.print("SUBJECT2: ");
		float SUBJECT2 = s.nextFloat();
		
		System.out.print("SUBJECT3:  ");
		float SUBJECT3 = s.nextFloat();
		
		System.out.print("SUBJECT4:  ");
		float SUBJECT4 = s.nextFloat();
		
		System.out.print("SUBJECT5:  ");
		float SUBJECT5 = s.nextFloat();
		
		System.out.print("SUBJECT6:  ");
		float SUBJECT6 = s.nextFloat();
		
		System.out.print("SUBJECT7:  ");
		float SUBJECT7 = s.nextFloat();
		
		float average = (SUBJECT1 + SUBJECT2 + SUBJECT3 + SUBJECT4 + SUBJECT5 + SUBJECT6 + SUBJECT7) / 7;
		
		System.out.println();
		System.out.print("Average : " + average);
		
		if(average > 100) System.out.println("Invalid Grade");
		else if (average >=98) System.out.println(" With Highest Honor");
		else if (average >=95) System.out.println(" With High Honor");
		else if (average >=90) System.out.println(" With Honor");  
		else if (average >=75) System.out.println(" Passed"); 
		else System.out.println("Failed");

	}

}
