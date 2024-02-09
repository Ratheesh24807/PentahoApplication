package pentaho;

import java.util.Random;

public class RandomNumberGeneration {
	
	public static void main(String[] args) {
		
		Random ran = new Random();
		
		 Integer num= ran.nextInt(6);
		 
		 if(num>3) {
		 
		 
		 System.out.println("Your Number is " + num);
		
	}else {
		
		System.out.println("You have not assigned with any number");
	}
		 
	}

}
