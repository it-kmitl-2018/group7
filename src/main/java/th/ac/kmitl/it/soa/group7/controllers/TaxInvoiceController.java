package th.ac.kmitl.it.soa.group7.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import th.ac.kmitl.it.soa.group7.models.HeaderContext;
import th.ac.kmitl.it.soa.group7.models.TaxInvoiceModel;

@Controller
public class TaxInvoiceController {

	@GetMapping("/")
	public String index() {
		return "taxinvoice";
	}

	@PostMapping(path = "/confirm") // GetParameter and set to HeaderContext
	public String getModel(@RequestParam String manualId, @RequestParam String documentId,
			@RequestParam String documentName, @RequestParam String documentTypeCode,
			@RequestParam String issueDateTime, @RequestParam String purpose, @RequestParam String purposeCode,
			@RequestParam String globalId, @RequestParam String creationDateTime, ModelMap modelMap) {
		TaxInvoiceModel taxInvoiceModel = new TaxInvoiceModel();
		HeaderContext headerContext = new HeaderContext();
		// Set parameter to HeaderContext
		headerContext.setManualId(manualId);
		headerContext.setDocumentId(documentId);
		headerContext.setDocumentName(documentName);
		headerContext.setDocumentTypeCode(documentTypeCode);
		headerContext.setIssueDateTime(issueDateTime);
		headerContext.setPurpose(purpose);
		headerContext.setPurposeCode(purposeCode);
		headerContext.setGlobalId(globalId);
		headerContext.setCreationDateTime(creationDateTime);
		// End here
		taxInvoiceModel.setHeaderContext(headerContext);
		modelMap.addAttribute(taxInvoiceModel);
		modelMap.addAttribute("taxModel", headerContext);
		return "confirm";
	}

}
