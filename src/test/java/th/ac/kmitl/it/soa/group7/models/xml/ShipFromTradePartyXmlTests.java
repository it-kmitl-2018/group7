package th.ac.kmitl.it.soa.group7.models.xml;

import org.junit.Assert;
import org.junit.Test;

public class ShipFromTradePartyXmlTests {
	private String id = "123456789012300000";
	private String globalId = "ABCDEFGHIJKLMNOPQRST123456789012345";
	private String name = "บริษัทเครียดเลยจะเอฟแล้ว";

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
