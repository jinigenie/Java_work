package day13.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListEx {
	public static void main(String[] args) {
		
//		ArrayList<String> list = new ArrayList<>();
		
		List<String> list = new ArrayList<>(); // 이 형태로 많이 사용
		
		// list 추가
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("a");
		list.add("d");
		
		// 문자열로 확인
		System.out.println(list.toString());
		
		// 길이 확인 size()
		System.out.println("리스트 길이: " + list.size());
		
		// 중간에 데이터 추가
		list.add(2, "e");
		System.out.println(list.toString());
		
		// 값의 확인
		System.out.println(list.get(3));
		System.out.println(list.toString()); // 리스트 값 자체는 바뀌지 X
		
		// 값의 수정
		list.set(1, "bb");
		System.out.println(list.toString());
		
		// 값의 제거
		list.remove(3);
		System.out.println(list.toString());
		list.remove("a");
		System.out.println(list.toString());
		
		// contains
		System.out.println(list.contains("e"));
		
		// empty
		System.out.println(list.isEmpty());
		
		// 전부 삭제
		list.clear();
		System.out.println(list.toString());
		System.out.println(list.isEmpty());
		
		System.out.println("------------------------------");
		
		// 제네릭<?> = 제네릭에 뭐든 다 들어갈 수 있음
		// 제네릭<? extends String> = String과 String의 자식들
		// 제네릭<? super String> = String 타입이 될 수 있으면 전달 가능
		
		List<String> list2 = Arrays.asList("a", "b", "c", "d");
		System.out.println(list2.toString());
		
		// 리스트 병합
		list.addAll(list2);
		System.out.println(list.toString());
		
		
		
		
		
		
		
		
	}
}
