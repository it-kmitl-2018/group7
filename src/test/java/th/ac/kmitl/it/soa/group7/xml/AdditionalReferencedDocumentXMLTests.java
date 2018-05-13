package th.ac.kmitl.it.soa.group7.xml;

import java.sql.Timestamp;
import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

import th.ac.kmitl.it.soa.group7.definitions.DocumentType;
import th.ac.kmitl.it.soa.group7.models.xml.AdditionalReferencedDocumentXML;

public class AdditionalReferencedDocumentXMLTests {
	private String issuerAssignedID = "0100";
	private DocumentType referenceTypeCode = DocumentType.TAX_INVOICE;
	private Date date = new Date();
	private Timestamp issueDateTime = new Timestamp(date.getTime());

	@Test
	public void shouldGetCorrectXML() {
		AdditionalReferencedDocumentXML additionalReferencedDocument = AdditionalReferencedDocumentXML.builder()
				.issuerAssignedID(issuerAssignedID).referenceTypeCode(referenceTypeCode).issueDateTime(issueDateTime)
				.build();
		Assert.assertEquals(additionalReferencedDocument.issuerAssignedID, this.issuerAssignedID);
		Assert.assertEquals(additionalReferencedDocument.referenceTypeCode, this.referenceTypeCode);
		Assert.assertEquals(additionalReferencedDocument.issueDateTime, this.issueDateTime);
	}
}