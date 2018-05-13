package th.ac.kmitl.it.soa.group7.models.xml;

import org.junit.Assert;
import org.junit.Test;

public class InvoicerTradePartyXmlTests {
	private String id;
	private String globalId;
	private String name;

	@Test
	public void shouldCorrectXML() {
		InvoicerTradePartyXml invoicerTradeParty = InvoicerTradePartyXml.builder()
				.id(id)
				.globalId(globalId)
				.name(name)
				.build();

		Assert.assertEquals(this.id, invoicerTradeParty.id);
		Assert.assertEquals(this.globalId, invoicerTradeParty.globalId);
		Assert.assertEquals(this.name, invoicerTradeParty.name);
	}
}
