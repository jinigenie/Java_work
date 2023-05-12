package Prac;

import java.util.Arrays;
import java.util.Scanner;

public class StudentManage3 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String[] nameList = new String[5];
		int[] ageList = new int[5];
		String[] infoList = new String[5];

		int cnt = 0; // 고객 수
		int idx = -1; // 조회할 위치

		while(true) {
			System.out.println(Arrays.toString(nameList));
			System.out.println("[정보] 고객 수: " + cnt + ", 조회 위치: " + idx);
			System.out.println("[메뉴] 1.추가, 2.이전정보, 3.다음 정보, 4.현재정보, 5.정보수정, 6.정보삭제, 7.종료");
			System.out.println("===================================================================");
			System.out.print("메뉴 입력 >> ");
			int opt = scan.nextInt();

			switch(opt) {
			case 1:
				System.out.print("이름 입력> ");
				nameList[cnt] = scan.next();
				System.out.print("나이 입력> ");
				ageList[cnt] = scan.nextInt();
				System.out.print("성별 입력> ");
				infoList[cnt] = scan.next();
				cnt++;
				break;
			case 2:
				if(idx <= 0) {
					System.out.println("정보가 없습니다.");
				}else {
					System.out.println("이름: " + nameList[idx - 1]);
					System.out.println("나이: " + ageList[idx - 1]);
					System.out.println("성별: " + infoList[idx - 1]);
					idx--;
				}
				break;
			case 3:
				if(idx >= cnt - 1) {
					System.out.println("정보가 없습니다.");
				}else {
					System.out.println("이름: " + nameList[idx + 1]);
					System.out.println("나이: " + ageList[idx + 1]);
					System.out.println("성별: " + infoList[idx + 1]);
					idx++;
				}
				break;
			case 4:
				if(idx >= cnt || idx < 0) {
					System.out.println("정보가 없습니다.");
				}else {
					System.out.println("이름: " + nameList[idx]);
					System.out.println("나이: " + ageList[idx]);
					System.out.println("성별: " + infoList[idx]);
				}
				break;
			case 5:
				if(idx >= cnt || idx < 0) {
					System.out.println("변경할 정보가 없습니다.");
				}else {
					System.out.print("변경할 이름 입력> ");
					nameList[idx] = scan.next();
					System.out.print("변경할 나이 입력> ");
					ageList[idx] = scan.nextInt();
					System.out.print("변경할 성별 입력> ");
					infoList[idx] = scan.next();
				}
				break;
			case 6:
				//현재 정보 삭제
				if(idx >= cnt || idx < 0) {
					System.out.println("삭제할 정보가 없습니다.");
				}else {
					for(int i = idx; i < cnt - 1; i++) {
						nameList[i] = nameList[i+1];
						ageList[i] = ageList[i+1];
						infoList[i] = infoList[i+1];
					}
					System.out.println("삭제 완료");
					cnt--;
				}
				break;
			case 7:
				System.out.println("프로그램 종료");
				return;
			default:
				System.out.println("잘못 입력했습니다.");
				break;
			}
			System.out.println("-----------------------------------------");
		}

	}
}
