package colecciones;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Vector;
import java.util.stream.Collectors;

public class coleccionesTest {
	
	static List test = new ArrayList();
	
//	public static void al() {
//		test.add("red");	
//		test.add("red2");	
//		test.add("red3");	
//		
//		List testeo = new ArrayList();
//		System.out.println(test.stream().filter(s -> s.toString().startsWith("r"))
//							.filter(s -> s.toString().length() == 3)
//						   .collect(Collectors.toList()));
//		System.out.println("test");
//		
//		testeo =  (List) test.stream().filter(s -> s.toString().startsWith("r"))
//				.filter(s -> s.toString().length() == 3)
//				   .collect(Collectors.toList());
//		
//		System.out.println(testeo.size());
//		System.out.println(testeo.get(0));
//
//	}
	
	public static void main(String args[])
	{
		ArrayLis();
	}
	
	
	public static void ArrayLis() {
		 ArrayList<Integer> al = new ArrayList<Integer>();

	        for (int i = 1; i <= 5; i++)
	            al.add(i);
	  
	        System.out.println(al);
	  
	        al.remove(3);

	        System.out.println(al);
	  
	        for (int i = 0; i < al.size(); i++) {
	            System.out.print(al.get(i) + " ");
	    }
	}

		
	
	
	public static void linkedLis() {
        LinkedList<String> al=new LinkedList<String>();// creating linked list 
        al.add("Cesar"); // adding elements 
        al.add("Res"); 
        al.add("tres"); 
        
        System.out.println( al.contains("Cesar"));
        
        al.addFirst("test"); 
        al.remove("Res");
        System.out.println(al.indexOf("tres") + " index");

        Iterator<String> itr = al.iterator();
        while(itr.hasNext()){ 
            System.out.println(itr.next());
        }		
	}
	
	
	public static void vector() {
		Vector object = new Vector(3,5);
		object.add(2);
		object.add("testing");
		
		object.remove("testing");

		System.out.println(object);
		System.out.println(object.size());

	}
	
	public static void prioridad() {
		 PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();
		  
	        // Adding items to the pQueue using add()
	        pQueue.add(5);
	        pQueue.add(2);
	        pQueue.add(3);
	  
	        System.out.println(pQueue.peek());

	        System.out.println(pQueue.poll());
	  
	        System.out.println(pQueue.peek());
	}
	
	public static void deque() {
        ArrayDeque<Integer> de_que = new ArrayDeque<Integer>(10);
        
        // add() method to insert
        de_que.add(10);
        de_que.add(20);
        de_que.add(30);
  
        System.out.println(de_que);
  
        // clear() method
        de_que.clear();
  
        // addFirst() method to insert the
        // elements at the head
        de_que.addFirst(200);
        de_que.addFirst(100);
  
        // addLast() method to insert the
        // elements at the tail
        de_que.addLast(12);
        de_que.addLast(13);
        de_que.addFirst(5);

        System.out.println(de_que);
	}
	
	public static void hashSet() {
		HashSet al=new HashSet(); // creating hashSet
		al.add("Andres");                 // adding elements
		al.add("BLAKE");
		al.add("CESAR");
		al.add(null);


		System.out.println(al);

		al.remove("Amit");
		System.out.println(al.iterator());
		System.out.println(al.isEmpty());
		Iterator itr=al.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
	
	public static void hashMap() {
		 HashMap<Integer, String> hm = new HashMap<Integer, String>();
		  
	        hm.put(1, "Geeks");
	        hm.put(2, "For");
	        hm.put(3, "Geeks");
	  
	        // Finding the value for a key
	        System.out.println("Value for 1 is " + hm.get(1));
	  
	        // Traversing through the HashMap
	        for (Entry<Integer, String> e : hm.entrySet())
	            System.out.println(e.getKey() + " " + e.getValue());
	}

		
	
	
}
