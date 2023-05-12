package day13.collection.set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx {
	public static void main(String[] args) {
		
		// set + 정렬
		Set<Integer> ts = new TreeSet<>();
		
		ts.add(100);
		ts.add(50);
		ts.add(100);
		ts.add(10);
		ts.add(5);
		ts.add(45);
		
		System.out.println(ts.toString());
		
		for(int a : ts) {
			System.out.println(a);
		}
		
	}
}
