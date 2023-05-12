package day16.api.io.buffered;

import java.io.*;

public class BufferedWriterEx {
	public static void main(String[] args) {
		
		/*
		 * Buffered가 붙으면 입출력을 빠르게 하는 성능향상 스트림(보조)
		 * 
		 * 보조스트림이라 부르고, Reader, Writer, InputStream, OutputStream과 같이 사용
		 */
		
		String path = "C:\\Users\\user\\Desktop\\course\\java\\file\\test.txt";
		
//		Writer fw = new FileWriter(path);
//		BufferedWriter bw = new BufferedWriter(fw);
		
		
		// Writer 객체에 두 번째 매개변수로 true 주면, 기존 파일에 추가
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
			
			String str = "오늘은 날씨가 맑습니다.\n내일은 쉽니다.\n";
			bw.write(str);
			System.out.println("파일 쓰기 완료");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
