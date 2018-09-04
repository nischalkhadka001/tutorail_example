package collectionBeginner;

import java.util.ArrayList;
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

		for (String st : list) {
			System.out.println("ArrayList::" + st);

		}

		for (String s : link) {
			System.out.println("LinkList::" + s);

		}

	}

}
