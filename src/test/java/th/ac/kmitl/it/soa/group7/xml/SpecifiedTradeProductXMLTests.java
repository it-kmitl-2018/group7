package th.ac.kmitl.it.soa.group7.xml;

import org.junit.Assert;
import org.junit.Test;

import th.ac.kmitl.it.soa.group7.models.xml.SpecifiedTradeProductXML;

public class SpecifiedTradeProductXMLTests {
	private String id = "01152";
	private String globalId = "016";
	private String name = "CCNA625";
	private String description = "CCNA Manual";

	@Test
	public void shouldGetCorrectXML() {
		SpecifiedTradeProductXML specifiedTradeProduct = SpecifiedTradeProductXML.builder().id(id).globalId(globalId)
				.name(name).description(description).build();

		Assert.assertEquals(specifiedTradeProduct.id, this.id);
		Assert.assertEquals(specifiedTradeProduct.globalId, this.globalId);
		Assert.assertEquals(specifiedTradeProduct.name, this.name);
		Assert.assertEquals(specifiedTradeProduct.description, this.description);
	}
}
