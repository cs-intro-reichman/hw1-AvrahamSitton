// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat { 
	public static void main(String[] args) {
		String inputTime = args[0];		
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
			if (hours == 0 ){
              System.out.print("12:" + minutes + " AM");
		    }else if( hours < 10 ){
				System.out.print(args[0].charAt(1) + ":" + minutes + " AM");
			}else if(hours < 12 ){
			  System.out.print(hours + ":" + minutes + " AM");
			}else { if (hours == 12){
				System.out.print("12:" + minutes + " PM");
			}else { if(hours < 24 ){
				System.out.print(hours - 12 + ":" + minutes + " PM");
		
             
			  }
		}
}
	}}