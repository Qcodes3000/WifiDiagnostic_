/**
 * @author qraunbrock-smith
 */
import java.util.Scanner;
//scanner is for user input
public class WifiDiagnostic


// this code will attempt to resolve wifi issues
// if user answers no the code will move on to next trouble shooting step
// if user answers use the code will display "done" and the code will stop
{
	public static void main(String [] args)
			{
		Scanner scan = new Scanner(System.in); //for user input
	
		System.out.println ("Reboot the computer and try to connect.");
		System.out.print ("Did that fix the problem?\n");
		
		String answer= scan.nextLine(); // read users answer
			if (answer.toLowerCase().equals("no"))
			{
		
				System.out.println ("Reboot the router and try to connect");
			 
				System.out.print ("Did that fix the problem?\n");
			
			}
			
		
		
			//exits the program if issue is resolved
		
			if (answer.toLowerCase().equals("yes"))
		{  
				System.out.print ("Done."); 
				return;
			}
			
			
	
		 // moves on to next trouble shooting step if required
		 String answer2;
		 answer2 = scan.nextLine();
		
		 if (answer2.toLowerCase().equals("no"))
		{
			System.out.println ("Make sure the cable connecting to the router are firmly plugged in and power is getting to the router");
			
			System.out.print ("Did that fix the problem?\n");
		}
		
		 
		 if (answer2.toLowerCase().equals("yes"))
		{
			System.out.print ("Done.");
	return;
		}
		 
		
		//moves on to next trouble shooting step if required
		
		 String answer3;
		answer3 = scan.nextLine();
		
		if (answer3.toLowerCase().equals("no"))
				
		{
			System.out.println ("Move the computer closer to the router and try to connect.");
			System.out.print ("Did that fix the problem?\n ");
		
				}
		//exit program if issue is resolved
	       
		if (answer3.toLowerCase().equals("yes")) 
	       {
					System.out.println ("Done.");
		return;			
				}
		
	
	       // moves on to next trouble shooting step
String answer4;
answer4 = scan.nextLine();

if (answer4.toLowerCase().equals("no"))

{
	System.out.println ("Contact your ISP.");
	
}

if (answer4.toLowerCase().equals("yes"))

{
	System.out.println ("Done.");

return;

}


}
		 
			
}






















