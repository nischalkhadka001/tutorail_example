package collectionBeginner;

import java.util.ArrayList;
import java.util.Collections;

public class ColllectionArrayList {
	
	public static void main(String[] args) {
		
		ArrayList<String> array = new ArrayList<>();
		
		array.add("Nischal");
		array.add("Shekhar");
		array.add("Saugat");
		array.add("Diwash");
		
		Collections.sort(array);
		
		for(String s :array){
			
			System.out.println(s);
			
			
		}
	}

}
