package quiz11;

public class Computer {
	//1. 키보드, 마우스, 모니터 클래스를 저장하는 변수를 선언하세요
	private KeyBoard kb;
	private Monitor moni;
	private Mouse mou;
	
	//2.기본생성자를 생성하고, 변수를 클래스로 초기화 하세요
	public Computer() {
		this.kb = new KeyBoard();
		this.moni = new Monitor();
		this.mou = new Mouse();
		
	}

	//3.KeyBoard, Mouse, Monitor를 전달받는 생성자를 생성하세요.
	public Computer(KeyBoard kb, Monitor moni, Mouse mou) {
		super();
		this.kb = kb;
		this.moni = moni;
		this.mou = mou;
	}
	
	//4.키보드, 모니터, 마우스 정보를 출력하는 computerInfo() 메서드를 생성하세요
	public void computerInfo() {
		kb.info();
		moni.info();
		mou.info();
	}

	//5.키보드, 모니터, 마우스에 대한 getter/setter도 생성하세요	
	public KeyBoard getKb() {
		return kb;
	}

	public void setKb(KeyBoard kb) {
		this.kb = kb;
	}

	public Monitor getMoni() {
		return moni;
	}

	public void setMoni(Monitor moni) {
		this.moni = moni;
	}

	public Mouse getMou() {
		return mou;
	}

	public void setMou(Mouse mou) {
		this.mou = mou;
	}
	
	
	
	//6.메인메서드에서 getter로 접근하여 모니터에 대한 정보를 확인하세요
	
	
	
	
}
