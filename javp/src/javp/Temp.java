/* This program ask user for a daily input of weather temperature
 * and print the day of week and the temperature associated with it.
 * It display the average, high, and low temperature including with the day.
 */
package javp;

/* This import a module from java library called util. The '.*' import everything
*in the util module. That includes the scanner module. The scanner module is used 
*to get input from user.
**/
import java.util.*;
import java.util.Scanner;

// This 
public class Temp
{
	
	public static void main(String[] args) {
		/* This greet the user with a welcome message and simple introduction*/
	
		System.out.println("Hi, This is a Weather Assistant App");
		System.out.println("Let's Get Started!");
		System.out.println("\nPlease Enter The weather forcast For Each Days in the Week");
		
		// This create object that receive input from the user.
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		//Array that holds the days of week
		String [] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday","Sunday"};
		
		// Create an array that hold the input temperature
		int [] temp = new int[7];
		
		//iterating over each day
		for (int i = 0; i < daysOfWeek.length; i++) {
			
			// Prompting user for temperature of the days of the week.
			System.out.printf("Enter temperature on %s:", daysOfWeek[i]);
			
			// This read the temperature value
			temp[i] = input.nextInt();
		}
		
		System.out.println(" ");
		System.out.println("\n********OUTPUT**********");
		
		//iterating and printing each week day and its temperature
		for (int i = 0; i < daysOfWeek.length; i++){
			System.out.printf("\nOn %s: Temperature was %d\u00B0F ", daysOfWeek[i], temp[i]);
		}

		System.out.println(" ");

		//calling the lowtemp method
		lowTemp(temp, daysOfWeek);
		//calling the hightemp method
		highTemp(temp, daysOfWeek);
		
		// Create the average temperature method 	
		float avgTemps = avgTemps(temp);
			// This print out the average temperature in .2f and F degree symbol
			System.out.printf("\nThe average temperature of the week is: %2f\u00B0F", avgTemps);

	}	

		// This void method calculate the lower temperature and prints the day and temperature on that day
		public static void lowTemp(int[] temp, String[] days) 
		{	// This create a variable called low and set it to temp array 0
			int low = temp[0];
			int index = 0;	//a variable that holds the index
			
			// This iterating over each day to look for the lowest temperature inputed
			for (int i = 0; i < temp.length; i++)
			{
				if (low > temp[i])
				{
					low = temp[i];	//storing the lowest temp.
					index = i;	//storing the index
				}
			}
			//printing both positions
			System.out.printf("\nThe low temperature of the week was on %s: with temp at %d\u00B0F", days[index], low);
		}


		// This void method calculates the highest temperature and prints the day and temperature 
		//on thats day. 
		// 
	public static void highTemp(int[] temp, String[] days)
	{	// This create a variable called high and set it to temp array 0
		int high = temp[0];
		int index = 0;	//a variable that holds the index

		// This iterating over each day to look for the highest temperature inputed
		for (int i = 0; i < temp.length; i++) {
			if (high < temp[i])
			{
				high = temp[i];
				index = i;	//storing the index
			}
		}
		//printing both positions
		System.out.printf("\nThe high temperature of the week was on %s: with temp at %d\u00B0F", days[index], high);
	}

	// This calculate the average temperature
	public static float avgTemps(int[] temp) {
		
		// This create a variable called average and set it to temp array 0
		int temTotal = temp[0];
		
		// This iterating over each day to look for the average temperature
		for (int i = 0; i < temp.length; i++)
			temTotal = temp[i] + temTotal;
		
		// This return the average temperature.
		return ((float)temTotal / temp.length);
	}
	
	
	
}