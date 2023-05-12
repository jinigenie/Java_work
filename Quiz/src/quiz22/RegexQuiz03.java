package quiz22;

import java.io.*;
import java.util.*;
import java.util.regex.*;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.*;


public class RegexQuiz03 {
	public static void main(String[] args) {

		/* 
		 * 1. 버퍼리더를 사용해서 건담.txt를 읽어오기
		 *    readLine으로 한줄씩 읽기
		 * 2. 정규표현식 이용해서 날짜, 지점, 등급, 내용, 가격을 정규표현식으로 패턴분석 
		 * 	  Product 객체에 저장하고 리스트에 저장
		 * 3. 외부라이브러리 (POI) - 자바로 엑셀파일 xlsx 형태로 파일 사용
		 *    하나의 시트에 각 행데이터를 엑셀파일로 출력
		 */
		
		String path = "C:\\Users\\user\\Desktop\\course\\java\\work\\Quiz\\src\\quiz22\\건담.txt";
		List<Product> list = new ArrayList<>();
		
		String p1 = "\\d{8}-\\d{2}-\\d{12,13}";
		String p2 = "[건담|건담베이스]+ [가-힣]+";
		String p3 = "\\[[A-Z가-힣]+\\]";
		String p4 = "";
		String p5 = "[0-9,]+원";
		
		int rowCnt = 0;
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("건담");
		
		try(BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(path), "UTF-8"));) {
			
			String str;
			int i = 0;
			XSSFRow curRow = sheet.createRow(i);
			Cell cell = curRow.createCell(rowCnt);
			
			while((str = br.readLine()) != null) {
				
				Matcher m1 = Pattern.compile(p1).matcher(str);
				Matcher m2 = Pattern.compile(p2).matcher(str);
				Matcher m3 = Pattern.compile(p3).matcher(str);
				Matcher m5 = Pattern.compile(p5).matcher(str);
				
				if(m1.find() && m2.find() && m3.find() && m5.find()) {
					System.out.println(m1.group() + "\n" + m2.group() + "\n" + m3.group());
					p4 = str.substring(m3.end() + 1, m5.start());
					System.out.println(p4 + "\n" + m5.group());
				}
				
				System.out.println("----------------------------------------------");
				
				list.add(new Product(m1.group(),m2.group(), m3.group(), p4, m5.group()));
		
				curRow = sheet.createRow(i);
				cell = curRow.createCell(0);
				cell.setCellValue(list.get(i).getDay());
				cell = curRow.createCell(1);
				cell.setCellValue(list.get(i).getStore());
				cell = curRow.createCell(2);
				cell.setCellValue(list.get(i).getGrade());
				cell = curRow.createCell(3);
				cell.setCellValue(list.get(i).getDetail());
				cell = curRow.createCell(4);
				cell.setCellValue(list.get(i).getPrice());
				
				i++;
			}
			workbook.write(new FileOutputStream("C:\\Users\\user\\Desktop\\course\\java\\work\\Quiz\\src\\quiz22\\건담.xlsx"));
			
		} catch (Exception e) {

			e.printStackTrace();
		}
		
//		System.out.println(list.toString());
		
		
		
	}
}
