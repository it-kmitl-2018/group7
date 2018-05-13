package th.ac.kmitl.it.soa.group7.xml;

import org.junit.Assert;

import th.ac.kmitl.it.soa.group7.definitions.DocumentType;
import th.ac.kmitl.it.soa.group7.models.xml.ApplicableTradeTaxXML;

public class ApplicableTradeTaxXMLTests {
	private String basisAmount = "500";
	private DocumentType documentType = DocumentType.TAX_INVOICE;
	private String calculatedRate = "7%";
	private String calculatedAmount = "535";

	public void shouldGetCorrectXML() {
		ApplicableTradeTaxXML applicableTradeTaxXML = ApplicableTradeTaxXML.builder().documentType(documentType)
				.basisAmount(basisAmount).calculatedAmount(calculatedAmount).calculatedRate(calculatedRate).build();

		Assert.assertEquals(applicableTradeTaxXML.documentType, this.documentType);
		Assert.assertEquals(applicableTradeTaxXML.basisAmount, this.basisAmount);
		Assert.assertEquals(applicableTradeTaxXML.calculatedRate, this.calculatedRate);
		Assert.assertEquals(applicableTradeTaxXML.calculatedAmount, this.calculatedAmount);

	}
}
