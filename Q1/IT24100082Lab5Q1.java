import java.util.Scanner;

	public class IT24100082Lab5Q1 
{
	public static void main (String[]args)
	{
	//Declare variables
	int firstNo;
	int secondNo;
	int thirdNo;
	int smallest;
	int largest;
	
	//Create an object to read
	Scanner input = new Scanner(System.in);
	
	//Input number one
	System.out.print("Enter the first integer: ");
	firstNo = input.nextInt();
	
	//Input number two
	System.out.print("Enter the second integer: ");
	secondNo = input.nextInt();
	
	//Input number three
	System.out.print("Enter the third integer: ");
	thirdNo = input.nextInt();
	
	    // Initialize smallest and largest
        smallest = firstNo;
        largest = firstNo;

        // Checking smallest number
        if (secondNo < smallest) 
		{
            smallest = secondNo;
        }
        if (thirdNo < smallest) 
		{
            smallest = thirdNo;
        }

        // Checking largest number
        if (secondNo > largest) 
		{
            largest = secondNo;
        }
        if (thirdNo > largest) 
		{
            largest = thirdNo;
        }
	
	//Outputs
	System.out.println();
	System.out.print("User entered numbers are : " +firstNo);
	System.out.print(" "+secondNo);
	System.out.println(" "+thirdNo);
	System.out.println("The Smallest number is: "+smallest);
	System.out.print("The Largest number is: "+largest);
	}
}
		
	
	