package th.ac.kmitl.it.soa.group7.xml;

import org.junit.Assert;
import org.junit.Test;

import th.ac.kmitl.it.soa.group7.models.xml.SpecifiedLineTradeDeliveryXML;

public class SpecifiedLineTradeDeliveryXMLTests {
	public String billedQuantity = "BX";
	public String perPackageUnitQuantity = "5";

	@Test
	public void shouldGetCorrectXML() {
		SpecifiedLineTradeDeliveryXML specifiedLineTradeDelivery = SpecifiedLineTradeDeliveryXML.builder()
				.billedQuantity(billedQuantity).perPackageUnitQuantity(perPackageUnitQuantity).build();

		Assert.assertEquals(specifiedLineTradeDelivery.billedQuantity, this.billedQuantity);
		Assert.assertEquals(specifiedLineTradeDelivery.perPackageUnitQuantity, this.perPackageUnitQuantity);
	}
}
