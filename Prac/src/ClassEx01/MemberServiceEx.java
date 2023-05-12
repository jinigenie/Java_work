package ClassEx01;

import java.util.Scanner;

public class MemberServiceEx {
	public static void main(String[] args) {
		MemberService ms = new MemberService();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("id, pw 순서대로 입력: ");
		boolean res = ms.login(scan.next(), scan.next());
		if(res) {
			System.out.println("로그인 되었습니다.");
			System.out.print("id 입력: ");
			ms.logout(scan.next());
		}else {
			System.out.println("id 또는 pw가 올바르지 않습니다.");
		}
		scan.close();
	}
}
