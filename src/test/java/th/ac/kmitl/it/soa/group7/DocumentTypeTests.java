package th.ac.kmitl.it.soa.group7;

import org.junit.Assert;
import org.junit.Test;

import th.ac.kmitl.it.soa.group7.definitions.DocumentType;

public class DocumentTypeTests {
	@Test
	public void DocumentTypeOutputMatchTest() {
		Assert.assertEquals(DocumentType.DEBIT_NOTE.getDocumentCode(), "80");
		Assert.assertEquals(DocumentType.DEBIT_NOTE.getDocumentName(), "ใบเพิ่มหนี้ (Debit note)");
		Assert.assertEquals(DocumentType.CREDIT_NOTE.getDocumentCode(), "81");
		Assert.assertEquals(DocumentType.CREDIT_NOTE.getDocumentName(), "ใบลดหนี้ (Credit note)");
		Assert.assertEquals(DocumentType.INVOICE.getDocumentCode(), "380");
		Assert.assertEquals(DocumentType.INVOICE.getDocumentName(), "ใบแจ้งหนี้ (Invoice)");
	}
}
