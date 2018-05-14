package th.ac.kmitl.it.soa.group7.models.xml;

import org.junit.Assert;
import org.junit.Test;

public class PayeeTradePartyXmlTests {
	private String id = "123456789";
	private String globalId = "11123410000";
	private String name = "บริษัทไม่อยากเอฟ จำกัด";

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
