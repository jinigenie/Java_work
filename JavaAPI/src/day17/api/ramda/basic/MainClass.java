package day17.api.ramda.basic;

public class MainClass {
	public static void main(String[] args) {
	
		/*
		// car의 run을 사용할 때마다 매번 다른 기능으로 사용할 경우 익명 클래스를 사용할 수 있음
		Car car = new Car() {

			@Override
			public void run() {
				System.out.println("익명 객체로 생성된 car");
			}
			
		};
		car.run();
		
		Car car2 = new Car() {

			@Override
			public void run() {
				System.out.println("다른 내용의 익명 객체로 car 생성");
			}
			
		};
		*/
		
		//익명객체 표현 문법 => 람다 표현식으로 사용 가능
		Person p = new Person();
//		p.greeting(new Say01() {
//			
//			@Override
//			public void hello() {
//
//				System.out.println("헬로우 기능!");
//			}
//		});
//		
		// Say01이 갖고있는 hello()를 전달하는 모형
//		p.greeting(() -> { System.out.println("헬로우 기능!"); });
		// 1문법 - 사용할 문장이 한 줄 이라면 {} 생략가능
		p.greeting(() -> System.out.println("헬로우 기능!") );

//		p.greeting(new Say02() {
//
//			@Override
//			public String hello(String a, int b) {
//				return a+b;
//			}
//			
//		});
	
		//2문법
//		p.greeting((a, b) -> {
//			return a + b;
//		});
//		
		p.greeting((a, b) -> a + b);
		
		p.greeting(new Say03() {
			
			public boolean bye(int a) {
				if(a % 2 == 0) return true;
				else return false;
			}
			
		});
		
		p.greeting((a) -> {
			if(a % 2 == 0) return true;
			else return false;
		});
		
		
	}
}
