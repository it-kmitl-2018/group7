package th.ac.kmitl.it.soa.group7;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Assert;
import org.junit.Test;

import th.ac.kmitl.it.soa.group7.definitions.UNDocumentTypeCode;


public class UNDocumentTypeCodeTests {
	@Test
	public void UNDocumentTypeCodeOutputMatchTest() {
		Assert.assertEquals(UNDocumentTypeCode.METERED_SERVICES_INVOICE.getUnDocumentCode(), "82");
		Assert.assertEquals(UNDocumentTypeCode.CREDIT_NOTE_FINANCIAL.getUnDocumentCode(), "83");
		Assert.assertEquals(UNDocumentTypeCode.DEBIT_NOTE_FINANCIAL.getUnDocumentCode(), "84");
		Assert.assertEquals(UNDocumentTypeCode.SELF_BILLED_CREDIT_NOTE.getUnDocumentCode(), "261");
		Assert.assertEquals(UNDocumentTypeCode.CONSOLIDATED_CREDIT_NOTE.getUnDocumentCode(), "262");
		Assert.assertEquals(UNDocumentTypeCode.PROFORMA_INVOICE.getUnDocumentCode(), "325");
		Assert.assertEquals(UNDocumentTypeCode.COMMERCIAL_INVOICE.getUnDocumentCode(), "380");
		Assert.assertEquals(UNDocumentTypeCode.CREDIT_NOTE.getUnDocumentCode(), "381");
		Assert.assertEquals(UNDocumentTypeCode.DEBIT_NOTE.getUnDocumentCode(), "383");
		Assert.assertEquals(UNDocumentTypeCode.CORRECTED_INVOICE.getUnDocumentCode(), "384");
		Assert.assertEquals(UNDocumentTypeCode.CONSOLIDATED_INVOICE.getUnDocumentCode(), "385");
		Assert.assertEquals(UNDocumentTypeCode.PREPAYMENT_INVOICE.getUnDocumentCode(), "386");
		Assert.assertEquals(UNDocumentTypeCode.SELF_BILLED_INVOICE.getUnDocumentCode(), "389");
		Assert.assertEquals(UNDocumentTypeCode.CONSIGNMENT_INVOICE.getUnDocumentCode(), "395");
		Assert.assertEquals(UNDocumentTypeCode.FACTORED_CREDIT_NOTE.getUnDocumentCode(), "396");
	}
	@Test
	public void shouldThrowIllegalArgumentExceptionWhenParsingNotExistedCode() {
		IllegalArgumentException e = assertThrows(IllegalArgumentException.class,
				() -> UNDocumentTypeCode.parse("Fighting!!"));
		assertThat(e.getMessage(), containsString("UNDocumentCode not exist"));
	}
}
