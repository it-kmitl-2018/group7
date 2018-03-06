package th.ac.kmitl.it.soa.group7;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaxInvoiceApplicationTests {
	//Test e-Tax Invoice Application
	@Autowired
	private HelloController helloController;
	@Test
	public void testBodyLetterShowWithinIndex() {
		String body = this.helloController.core();
		assert(body).equals("e-Tax Invoice Project");
	}
}