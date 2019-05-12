package th.ac.kmitl.it.soa.group7.models.xml;

import org.junit.Assert;
import org.junit.Test;

public class TelphoneUniversalXmlTests {
	private String phoneNumber;

	@Test
	public void shouldGetCorrectXml() {
		TelephoneUniversalXml telephoneUniversal = TelephoneUniversalXml.builder()
				.phoneNumber(phoneNumber)
				.build();

		Assert.assertEquals(telephoneUniversal.phoneNumber, this.phoneNumber);
	}
}
