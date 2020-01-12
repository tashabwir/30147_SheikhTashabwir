package datastructure;

import java.util.ArrayList;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 */

		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(45);
		arr.add(78);
		arr.add(96);
		arr.add(31);
		arr.add(65);
		System.out.println(arr.get(2));
		for(int i : arr) {
				System.out.println(i);
		}
		while (!arr.isEmpty()){
			System.out.println(arr);
			arr.remove(0);
		}

	}

}
