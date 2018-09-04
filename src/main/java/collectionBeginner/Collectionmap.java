package collectionBeginner;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import craterdog.collections.Set;



public class Collectionmap {
	
	
	public static void main(String [] args) {

    Map<Integer,String> map = new HashMap<>();
    
    map.put(001,"Nischal");
    map.put(002, "Shekhar");
    map.put(003, "Nabin");
    map.put(004, "Saugat");
    
    
   
    
    
   java.util.Set<Entry<Integer, String>> setmap = map.entrySet();
   Iterator itr=setmap.iterator();  
    
   while(itr.hasNext()) {
    	 
    	 
	   Map.Entry entry=(Map.Entry)itr.next();  
       System.out.println(entry.getKey()+" "+entry.getValue()); 
    	 
    	 
   }
    
    
    
    
	}


}
