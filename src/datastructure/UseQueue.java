package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 */

		Queue<Integer> ticketNum = new LinkedList<>();
		//Adding to the Queue
		ticketNum.add(001);
		ticketNum.add(002);
		ticketNum.add(003);
		ticketNum.add(004);
		ticketNum.add(005);
		System.out.println(ticketNum);

		//peeking the queue
		System.out.println("first position: Ticket #" + ticketNum.peek());

		//removing 2 elements
		ticketNum.remove();
		ticketNum.remove();
		System.out.println("first position: Ticket #" + ticketNum.peek());

		//poll
		System.out.println("first position: Ticket #" + ticketNum.poll());

		Iterator itt = ticketNum.iterator();
		while(itt.hasNext()){
			System.out.println(ticketNum.poll());
		}

		ticketNum.add(6);
		ticketNum.add(7);
		ticketNum.add(8);
		for(Integer num : ticketNum){
			System.out.println(num);
		}
	}

}
