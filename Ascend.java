// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
        int maxRange = Integer.parseInt(args[0]);
		
		double rand0 = Math.random() * maxRange;
		double rand1 = Math.random() * maxRange;
		double rand2 = Math.random() * maxRange;

		int randInt0 = (int) rand0,
		    randInt1 = (int) rand1,
		    randInt2 = (int) rand2;

        System.out.println(randInt0 + " " + randInt1 + " " + randInt2);
		
		int minRand0 = Math.min(randInt0 , Math.min(randInt1 , randInt2)),
		    maxRand0 = Math.max(randInt0 , Math.max(randInt1 , randInt2));

		System.out.println(minRand0 + " " + 
		((randInt0 + randInt1 + randInt2) - (minRand0 + maxRand0))  + " " + maxRand0);



           
            
			
	}
}
