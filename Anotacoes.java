package anotacoes;

import java.util.ArrayList;
import java.util.List;

public class Anotacoes {
	static private List<String> list = new ArrayList<String>();

	public static void newItemList(String item) {
		list.add(item);
	}
	
	public static void readAllItems() {
		
		for(int i = 0 ; i < list.size() ; i++) {
			System.out.println(list.get(i)+ "[index:"+i+"]");
		}
	}
	
	public static void excludeItem(int index) {
		list.remove(index);
		readAllItems();
	}
}
