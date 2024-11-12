
public class FVCalc {
    public static void main(String[] args) {
        int currentValue = Integer.parseInt(args[0]);
        double rate = Double.parseDouble(args[1]) / 100.0;
        int years = Integer.parseInt(args[2]);
        
        double futureValue = currentValue * Math.pow((1 + rate), years);
        
        int futureInt = (int) Math.round(futureValue);
        double a =  Double.parseDouble(args[1]);
        System.out.println("After " + years + " years, a $" + 
            currentValue + " saved at " + a + "% will yield $" + futureInt);
    }
}
