package day16.api.io.buffered;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SpeedReaderEx {

	public static void main(String[] args) {
		
		/*
		 * InputStreamReader
		 * 1byte 데이터 -> 2byte 기반으로 변경
		 */
		
//		Reader rd = new InputStreamReader(System.in);
//		BufferedReader bw = new BufferedReader(rd);

		try {
			// Scanner와 같은 기능이지만, 처리 속도가 빠름
			BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.print(">");
			String name = bw.readLine();
			
			System.out.println(name);
			
			bw.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}
}
