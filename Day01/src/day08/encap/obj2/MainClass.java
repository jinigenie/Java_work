package day08.encap.obj2;

public class MainClass {
	public static void main(String[] args) {
		
		// Hotel h = new Hotel(new Chef());
		// 위와 같은 맥락
		Chef c = new Chef();
		Hotel h = new Hotel(c);
		
		
		Chef chef = h.getChef();
		System.out.println(c == chef); //true
		chef.cooking();
		
		Class<?> Is = h.getClass(); // 메소드 작성 시, 반환유형 확인하여 그에 맞게 작성
		
		
	}
}
