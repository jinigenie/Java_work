package quiz15;

public class MainClass {

	public static void main(String[] args) {
		
		IBag ic = new IBagClass();
		
		ic.insert("a");
		ic.insert("b");
		ic.insert("c");
		ic.insert("d");
		ic.insert("e");
		ic.insert("c");
		
		ic.print();
		
		System.out.println("c가 있나요? " + ic.search("c"));
		System.out.println("x가 있나요? " + ic.search("x"));
		
		System.out.println("c 삭제 >> " + ic.delete("c"));
		ic.print();
		
		ic.insert("f");
		ic.print();
		ic.insert("g");
		ic.print();
	}
	
	
}
