package th.ac.kmitl.it.soa.group7.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

	@PostMapping(path = "/confirm") // GetParameter and set to HeaderContext
	public String create(@RequestParam Map<String, String> allRequestParam, Model model) {
		model.addAllAttributes(allRequestParam);
		return "confirm";
	}

}
