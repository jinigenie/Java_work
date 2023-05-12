package day12.api.lang.object;

public class MainClass {
	public static void main(String[] args) {
		
		Person p = new Person("홍길동");
		Person p2 = new Person("홍길동");
		
		boolean res = p.equals(p2);
		System.out.println(res);
		
		//toString - 주소값을 문자열로 변환
		System.out.println(p.toString());
	}
}
