package day15.api.io.file;

import java.io.File;

public class CreateFileEx {
	public static void main(String[] args) {
		
		/*
		 * File 클래스
		 * 외부 경로에 폴더 or 단순 파일 생성이나 삭제 가능
		 */

		String path = "C:\\Users\\user\\Desktop\\course\\java\\file\\20230504";
		
		try {

			File file = new File(path);
				
			// 생성
			if(!file.exists()) { // 존재하면 true, 존재하지 않으면 false
				file.mkdir(); // makedirectory
				System.out.println("폴더 생성 완료");
			} else {
				System.out.println("이미 폴더가 존재합니다.");
			}
			
			// 삭제
			if(file.exists()) {
				file.delete();
				System.out.println("폴더 삭제 완료");	
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
	}
}
