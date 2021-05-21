package java_20210521;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelDemo {
	public static void main(String[] args) {
		//새엑셀파일 생성
		HSSFWorkbook workbook = new HSSFWorkbook();
		//새 시트생성
		HSSFSheet sheet = workbook.createSheet("파일");
		
		HSSFRow row=sheet.createRow(0);
		HSSFCell cell =row.createCell(0);
		cell.setCellValue("텍스트데이터(0,0)");
		
		cell =row.createCell(1);
		cell.setCellValue("텍스트데이터(0,1)");
		
		cell =row.createCell(2);
		cell.setCellValue("텍스트데이터(0,2)");
		
		//두번쨰 행
		row=sheet.createRow(1);
		cell =row.createCell(0);
		cell.setCellValue("텍스트데이터(1,0)");
		
		cell =row.createCell(1);
		cell.setCellValue("텍스트데이터(1,1)");
		
		cell =row.createCell(2);
		cell.setCellValue("텍스트데이터(1,2)");
		
		row=sheet.createRow(2);
		cell =row.createCell(0);
		cell.setCellValue("텍스트데이터(2,0)");
		
		cell =row.createCell(1);
		cell.setCellValue("텍스트데이터(2,1)");
		
		cell =row.createCell(2);
		cell.setCellValue("텍스트데이터(2,2)");
		
		FileOutputStream fos = null;
		 
		try {
			fos = new FileOutputStream("C:\\Users\\user\\Downloads\\test.xls");
			workbook.write(fos);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
				try {
					if(fos!=null)fos.close();
					if(workbook!=null) workbook.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
	}
}
