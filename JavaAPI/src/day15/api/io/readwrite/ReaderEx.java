package day15.api.io.readwrite;

import java.io.FileReader;
import java.io.Reader;

public class ReaderEx {
	public static void main(String[] args) {
		
		/*
		 * 문자 기반 파일을 읽어서 사용할 때는 FileReader 클래스 사용
		 * 2byte 기반
		 */

		String path = "C:\\Users\\user\\Desktop\\course\\java\\file\\text.txt";
		
		
		try (Reader fr = new FileReader(path)) {
			
			int res;
			while((res = fr.read()) != -1) {
				
				System.out.print((char)res);
			}
			
		} catch (Exception e) {

			e.printStackTrace();
		}
		
	}
}
