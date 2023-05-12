package day16.api.ramda.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Stream;

public class MainClass02 {

	public static void main(String[] args) {
		
		/*
		 * 람다 함수의 구현 상용문법
		 * 
		 * 
		 */

		List<Integer> list = new ArrayList<>();
		Random ran = new Random();

		for(int i = 0; i < 100; i++) {
			list.add(ran.nextInt(100)+1); //1~100;
		}
		System.out.println(list.toString());

		//중간처리 함수들
		//		Stream<Integer> stream = list.stream();
		//		stream = stream.distinct();
		//		stream.forEach((a) -> System.out.print(a + " "));
		// distinct => stream타입으로 변환*/
		list.stream().distinct().forEach((a) -> System.out.print(a+" "));

		System.out.println("\n=========================================");

		//sort - 정렬
		list.stream().distinct().sorted().forEach((a) -> System.out.print(a + " "));

		System.out.println("\n==========================================");
		//filter() - 리턴에 true값만 남기고 필터링 = 짝수만
		list.stream().distinct().filter((a) -> a % 2 == 0).sorted().forEach( a -> System.out.print(a + " "));

		System.out.println("\n==========================================");
		//map() - 반환에 정의 된 값으로 완전히 새로운 스트림반환

//		list.stream().map( (a) -> {
//		
//			String str;
//			if(a % 2 == 0) {
//				str = "짝수";
//			} else {
//				str = "홀수";
//			}
//			return str;
//		});
		
		list.stream().map( (a) -> a % 2 == 0 ? "짝수" : "홀수").forEach(a -> System.out.print(a + " "));

		System.out.println("\n==========================================");
		//mapToDouble = 반환에 정의된 값으로 double형 스트림변경
		//mapToInt() -
		//MapToLong() -  
		
		list.stream().mapToDouble( a -> a).forEach(a -> System.out.print(a + " "));
	}

}
