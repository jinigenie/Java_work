package day08.encap.good;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		MyDate me = new MyDate();

		System.out.print("년 > ");
		me.setYear(scan.nextInt());
		System.out.print("월 > ");
		me.setMonth(scan.nextInt());
		System.out.print("일 > ");
		me.setDay(scan.nextInt());
		System.out.print("주민번호 > ");
		me.setSsn(scan.next());
		
		int y = me.getYear();
		int m = me.getMonth();
		int d = me.getDay();
		String s = me.getSsn();
		
		System.out.println("생일: " + y + "년 " + m + "월 " + d + "일");
		System.out.println("주민번호: " + s);
	}		
}
