package th.ac.kmitl.it.soa.group7.debitcreditnote.xml;

import org.junit.Assert;
import org.junit.Test;

import th.ac.kmitl.it.soa.group7.models.debitcreditnote.xml.DefinedTradeContactXml;

public class DefinedTradeContactXmlTests {
	private String personName = "Smart";
	private String departmentName = "001";

	@Test
	public void shouldGetCorrectXml() {
		DefinedTradeContactXml definedTradeContact = DefinedTradeContactXml.builder().personName(personName)
				.departmentName(departmentName).build();

		Assert.assertEquals(definedTradeContact.personName, this.personName);
		Assert.assertEquals(definedTradeContact.departmentName, this.departmentName);
	}
}
