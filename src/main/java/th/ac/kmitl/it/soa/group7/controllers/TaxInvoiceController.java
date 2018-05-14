package th.ac.kmitl.it.soa.group7.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import th.ac.kmitl.it.soa.group7.models.xml.SpecifiedTradeProductXML;

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

	@PostMapping(path = "/generate")
	@ResponseBody
	public String generateXML(@RequestParam Map<String, String> allRequestParam, ModelMap model) {
		return "This is where xml showed";
	}

	@GetMapping(path = "/generate/specifiedTradeProductXML")
	@ResponseBody
	public String specifiedTradeProductXML(@RequestParam Map<String, String> allRequestParam, ModelMap model) {
		SpecifiedTradeProductXML specifiedTradeProduct = SpecifiedTradeProductXML.builder()
				.id(allRequestParam.get("id")).globalId(allRequestParam.get("globalId"))
				.name(allRequestParam.get("name")).description(allRequestParam.get("description")).build();
		System.out.println(specifiedTradeProduct.toString());
		return specifiedTradeProduct.toString();
	}
}