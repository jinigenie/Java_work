package quiz20;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class FileQuiz01 {
	public static void main(String[] args) {

		/*
		 * 1. 스캐너를 통해서 파일명을 입력 받음
		 * 2. 입력받은 파일을 filecopy로 복사해서 옮겨주기
		 * 
		 */

		Scanner scan = new Scanner(System.in);

		System.out.print("복사할 파일명 >> ");
		String name = scan.next();

		String readPath = "C:\\Users\\user\\Desktop\\course\\java\\file\\" + name +".png";
		String writePath = "C:\\Users\\user\\Desktop\\course\\java\\filecopy\\copy_"+ name +".png";

		try(InputStream is = new FileInputStream(readPath);
				OutputStream out = new FileOutputStream(writePath);){

			byte[] arr = new byte[2048];
			int res;
			while((res = is.read(arr)) != -1) {

				out.write(arr, 0, res); 
			}

		} catch(Exception e) {
			e.printStackTrace();
		}


	}
}
