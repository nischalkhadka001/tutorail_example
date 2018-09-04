package collectionBeginner;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionArray {
	
	
	
	public static void main (String [] args) {

	  Collection<Integer> collection = new ArrayList<Integer>(); //Collection is an interface--<Integer> it define than it is an integer type ---ArrayList is an implementation of Collection

	      collection.add(9843);
	      collection.add(5624);
	      collection.add(6723); //we can not give any string value coz we have declared as a integer in collection 
	      collection.add(3245);
	      
	      collection.remove(6723); // we can remove the integer
	      
	    for(Integer  i : collection) {  //loop to print the values
	    	  
	    	  System.out.println(collection);
	    	  
	    	  
	      }
	      
	      
	}
}

