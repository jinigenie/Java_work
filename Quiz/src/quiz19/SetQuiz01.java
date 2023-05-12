package quiz19;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SetQuiz01 {
	public static void main(String[] args) {

		/*
		 * 중복되지 않는 6자리 수 (로또번호)
		 * 
		 * 1. Random 객체 이용하여 1~45까지 랜덤한 수 생성
		 * 2. set에 6개의 랜덤 로또 번호 저장
		 */
		Set<Integer> set = new HashSet<>();
		Random rd = new Random();
		
		
		while(set.size() < 6) {
			set.add(rd.nextInt(45)+1);
//			set.add((int)(Math.random()*45) + 1);
		}
		
		System.out.println(set.toString());
		
		
	}
}
