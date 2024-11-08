// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
        int maxRange = Integer.parseInt(args[0]);
		
		double rand0 = Math.random() * maxRange;
		double rand1 = Math.random() * maxRange;
		double rand2 = Math.random() * maxRange;

		int randInt0 = (int) rand0;
		int randInt1 = (int) rand1;
		int randInt2 = (int) rand2;

        System.out.println(randInt0 + " " + randInt1 + " " + randInt2);
		
		int maxRand0 = Math.max(randInt0 , randInt1);
		int maxRand1 = Math.max(randInt1 , randInt2);
		
		int maxRand2 = Math.max(maxRand0 , maxRand1);
        
		int minRand0 = Math.min(maxRand0 , maxRand1);
		
		
		int minRand1 = Math.min(randInt0 , randInt1);
		int minRand2 = Math.min(randInt1 , randInt2);

		int minRand3 = Math.min(minRand1 , minRand2);

		System.out.println(maxRand2 + " " + minRand0 + " " + minRand3);



           
            
			
	}
}
