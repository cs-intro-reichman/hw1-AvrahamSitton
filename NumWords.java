// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	
		int numUser = Integer.parseInt(args[0]);
		int hundreds = numUser / 100;
		int tens = (numUser - (hundreds * 100)) / 10;
		int ones = numUser - (hundreds * 100) - (tens * 10);

		System.out.println(hundreds + " hundreds, " + tens + " tens, " + "and " + ones + " ones." );
		
	}
}
