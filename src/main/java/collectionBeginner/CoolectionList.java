package collectionBeginner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class CoolectionList {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("Nischal");
		list.add("Ram");
		list.add("Abishek");
		list.add("hari");
		list.add("Krishna");

		List<String> link = new LinkedList<>();

		link.add("mahendra");
		link.add("Ram");
		link.add("Abishek");
		link.add("hari");
		link.add("Krishna");
		
		link.add("26");
		link.add("33");
		link.add("2");
		link.add("69");
		link.add("1");
		
		list.add(3, "harimaya"); //list provide and attribute to add value in the any index where collection can only add the value in last it cant specify the index/place 

		for (String st : list) {
			System.out.println("ArrayList::" + st);
		

		}
               
		  Collections.sort(link);  //it helps to keap tghe value in order and it is only applicab;e for list
		
		for (String s : link) {
			System.out.println("LinkList::" + s);

		}

	}

}
