package th.ac.kmitl.it.soa.group7.xml;

import org.junit.Assert;
import org.junit.Test;
import th.ac.kmitl.it.soa.group7.models.xml.SellerTradePartyXML;

public class SellerTradePartyTests {
	private String id;
	private String globalId;
	private String name;

	@Test
	public void shouldGetCorrectXML() {
		SellerTradePartyXML sellerTradeParty = SellerTradePartyXML.builder().id(id).globalId(globalId).name(name)
				.build();

		Assert.assertEquals(this.id, sellerTradeParty.id);
		Assert.assertEquals(this.globalId, sellerTradeParty.globalId);
		Assert.assertEquals(this.name, sellerTradeParty.name);
	}
}