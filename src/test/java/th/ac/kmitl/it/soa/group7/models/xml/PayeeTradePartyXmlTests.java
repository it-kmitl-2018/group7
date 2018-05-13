package th.ac.kmitl.it.soa.group7.models.xml;

import org.junit.Assert;
import org.junit.Test;

public class PayeeTradePartyXmlTests {
	private String id;
	private String globalId;
	private String name;

	@Test
	public void shouldCorrectXML() {
		PayeeTradePartyXml payeeTradeParty = PayeeTradePartyXml.builder()
				.id(id)
				.globalId(globalId)
				.name(name)
				.build();

		Assert.assertEquals(this.id, payeeTradeParty.id);
		Assert.assertEquals(this.globalId, payeeTradeParty.globalId);
		Assert.assertEquals(this.name, payeeTradeParty.name);
	}

}
