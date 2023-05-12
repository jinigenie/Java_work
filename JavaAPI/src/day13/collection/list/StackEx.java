package day13.collection.list;

import java.util.List;
import java.util.Stack;

public class StackEx {
	public static void main(String[] args) {
		
		Stack<String> stack1 = new Stack<>();
		
		// 부모타입인 List로 선언은 가능하지만 사용 가능한 기능이 List가 됨
		List<String> stack2 = new Stack<>();
		
		// 데이터 추가
		stack1.push("a");
		stack1.push("b");
		stack1.push("c");
		
		// 형태를 문자열로 확인
		System.out.println(stack1.toString());
		
		// 데이터 꺼내기
		System.out.println(stack1.pop());
		System.out.println(stack1.toString());
		
	}
}
