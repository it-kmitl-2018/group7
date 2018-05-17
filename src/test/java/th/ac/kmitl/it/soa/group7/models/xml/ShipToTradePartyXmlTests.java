package th.ac.kmitl.it.soa.group7.models.xml;

import org.junit.Assert;
import org.junit.Test;

public class ShipToTradePartyXmlTests {
	private String id = "123456789012300000";
	private String globalId = "ABCDEFGHIJKLMNOPQRST123456789012345";
	private String name = "บริษัทเศร้าจังจะเอฟแล้ว";

	@Test
	public void shouldGetCorrectXml() {
		ShipToTradePartyXml shipToTradeParty = ShipToTradePartyXml.builder()
				.id(id)
				.globalId(globalId)
				.name(name)
				.build();

		Assert.assertEquals(this.id, shipToTradeParty.id);
		Assert.assertEquals(this.globalId, shipToTradeParty.globalId);
		Assert.assertEquals(this.name, shipToTradeParty.name);
	}
}
