package th.ac.kmitl.it.soa.group7.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import th.ac.kmitl.it.soa.group7.models.TaxInvoiceModel;

@Controller // ใช้ Controller เพื่อส่ง HTML กลับมา
public class TaxInvoiceController {
	private TaxInvoiceModel taxInvoiceModel = new TaxInvoiceModel(); // ให้ Model คอยรับค่า

	@RequestMapping("/")
	public String index() {// หน้าแรก return เป็น taxinvoice.html ให้
		return "taxinvoice.html";
	}

	@RequestMapping(value = "/submitForm", method = {RequestMethod.GET, RequestMethod.POST}) // ถ้าใช้ ResponseBody จะแสดง param
	// Get parameter มาจาก form และใส่เข้าไปใน Tax Model
	public String getResponse(@RequestParam("documentTypeCode") String documentTypeCode, ModelMap modelMap) {
		taxInvoiceModel.setDocumentTypeCode(documentTypeCode);
		modelMap.put("documentTypeCode", documentTypeCode);
		return "confirm.jsp";
	}

	@RequestMapping(value = "/confirmGenerate")
	@ResponseBody
	public String showDetails() {
		return taxInvoiceModel.getDocumentTypeCode() + " <<<< confirm!";
	}

}
