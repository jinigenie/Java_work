package day13.generic.bad;

public class ABC {
	// ABC를 어떤 타입이든 저장할 수 있는 클래스
	// 제네릭이 없는 경우

	private Object obj;
	
	public void setObj(Object obj) {
		this.obj = obj;
	}
	
	public Object getObj() {
		return obj;
	}
	
	
}
