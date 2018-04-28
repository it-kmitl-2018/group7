package th.ac.kmitl.it.soa.group7.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // ใช้ Controller เพื่อส่ง HTML กลับมา
public class TaxInvoiceController {
	//TODO Mapping Controller of XML, JSON Converter
	@RequestMapping("/")
	public String index() {// หน้าแรก return เป็น taxinvoice.html ให้
		return "taxinvoice.html";
	}
}
