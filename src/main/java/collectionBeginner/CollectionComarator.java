package collectionBeginner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class CollectionComarator {

	public static void main(String [] args) {
		
		List<Students> stu = new ArrayList<>();
		
		stu.add(new Students (001,55));
		stu.add(new Students(002, 63));
		stu.add(new Students(003, 40));
		stu.add(new Students(004, 90));
		stu.add(new Students(005, 22));
		
	//	Collections.sort(stu,(s1,s2) ->{
	//		return s1.marks>s2.marks?-1:s1.marks<s2.marks?1:0;  });
		
		
		Collections.sort(stu);
		
		for(Students s : stu) {
			
			System.out.println(s);
			
		}

		
		
	}
}

	class Students implements Comparable<Students>{   //Comparable in an interface
		 int roll;
		 int marks;
		public Students(int roll, int marks) {
			
			this.roll = roll;
			this.marks = marks;
		}
		@Override
		public String toString() {
			return "Students [roll=" + roll + ", marks=" + marks + "]";
		}
		 
		   public int compareTo(Students s) {
			   
			  return this.marks<s.marks?-1:this.marks>s.marks?0:1; 
			   
			   
			   
		   }
	
		}
		
		
	
