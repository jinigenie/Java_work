package day14.api.io.output;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class OutputStreamEx {
	public static void main(String[] args) {
		
		/*
		 * 파일을 쓸 때 사용하는 클래스는 FileOutputStream
		 * 생성자 매개값으로 파일을 쓸 경로가 들어감 -> new FileOutputStream("경로")
		 * io패키지의 대부분 클래스들은 생성자에 throws가 있어, 반드시 예외처리 문장 안에서 사용
		 * 
		 */
		
		String path = "C:\\Users\\user\\Desktop\\course\\java\\file\\example.txt";
		
//		FileOutputStream out = new FileOutputStream(path);
		
		
	
		try {
			
			OutputStream out = new FileOutputStream(path);
			
			//1st
//			out.write(65); // 한 글자씩 write
			
			//2nd
//			byte[] arr = {65, 66, 67, 68, 69}; // 배열 값 write
//			out.write(arr);
			
			//3rd
//			String str = "한글~"; // 한글은 X
			String str = "ABCDEFG";
			byte[] arr = str.getBytes(); // 문자열을 바이트 배열로 변환
			
			out.write(arr);
			
			out.close();
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
	}
}
