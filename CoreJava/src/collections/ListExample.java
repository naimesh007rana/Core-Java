package collections;

import java.util.ArrayList;
import java.util.Collections;


public class ListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
String[] names = {"abc","xyz","pqr"};
		
		ArrayList<String> list1 = new ArrayList<String>();
		
		// adding data to the list
		list1.add("Akshay");
		list1.add("Priya");
		list1.add("Pankaj");
		
		System.out.println(list1);
		
		// Access the data at 3rd position
		System.out.println("the data at 3rd position is " + list1.get(2));

		
		//removing the data
		list1.remove(0);
		System.out.println(list1);
		
		// Access the data at 1st position
		System.out.println("the data at 1st position is " + list1.get(0));

list1.add("Deepa");
		list1.add("Aprana");
		System.out.println(list1);
		
		//Print the last name into the array list
		System.out.println("Last name is " + list1.get(list1.size()-1));

		//Change name at 3rd position
		list1.set(2, "Naimesh");
		System.out.println(list1);
		
		//iterate through the list
		
		for(int i=0;i<list1.size();i++) {
			System.out.println("value at index "+i+" "+list1.get(i));
			
		
			}
		
		//for each loop
		for(String name:list1) {
			System.out.println(name);
			
			}
		
		//get index by name
for(int i=0;i<list1.size();i++) {
			
			//System.out.println("Value at index " + i + " "  + list1.get(i));
			
			if(list1.get(i).equals("Naimesh")) {
				System.out.println("Value Naimesh is at index " + i);
			}
}
		
		//shorting in ascending
		Collections.sort(list1);
		System.out.println(list1);
		
		//shorting in descending
		Collections.sort(list1,Collections.reverseOrder());
		System.out.println(list1);

	
	
	
	
	
	
	}

}
	
