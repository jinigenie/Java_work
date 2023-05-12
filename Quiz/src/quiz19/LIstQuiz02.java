package quiz19;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LIstQuiz02 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		List<User> list = new ArrayList<>();
		
		while(true) {
			
			System.out.println("[1.등록 | 2.회원정보확인 | 3.회원정보검색 | 4.회원정보삭제 | 5.프로그램종료]");
			System.out.print("메뉴(번호) > ");
			
			int menu = scan.nextInt();
			
			switch (menu) {
			case 1: {
				// 이름, 나이 입력받아 user 객체에 저장, 리스트에 순서대로 추가
				System.out.print("[회원 등록]\n이름과 나이 순서대로 입력> ");
				list.add(new User(scan.next(), scan.nextInt()));
				break;
			}
			case 2: {
				// 리스트에 담긴 모든 회원 이름, 나이 출력
				System.out.println("[전체 회원 정보]");
				/*
				for(int i = 0; i < list.size(); i++) {
					User u = list.get(i);
					System.out.println(u.getName() +", " +u.getAge());
				}
				*/
				for(User uu : list) {
					System.out.println(uu.getName() +", " +uu.getAge());
				}
				break;
			}
			case 3: {
				// 찾을 이름 새롭게 입력 받아, 해당하는 회원 정보 출력
				// 찾는 이름 없으면 "~는 목록에 없습니다." 출력
				System.out.print("[회원 정보 검색]\n검색할 회원 이름> ");
				String name = scan.next();
				int x = 0;
				
				for(int i = 0; i < list.size(); i++) {
					User u = list.get(i);
					if(u.getName().equals(name)) {
						System.out.println("검색한 회원 정보: " + u.getName() +", " +u.getAge());
						x = 1;
						break;
					}  
				}
				if(x == 0) System.out.println(name + "은 목록에 없습니다.");	
				break;
			}
			case 4: {
				// 삭제할 이름 입력받아, 이름과 동일한 User 첫 번째 객체 삭제
				System.out.print("[회원 정보 삭제]\n삭제할 회원 이름> ");
				String name = scan.next();
				
				for(int i = 0; i < list.size(); i++) {
					User u = list.get(i);
					if(u.getName().equals(name)) {
						list.remove(i);
						System.out.println(name + "이 삭제되었습니다.");
					}
				}
				
				break;
			}
			case 5: {
				// 
				System.out.println("[프로그램 종료]");
				return;
			}
			default:
				System.out.println("잘못 입력했습니다.");
				break;
			}
			System.out.println("======================================");
		}
		
		
	}
}
