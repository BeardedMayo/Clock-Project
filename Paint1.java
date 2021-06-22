import java.util.Scanner;

public class Paint1 {

    @SuppressWarnings("resource")
	public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double wallHeight = 0.0;
        double wallWidth = 0.0;
        double wallArea = 0.0;
        double gallonsPaintNeeded = 0.0;
        double cansPaintNeeded = 0.0;
        boolean dontExit;
        
        final double squareFeetPerGallons = 350.0;
        
        // Do-while loop for input validation
        // Prompt user to input wall's height
        
        do {
        	dontExit = false;
        	System.out.println("Enter wall height (feet): ");
        	try {
        		wallHeight = scnr.nextDouble();
        		if(wallHeight <= 0) {
        			throw new Exception();
        		}
        	}catch(Exception e) {
        		dontExit = true;
        		scnr.nextLine();
        		System.out.println("Sorry that was invalid, try again");
        	}
        }while(dontExit);
        
        // Do-while loop for input validation
        // Prompt user to input wall's width
        
        do {
        	dontExit = false;
        	System.out.println("Enter wall width (feet): ");
        	try {
        		wallWidth = scnr.nextDouble();
        		if(wallWidth <= 0) {
        			throw new Exception();
        		}
        	}catch(Exception e) {
        		dontExit = true;
        		scnr.nextLine();
        		System.out.println("Sorry that was invalid, try again");
        		}
        }while(dontExit);

        // Calculate and output wall area
        wallArea = wallHeight * wallWidth;
        System.out.println("Wall area: " + wallArea + " square feet");

        // Calculate and output the amount of paint (in gallons) needed to paint the wall
        gallonsPaintNeeded = wallArea/squareFeetPerGallons;
        System.out.println("Paint needed: " + gallonsPaintNeeded + " gallons");
        //utilize Math.ceil() method of the Math class to round the number to the nearest whole number
        cansPaintNeeded = Math.ceil(gallonsPaintNeeded);
        System.out.println("Cans needed: "+ cansPaintNeeded +" cans(s)");  //print the result
    }
}
