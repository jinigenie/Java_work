package day13.collection.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeEx {
	
	public static void main(String[] args) {
		
//		ArrayDeque<Integer> que = new ArrayDeque<>();
		Deque<Integer> que = new ArrayDeque<>();
		
		// 뒤에서 추가
		que.offerLast(1);
		que.offerLast(2);
		que.offerLast(3);
		que.offerLast(4);
		
		System.out.println(que.toString());

		// 앞에서 꺼내기
		int n = que.pollFirst();
		System.out.println(n + ", " + que.toString());
		
		que.pollFirst();
		que.pollFirst();
		que.pollFirst();
		System.out.println(que.toString());
		
		System.out.println("===================================");
		
		// 앞에서 추가
		que.offerFirst(1);
		que.offerFirst(2);
		que.offerFirst(3);
		que.offerFirst(4);
		
		
		System.out.println(que.toString());
		
		// 뒤에서 꺼내기
		int nn = que.pollLast();
		System.out.println(que.toString() + ", " + nn);
		
		// list의 get처럼 앞 또는 뒤에서 값 확인
		System.out.println(que.peekFirst());
		// 큐는 변하지 않음
		System.out.println(que.peekFirst());
		
		
		
		
		
	}
}
