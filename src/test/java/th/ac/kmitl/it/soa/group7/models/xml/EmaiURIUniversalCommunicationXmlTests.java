package th.ac.kmitl.it.soa.group7.models.xml;

import org.junit.Assert;
import org.junit.Test;

public class EmaiURIUniversalCommunicationXmlTests {
	private String uriId;

	@Test
	public void shouldGetCorrectXml() {
		EmailURIUniversalCommunicationXml emaiURIUniversalCommunication = EmailURIUniversalCommunicationXml.builder()
				.uriId(uriId)
				.build();

		Assert.assertEquals(emaiURIUniversalCommunication.uriId, this.uriId);
	}
}
