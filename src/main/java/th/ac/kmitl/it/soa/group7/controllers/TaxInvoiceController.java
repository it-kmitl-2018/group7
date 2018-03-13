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
	//TODO Mapping Controller of XML, JSON Converter
	private TaxInvoiceModel taxInvoiceModel = new TaxInvoiceModel(); // ให้ Model คอยรับค่า
	private JsonConverter JsonConverter = new JsonConverter();

	@RequestMapping("/")
	public String index() {// หน้าแรก return เป็น taxinvoice.html ให้
		return "taxinvoice.html";
	}

	@RequestMapping(value = "/submitForm", method = {RequestMethod.GET, RequestMethod.POST}) // ถ้าใช้ ResponseBody จะแสดง param
	// Get parameter
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

	@RequestMapping(value = "/generateJSON")
	public String generateXML(){
		String jsonData;
		jsonData = JsonConverter.toJson(taxInvoiceModel.getData());
		return "jsonview.jsp";
	}

	@RequestMapping(value = "/generateXML")
	public String generateXML(){
		String xmlData;
		xmlData = XmlConverter.toJson(taxInvoiceModel.getData());
		return "xmlview.jsp";
	}

}
