package quiz19;

import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;

public class ListQuiz01 {
	public static void main(String[] args) {

		/*
		 * 1. list에 1~20까지 값을 순서대로 저장
		 * 2. list 값을 순서대로 출력
		 */

		List<Integer> list = new ArrayList<>();

		for(int i = 1; i <= 20; i++) {
			list.add(i);
			System.out.println(list.get(i-1)); 
		}

		System.out.println("------------------");

		/*
		 * 1. User 저장하는 list 생성
		 * 2. 3개의 각각 다른 User객체 만들고 순서대로 저장
		 * 3. User 객체 안에 홍길동 있으면 해당 객체의 name, age를 출력
		 * 4. User 객체 안에 홍길자 가 있으면 해당 객체를 삭제
		 */
		LinkedList<User> list2 = new LinkedList<>();

		list2.add(new User("홍길동", 20));
		list2.add(new User("홍길자", 30));
		list2.add(new User("홍길순", 40));

		for(int i = 0; i < list2.size(); i++) {
			if(list2.get(i).getName().equals("홍길동")) {
				System.out.println((list2.get(i)).getName() + ", " + (list2.get(i)).getAge());
			}
		}
		for(int i = 0; i < list2.size(); i++) {
			if(list2.get(i).getName().equals("홍길자")) list2.remove(i);
		}
	}
}
