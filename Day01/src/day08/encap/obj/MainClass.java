package day08.encap.obj;

public class MainClass {
	public static void main(String[] args) {
		
		Hotel h = new Hotel();
		

		
//		Chef chef = new Chef(); // chef 생성해서 hotel에 전달
//		h.setChef(chef);

		h.setChef(new Chef()); // 한 줄로 표현

		Chef c = h.getChef(); // hotel 안의 chef를 꺼냄
		c.cooking();
	}
}
