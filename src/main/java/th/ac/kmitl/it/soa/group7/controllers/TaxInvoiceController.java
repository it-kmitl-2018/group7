package th.ac.kmitl.it.soa.group7.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import th.ac.kmitl.it.soa.group7.models.xml.SpecifiedLineTradeDeliveryXML;

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

	@GetMapping(path = "/generate/specifiedLineTradeDeliveryXML")
	@ResponseBody
	public String specifiedLineTradeDeliveryXML(@RequestParam Map<String, String> allRequestParam, ModelMap model) {
		SpecifiedLineTradeDeliveryXML specifiedLineTradeDelivery = SpecifiedLineTradeDeliveryXML.builder()
				.billedQuantity(allRequestParam.get("billedQuantity"))
				.perPackageUnitQuantity(allRequestParam.get("perPackageUnitQuantity")).build();
		return specifiedLineTradeDelivery.toString();
	}
}