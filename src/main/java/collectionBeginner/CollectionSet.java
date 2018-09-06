package collectionBeginner;

import java.util.Set;
import java.util.TreeSet;

public class CollectionSet {
	
	public static void main (String []  args) {
		
		Set<Integer> set = new TreeSet<>();  //TreeSet or  HashSet
		 
		set.add(32);
		set.add(55);
		set.add(22);
		set.add(95);
		set.add(55);  //set does not support duplicate data and it doest not print the value in sequence we should use TreeSet in the Place of hash set to maintaion the sequence value
		
		
		for(Integer i : set) {
			
			System.out.println(i);
			
			
		}
		
	}

	
	
}
