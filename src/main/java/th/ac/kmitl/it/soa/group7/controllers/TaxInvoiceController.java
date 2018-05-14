package th.ac.kmitl.it.soa.group7.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import th.ac.kmitl.it.soa.group7.models.xml.InformationNoteXML;

@Controller
public class TaxInvoiceController {

	@GetMapping("/")
	public String index() {
		return "taxinvoice";
	}

	@GetMapping()
	public String create() {
		return "taxinvoice";
	}

	@PostMapping(path = "/confirm")
	public String create(@RequestParam Map<String, String> allRequestParam, ModelMap model) {
		model.addAllAttributes(allRequestParam);
		return "confirm";
	}

	@GetMapping(path = "/generate/informationNoteXML")
	@ResponseBody
	public String informationNoteXML(@RequestParam Map<String, String> allRequestParam, ModelMap model) {
		InformationNoteXML informationNote = InformationNoteXML.builder().subject(allRequestParam.get("subject"))
				.content(allRequestParam.get("content")).build();
		return informationNote.toString();
	}
}