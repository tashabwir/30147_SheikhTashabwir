package datastructure;

import java.util.*;

public class UseMap {

	public static void main(String[] args) {
		/* Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */

		ArrayList<String> fish = new ArrayList<String>();
		fish.add("salmon");
		fish.add("tuna");
		fish.add("flounder");
		ArrayList<String> bird = new ArrayList<String>();
		bird.add("raven");
		bird.add("penguin");
		bird.add("peacock");
		ArrayList<String> mammals = new ArrayList<String>();
		mammals.add("Cat");
		mammals.add("Dog");
		mammals.add("Horse");

		HashMap<String, List<String>> maplist = new HashMap<String, List<String>>();

		maplist.put("Fish", fish);
		maplist.put("Bird", bird);
		maplist.put("Mammals", mammals);

		//System.out.println(maplist);
		System.out.println("\n For Each:\n");
		for (Map.Entry<String, List<String>> st : maplist.entrySet()) {
			System.out.println(st.getKey() + " --------> " + st.getValue());
		}

		System.out.println("\nWhile:\n");
		Set set = maplist.entrySet();
		Iterator it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());


		}

	}
}
