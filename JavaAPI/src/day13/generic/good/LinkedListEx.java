package day13.generic.good;

import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<>();
		
		// list와 기능은 동일
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		System.out.println(list.toString());
		
		// 중간에 추가
		list.add(3, 10);
		System.out.println(list.toString());

		// 값 얻기 get()
		System.out.println(list.get(3));

		// 값 삭제
		list.remove(3);
		System.out.println(list.toString());
		
		System.out.println("==============================");
		
		// Linklist는 queue의 기능을 구현하기 때문에 queue 기능 사용 가능
		list.offer(10);
		list.offer(11);
		System.out.println(list.toString());

		// 값 빼기
		System.out.println(list.poll());
		System.out.println(list.toString());
		
	}
}
