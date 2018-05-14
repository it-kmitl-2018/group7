package th.ac.kmitl.it.soa.group7.models.xml;

import org.junit.Assert;
import org.junit.Test;

public class InvoiceeTradePartyXmlTests {
	private String id;
	private String globalId;
	private String name;

	@Test
	public void shouldCorrectXML() {
		InvoiceeTradePartyXml invoiceeTradeParty = InvoiceeTradePartyXml.builder()
				.id(id)
				.globalId(globalId)
				.name(name)
				.build();

		Assert.assertEquals(this.id, invoiceeTradeParty.id);
		Assert.assertEquals(this.globalId, invoiceeTradeParty.globalId);
		Assert.assertEquals(this.name, invoiceeTradeParty.name);
	}
}
