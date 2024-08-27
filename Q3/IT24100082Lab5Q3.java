import java.util.Scanner;
public class IT24100082Lab5Q3
{
    public static void main(String[]args)
    {
        //Variable declaration
        int startDat;
        int endDat;
        int reseDat;
        double Total;
        double roomChar = 48000.0;
        double discountA =0.9;
        double discountB= 0.8;



        //Creating object for Scanner
        Scanner input =new Scanner(System.in);

        //user input data
        System.out.print("Enter Start Date (1-31): ");
        startDat = input.nextInt();

        System.out.print("Enter End Date (1-31): ");
        endDat = input.nextInt();

        if (startDat < 1 || endDat < 1 || startDat > 31 || endDat >31 )
        {
            System.out.print("Error: Days must be less than End Date");
            return;

        }

        if (startDat > endDat)
        {
            System.out.print("Error: Start Date must be less than End Date");
            return;
        }

        //calculations
        reseDat= endDat-startDat;

        // Outputs
        System.out.println();
        System.out.print("Room Charge Per Day: "+ roomChar);
        System.out.println("/=");
        System.out.println("Number of Days Reserved: "+reseDat);

        if (reseDat <3 )
        {
            Total= roomChar * reseDat;
            System.out.print("Total amount to be Paid: " +Total);
        }

        else if (reseDat == 3 || reseDat == 4)
        {
            Total= roomChar * reseDat * discountA;
            System.out.print("Total amount to be Paid: " +Total);
        }

        else 
        {
            Total= roomChar * reseDat * discountB;
            System.out.print("Total amount to be Paid: " +Total);
        }


    }
}
    

