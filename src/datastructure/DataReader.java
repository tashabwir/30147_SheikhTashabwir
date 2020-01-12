package datastructure;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class DataReader {

    public static void main(String[] args) {
        /*
         * User API to read the below textFile and print to console.
         * Use BufferedReader class.
         * Use try....catch block to handle Exception.
         *
         * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
         *
         * After reading from file using BufferedReader API, store each word into Stack and LinkedList. So each word
         * should construct a node in LinkedList.Then iterate/traverse through the list to retrieve as FIFO
         * order from LinkedList and retrieve as FILO order from Stack.
         *
         * Demonstrate how to use Stack that includes push,peek,search,pop elements.
         * Use For Each loop/while loop/Iterator to retrieve data.
         */

        String textFile = System.getProperty("user.dir") + "/src/data/self-driving-car";

        FileReader fr = null;
        BufferedReader br = null;
        String line;
        String store = "";

        try {
            fr = new FileReader(textFile);

        } catch (Exception e) {
            System.out.println("Cannot read file ");
        }

        try {
            br = new BufferedReader(fr);
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                store += line;

            }
        } catch (Exception e) {
            System.out.println("Cannot read file ");
        }

        String[] storeArray = store.split(" ");

        Stack<String> Stack = new Stack<String>();
        List<String> List = new LinkedList<String>();

        for (String element : storeArray) {
            Stack.push(element);
            List.add(element);
        }

        System.out.println("\nFIFO LinkedList:");

        Iterator<String> it = List.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("\nPeeking stack to check that the top of the stack contains the final word of the document which is steps!\n");
        System.out.println(Stack.peek());
        System.out.println("\nFILO Stack:");

        while (!Stack.isEmpty()) {
            System.out.println(Stack.pop());
        }

    }

}
