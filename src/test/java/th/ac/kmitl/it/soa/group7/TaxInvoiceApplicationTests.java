package th.ac.kmitl.it.soa.group7;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertThat;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.ui.ModelMap;

import th.ac.kmitl.it.soa.group7.controllers.TaxInvoiceController;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaxInvoiceApplicationTests {
	// Test e-Tax Invoice Application
	TaxInvoiceController taxInvoiceController = new TaxInvoiceController();

	@Test
	public void inputParameterWillGetValidParameter() {
		// True
		Map map = new HashMap();
		map.put("username", "user1");
		ModelMap model = new ModelMap();
		model.addAllAttributes(map);
		taxInvoiceController.create(map, model);
		assertThat(model.get("username")).isEqualTo("user1");
	}

	@Test
	public void inputParameterWillGetInvalidParameter() {
		// False
		Map map = new HashMap();
		map.put("username", "user555");
		ModelMap model = new ModelMap();
		taxInvoiceController.create(map, model);
		assertThat(model.get("username")).isNotEqualTo("user1");
	}
}