package collectionBeginner;

import java.util.Random;

public class CollectionExample {
	
	public static void main(String [] args) {
		
		int[]  nums =new int[50];
		
		Random ran = new Random();
		
		for(int i = 0 ; i<10; i++){
			
	     nums[i]	= ran.nextInt(50);	
			
	
		}
	
		System.out.println("random numers::"+nums[9]);
	    for (int n : nums) {
	    	System.out.println("This is an enhance for loop::"+n);
	    	
	    }
	
	}

}
