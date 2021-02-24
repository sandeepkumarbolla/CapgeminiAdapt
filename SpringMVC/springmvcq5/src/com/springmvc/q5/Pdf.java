package com.springmvc.q5;
/*<dependency>
<groupId>com.lowagie</groupId>
<artifactId>itext</artifactId>
<version>2.1.7</version>
</dependency>*/

import java.util.List;
import java.util.Map;

import javax.swing.text.Document;

import org.springframework.web.servlet.view.document.AbstractPdfView;

public class Pdf extends AbstractPdfView {

	@Override
    protected void buildPdfDocument(Map model, Document document,
        PdfWriter writer, HttpServletRequest request,
        HttpServletResponse response) throws Exception {
		
		@SuppressWarnings("unchecked")
		response.setHeader("Content-Disposition", "attachment", "filename=\"employee.pdf\"");


        List<EmployeeDtails> list= (List<EmployeeDtails>)model.get("list");
		
        Table table = new Table(5);
        table.addCell("e_id");
        table.addCell("e_name");
        table.addCell("e_department");
        table.addCell("e_designation");
        table.addCell("e_salary");
        
        for (EmployeeDtails e: list) {
            table.addCell(e.getEid());
            table.addCell(e.getEname());
            table.addCell(e.getEdepartment());
            table.addCell(e.getEdesignation());
            table.addCell(e.getEsalary());
                }

        document.add(table);
    }
}
