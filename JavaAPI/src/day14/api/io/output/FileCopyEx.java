package day14.api.io.output;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopyEx {

	public static void main(String[] args) {
		/*
		 * FileInputStream, FileOutputStream은
		 * 동영상, 이미지 파일을 읽거나 쓸 때 사용
		 */

		String readPath = "C:\\Users\\user\\Desktop\\course\\java\\file\\메서드1.mp4";
		String writePath = "C:\\Users\\user\\Desktop\\course\\java\\filecopy\\메서드1_copy.mp4";

		
		try (InputStream is = new FileInputStream(readPath);
			OutputStream out = new FileOutputStream(writePath);) {
			
			// 읽음
			byte[] arr = new byte[2048]; // 2kb

			int res;
			while((res = is.read(arr)) != -1) {
				
				out.write(arr, 0, res); // arr 데이터를 0~바이트 배열의 res까지만 씀
			}

		} catch(Exception e){
			e.printStackTrace();
		}
		/*
		finally {
			
			try {
				is.close();
				out.close();
			} catch (Exception e2) {
				System.out.println("파일 close 에러");
			}
		}
		*/
	}
}
