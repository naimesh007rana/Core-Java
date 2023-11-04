package collections;

import java.util.HashMap;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
HashMap<String,Integer> map1 = new HashMap<String,Integer>();
		
		map1.put("Item1", 100);
		map1.put("Item2", 200);
		map1.put("Item3", 100);
		map1.put("Item4", 50);
		
		System.out.println(map1);

		//Updating value
		map1.put("Item3",300);
		System.out.println(map1);
		
		//find Item4
		System.out.println("price of item4 is" + " " +map1.get("Item4"));
		
		//remove item2
		map1.remove("Item2");
		System.out.println(map1);
		
		//getting value through foreach
		
		for(int value:map1.values()) {
			System.out.println("value is :" + value);
		}
		
		//getting item through foreach
		
				for(String keys:map1.keySet()) {
					System.out.println("key is :" + keys);
					System.out.println("value is :" + map1.get(keys));
					
				}
		
		
	}

}
