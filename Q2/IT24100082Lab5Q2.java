import java.util.Scanner;
public class IT24100082Lab5Q2
{
        public static void main(String[] args)
        {
            //Variable Declaration
            int number;

            //Creating object for Scanner to read
            Scanner input = new Scanner(System.in);

            System.out.print("Enter the number of new members introduced: ");
            number = input.nextInt();

        //validation
        if (number < 0)
        {
            System.out.print("Input must be a number 0 or greater");
            
        }
        else
         {

        // Prize selection
            switch (number)
            {
            
            case 0 :
            
                System.out.println();
                System.out.print("No Prize");
                break;
            

            case 1 :
            
                System.out.println();
                System.out.print("Prize is a : Pen");
                break;
             

            case 2: 
            
                System.out.println();
                System.out.print("Prize is a : Umbrella");
                break;
             

            case 3:
            
                System.out.println();
                System.out.print("Prize is a : Bag");
                break;
            

            case 4:
            
                System.out.println();
                System.out.print("Prize is a : Travelling Chair");
                break;
             

            default :
            
                System.out.println();
                System.out.print("Prize is a : Headphone");
                break;

            }
         }
        }
}
    

