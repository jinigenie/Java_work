package day16.api.io.buffered;

import java.io.*;

public class BufferedReaderEx {
	public static void main(String[] args) {
		
		/*
		 * BufferedReader는 입력에 대한 성능 향상 보조 스트림
		 * Reader 클래스와 같이 사용
		 */
	
		String path = "C:\\Users\\user\\Desktop\\course\\java\\file\\test.txt";

		try(BufferedReader br = new BufferedReader(new FileReader(path))) {
			
//			String res = br.readLine();
//			System.out.println(res);

			String res;
			while((res = br.readLine()) != null) {
				System.out.println(res);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
