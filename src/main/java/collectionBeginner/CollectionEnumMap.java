package collectionBeginner;

import java.util.EnumMap;
import java.util.Map;

public class CollectionEnumMap {

	
	public enum Day{
		
		
		SUNDAY, MONDAY,TUESDAY,WEDNESDAY ,THURSDAY,FRIDAY,SATURDAY
		
	};
	
	public static void main(String[] args) {
		

		 EnumMap<Day, String> map = new EnumMap<Day, String>(Day.class); 
		 
		 map.put(Day.MONDAY, "1");
		 map.put(Day.FRIDAY, "2");
		 map.put(Day.SATURDAY, "5");
		 map.put(Day.THURSDAY, "9");
		 map.put(Day.TUESDAY, "10");
		 
		
		 for(Map.Entry m:map.entrySet()){    
		       System.out.println(m.getKey()+" "+m.getValue());    
		      }
		 
	}
	
}
