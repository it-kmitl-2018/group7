package th.ac.kmitl.it.soa.group7.models.xml;

import org.junit.Assert;
import org.junit.Test;

public class ShipFromTradePartyXmlTests {
	private String id;
	private String globalId;
	private String name;

	@Test
	public void shouldGetCorrectXml() {
		ShipFromTradePartyXml shipFromTradeParty = ShipFromTradePartyXml.builder()
				.id(id)
				.globalId(globalId)
				.name(name)
				.build();

		Assert.assertEquals(this.id, shipFromTradeParty.id);
		Assert.assertEquals(this.globalId, shipFromTradeParty.globalId);
		Assert.assertEquals(this.name, shipFromTradeParty.name);
	}
}
