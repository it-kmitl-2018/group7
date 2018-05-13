package th.ac.kmitl.it.soa.group7.xml;

import org.junit.Assert;
import org.junit.Test;

import th.ac.kmitl.it.soa.group7.models.xml.DefinedTradeContactXML;

public class DefinedTradeContactTXMLTests {
	private String personName = "Beedle";
	private String departmentName = "001";

	@Test
	public void shouldGetCorrectXml() {
		DefinedTradeContactXML definedTradeContact = DefinedTradeContactXML.builder().personName(personName)
				.departmentName(departmentName).build();

		Assert.assertEquals(definedTradeContact.personName, this.personName);
		Assert.assertEquals(definedTradeContact.departmentName, this.departmentName);
	}
}