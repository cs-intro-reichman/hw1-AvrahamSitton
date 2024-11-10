// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		int currentValue = Integer.parseInt(args[0]);
		double rate = Double.parseDouble(args[1]);
        int years = Integer.parseInt(args[2]);
        //double converted = (double) rate;
		double futureValue = currentValue * Math.pow((1 + rate) , years);
		int futureInt = (int) futureValue / 100;
		System.out.println("After " + years + " years, a $" + 
		currentValue + " saved at " + rate + "% will yield $" + futureInt);

	}
}