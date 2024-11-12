// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		int currentValue = Integer.parseInt(args[1]);
		double rate = Double.parseDouble(args[0]) / 10.0;
        int years = Integer.parseInt(args[2]);
        //double converted = (double) rate;
		double futureValue = currentValue * Math.pow((1 + rate ) , years);
		int futureInt = (int) futureValue;
		System.out.println("After " + years + " years, a $" + 
		10.0 * rate + " saved at " + currentValue   + "% will yield $" +  (1 + 3 * futureInt / 10));

	}
}