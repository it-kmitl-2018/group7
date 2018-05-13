package th.ac.kmitl.it.soa.group7;

import java.sql.Timestamp;

import org.junit.Assert;
import org.junit.Test;

import th.ac.kmitl.it.soa.group7.models.xml.IndividualTradeProductInstanceXML;

public class IndividualTradeProductInstanceXMLTests {
	private String batchId = "0065";
	private Timestamp expiryDateTime = new Timestamp(System.currentTimeMillis());

	@Test
	public void shouldGetCorrectXML() {
		IndividualTradeProductInstanceXML individualTradeProductInstance = IndividualTradeProductInstanceXML.builder()
				.batchId(batchId).expiryDateTime(expiryDateTime).build();

		Assert.assertEquals(individualTradeProductInstance.batchId, this.batchId);
		Assert.assertEquals(individualTradeProductInstance.expiryDateTime, this.expiryDateTime);
	}
}