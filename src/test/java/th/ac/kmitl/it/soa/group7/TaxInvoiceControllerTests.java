package th.ac.kmitl.it.soa.group7;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.CoreMatchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import th.ac.kmitl.it.soa.group7.controllers.TaxInvoiceController;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class TaxInvoiceControllerTests {
	@Autowired
	private TaxInvoiceController taxInvoiceController;

	@Test
	public void contexLoads() throws Exception {
		assertThat(taxInvoiceController).isNotNull();
	}

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void shouldHaveTaxInvoicePage() throws Exception {
		this.mockMvc.perform(get("/")).andDo(print()).andExpect(status().isOk())
				.andExpect(content().string(containsString("Tax invoice")));
	}

	@Test
	public void shouldHaveTaxInvoiceConfirmPage() throws Exception {
		this.mockMvc.perform(get("/confirm")).andDo(print()).andExpect(status().isOk())
				.andExpect(content().string(containsString("Tax invoice")));
	}

	@Test
	public void shouldGotoGenerateappliedTradeAllowanceChargeXML() throws Exception {
		this.mockMvc.perform(get("/generate/appliedTradeAllowanceChargeXML")).andExpect(status().isOk());
	}
}