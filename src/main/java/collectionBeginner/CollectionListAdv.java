package collectionBeginner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;


public class CollectionListAdv {
   
	  public static void main(String [] args) {
		    
		   
		  List<Integer > number = new ArrayList<>(); 
		  
		  Random r = new  Random ();
		  
		  for(int i = 0; i<1000;i++) {
			  
			  number.add(r.nextInt(1000));	  
			  
		  }
		  
		  Collections.sort(number);
		  
		  for(Integer o : number) {
			  
			  System.out.println(o);
			  
			  
		  }
		  
		  
		  
	  }
	
}
