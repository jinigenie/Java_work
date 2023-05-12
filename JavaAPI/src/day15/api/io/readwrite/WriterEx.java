package day15.api.io.readwrite;

import java.io.FileWriter;
import java.io.Writer;

public class WriterEx {
	public static void main(String[] args) {
		
		/*
		 * 문자를 써서 저장할 때 -> 2byte 기반 FileWriter() 클래스를 사용
		 */

		String path = "C:\\Users\\user\\Desktop\\course\\java\\file\\text.txt";

		try (Writer fw = new FileWriter(path)) {
			
			// \r : 캐리지리턴(커서 맨 앞으로 당기기)
			String str = "그만 좀 자세요.\n\r그만 일어나자!\n\r집에 가야지";
			fw.write(str);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
}
