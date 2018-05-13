package th.ac.kmitl.it.soa.group7.xml;

import org.junit.Assert;
import org.junit.Test;

import th.ac.kmitl.it.soa.group7.models.xml.SpecifiedTaxRegistrationXML;

public class SpecifiedTaxRegistrationTests {
	private String id = "XML-001";

	@Test
	public void shouldGetCorrectId() {
		SpecifiedTaxRegistrationXML specifiedTaxRegistration = SpecifiedTaxRegistrationXML.builder().id(id).build();
		Assert.assertEquals(this.id, specifiedTaxRegistration.id);
	}
}
