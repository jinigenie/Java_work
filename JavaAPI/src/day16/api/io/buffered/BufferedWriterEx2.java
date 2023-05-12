package day16.api.io.buffered;

import java.io.*;
import java.util.Scanner;


public class BufferedWriterEx2 {
	public static void main(String[] args) {
		
		/*
		 * flush() - 중간 중간 파일을 즉시 쓰고 싶은 경우 flush()를 사용
		 * BufferedWriter가 끝나면 자동으로 flush()가 나가게 되어있음
		 */
		
		Scanner scan = new Scanner(System.in);
		
		String path = "C:\\Users\\user\\Desktop\\course\\java\\file\\test2.txt";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			
			System.out.print(">");
			String word1 = scan.next();
			bw.write(word1);
			bw.flush(); // 버퍼에 있는 내용을 내보내기
			
			System.out.print(">");
			String word2 = scan.next();
			bw.write(word2);
			bw.flush(); // 버퍼에 있는 내용을 내보내기
			
			System.out.println("파일 출력 완료");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
