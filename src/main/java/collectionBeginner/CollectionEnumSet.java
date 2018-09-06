package collectionBeginner;

import java.util.EnumSet;
import java.util.Set;

public class CollectionEnumSet {
	
	public static void main(String[] args) {
		
	//	Set<day> set =EnumSet.of(day.THURSDAY, day.SUNDAY);
		
		Set<day> enums = EnumSet.allOf(day.class);
		System.out.println("the day are::"+enums);
	//for(day d : set) {
		
//		System.out.println(d);}
	
	
	//for(day da : enums) {
		
	//	System.out.println(da);}
		
	}
	
	enum day{
		
		SUNDAY,MONDAY,TUESDAY,WEDNESDAY ,THURSDAY,FRIDAY,SATURDAY;
		
		
	}

}
