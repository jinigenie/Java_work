package day14.api.io.output;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Arrays;

public class InputStreamEx {

	public static void main(String[] args) {
		
		/*
		 * 파일을 읽을 때 사용하는 클래스는 FileInputStream
		 * 생성자 매개변수에 읽을 파일의 경로가 들어감
		 * 
		 */
		
		String path = "C:\\Users\\user\\Desktop\\course\\java\\file\\example.txt";
			
		try {
			InputStream is = new FileInputStream(path);
			
			// 1st
			/* read()는 하나씩 데이터를 읽고, 더 읽을 값이 없으면 -1 반환
			while(true) {
				int res = is.read();
				if(res == -1) break;
				System.out.println((char)res);
			}
			*/

			// 2nd
			byte[] arr = new byte[100];
			int res = is.read(arr); // 읽어들인 크기 반환
			System.out.println(res);
			
			int i = 0;
			while(true) {

				if(arr[i] == 0) break;
				System.out.println((char)arr[i]);
				i++;
			}
			
			int res2 = is.read(arr); // 더 읽을 값이 없으면 -1 반환
			System.out.println(res2);
			
			is.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
