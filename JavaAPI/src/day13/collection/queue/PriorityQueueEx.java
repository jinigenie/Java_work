package day13.collection.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueEx {
	public static void main(String[] args) {
		
		/* 
		 * Priority(우선순위큐)
		 * -> 정렬기능 포함
		 */
		
		Queue<Integer> que = new PriorityQueue<>();
		
		que.offer(4);
		que.offer(3);
		que.offer(1);
		que.offer(5);
		que.offer(6);
		que.offer(10);
		que.offer(9);
		
		System.out.println(que.toString());
		
		// 값 꺼내기
		System.out.println(que.poll());
		System.out.println(que.poll());
		System.out.println(que.poll());
		System.out.println(que.poll());
		System.out.println(que.poll());

		System.out.println(que.toString());
		
		System.out.println("======================================");
		
		// User 객체 담을 수 있는 큐
		// 큐가 순서 확인할 때 compareTo 메소드를 확인
		// compareTo에 정의된 순서에 의해 우선순위 정함
		
		// comparable 인터페이스 상속받아 compareTo 메소드를 오버라이딩하면 객체가 우선순위 가질 수 있음
		Queue<User> queue = new PriorityQueue<>();
		
		queue.offer(new User("홍길동", 10));
		queue.offer(new User("홍길자", 20));
		queue.offer(new User("홍길순", 30));
		queue.offer(new User("신사임당", 40));
		
		System.out.println(queue.toString());
		System.out.println(queue.poll().getName());
		
		
	}
}
