package th.ac.kmitl.it.soa.group7.models.debitcreditnote.xml;

import org.junit.Assert;
import org.junit.Test;

public class SellerTradePartyXmlTests {
	private String id;
	private String globalId;
	private String name;

	@Test
	public void shouldGetCorrectXML() {
		SellerTradePartyXml sellerTradeParty = SellerTradePartyXml.builder().id(id).globalId(globalId).name(name)
				.build();

		Assert.assertEquals(this.id, sellerTradeParty.id);
		Assert.assertEquals(this.globalId, sellerTradeParty.globalId);
		Assert.assertEquals(this.name, sellerTradeParty.name);
	}
}
