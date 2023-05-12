package day13.generic.good;

public class MainClass {
	public static void main(String[] args) {
		
		ABC<String> abc = new ABC<String>();
		
		abc.setT("apple");
		String fruit = abc.getT();
		
		ABC<Person> abc2 = new ABC<>(); // 생성자 꺽쇠는 생력 가능
		
		abc2.setT(new Person());
		Person p = abc2.getT();
		
		ABC<Object> abc3 = new ABC<>();
		
//		ABC<int> abc4 = new ABC<>(); - error
		ABC<Integer> abc4 = new ABC<>();
		
		//////////////////////////////////////////
		DEF<Integer, String> def = new DEF<>();
		
		
	}
}
