package day08.encap.good;

public class MyDate {
	
	private int year;
	private int month;
	private int day;
	private String ssn; //주민번호
	
	/* setter 정의
	 * 1. 값 저장하는 용도의 메소드
	 * 2. 접근제어자 public으로 선언, 이름은 set+멤버변수명
	 */
	public void setYear(int year) {
		if(year < 1900 || year > 2023) {
			System.out.println("잘못된 값 입력");
			return;
		} else this.year = year;
	}
	
	/* getter 정의
	 * 1. 은닉 변수의 값을 조회하는 메소드
	 * 2. 접근제어자 public으로 선언, 반환 유형 있어야 함, 이름은 get+멤버변수명
	 */
	public int getYear() {
		return this.year;
	}
	
	public void setMonth(int month) {
		if(month < 1 || month > 12) {
			System.out.println("잘못된 값 입력");
			return;
		} else this.month = month;
	}
	public int getMonth() {
		return this.month;
	}
	
	public void setDay(int day) {
		if(day < 1 || day > 31) {
			System.out.println("잘못된 값 입력");
			return;
		} else this.day = day;
	}
	public int getDay() {
		return this.day;
	}
	
	public void setSsn(String ssn) {
		String s = ssn.replace("-", "");
		if(s.length() != 13) {
			System.out.println("잘못된 값 입력");
			return;
		} else this.ssn = ssn;
	}
	public String getSsn() {
		return this.ssn;
	}
}
