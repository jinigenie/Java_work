package ClassEx01;

public class MemberService {
	
	boolean login(String id, String pw) {
		if(id.equals("hong") && pw.equals("12345")) return true;
		else return false;	
	}
	
	void logout(String id) {
		if(id.equals("hong")) System.out.println("로그아웃 되었습니다.");
		else System.out.println("로그아웃 실패했습니다.");
	}
}
