package com.springmvc.q5;

/*<dependency>
<groupId>org.apache.poi</groupId>
<artifactId>poi</artifactId>
<version>3.16</version>
</dependency>
*/
import com.example.Course;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.springframework.web.servlet.view.document.AbstractXlsView;
import org.apache.poi.ss.usermodel.Workbook;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.DateFormat;
import java.util.List;
import java.util.Map;


public class exel extends AbstractExcelView{
}
	
	@Override
	protected void buildExcelDocument(Map<String, Object> arg0, HSSFWorkbook arg1, HttpServletRequest arg2,
			HttpServletResponse arg3) throws Exception {
	
		@SuppressWarnings("unchecked")
		arg3.setHeader("Content-Disposition", "attachment", "filename=\"employee.xls\"");

		@SuppressWarnings("unchecked")
		List<EmployeeDtails> list= (List<EmployeeDtails>)model.get("list");
		
Sheet sheet=workbook.createSheet("EmployeeDtails List");
		
		Row header = sheet.createRow(0);
		header.createCell(0).setCellValue("e_id");
		header.createCell(1).setCellValue("e_name");
		header.createCell(2).setCellValue("e_department");
		header.createCell(3).setCellValue("e_designation");
		header.createCell(4).setCellValue("e_salary");
		
		int rowNum=1;
		for(EmployeeDtails e:list) {
			Row row=sheet.createRow(rowNum++);
			row.createCell(0).setCellValue(e.getEid());
			row.createCell(1).setCellValue(e.getEname());
			row.createCell(2).setCellValue(e.getEdepartment());
			row.createCell(3).setCellValue(e.getEdesignation());
			row.createCell(4).setCellValue(e.getEsalary());
		
	}

	}
}
