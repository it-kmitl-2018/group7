package th.ac.kmitl.it.soa.group7;

import org.junit.Assert;
import org.junit.Test;

import th.ac.kmitl.it.soa.group7.definitions.DocumentType;

public class DocumentTypeTests {
	@Test
	public void DocumentTypeOutputMatchTest() {
		assertEquals(DocumentType.DEBIT_NOTE.getDocumentCode(), "80");

	}
}
