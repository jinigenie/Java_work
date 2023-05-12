package day13.generic.bad;

public class MainClass {
	public static void main(String[] args) {
		
		/* 
		 * Object형으로 선언하면 무엇이든 저장 가능하지만,
		 * 사용할 때, 알맞은 타입으로 형변환 필요
		 * 
		 * 잘못 형 변환하면 예외 발생
		 */
		ABC abc = new ABC();
		abc.setObj("홍길동");

		String name = (String)abc.getObj();
		System.out.println(name);
		
		ABC abc2 = new ABC();
		abc2.setObj(new Person());
		
		Person p = (Person)abc2.getObj();
		
	}
}
