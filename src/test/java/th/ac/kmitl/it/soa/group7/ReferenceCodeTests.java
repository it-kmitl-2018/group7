package th.ac.kmitl.it.soa.group7;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import th.ac.kmitl.it.soa.group7.definitions.ReferenceCode;


public class ReferenceCodeTests {
	@Test
	public void ReferenceCodeOutputMatchTest() {
		Assert.assertEquals(ReferenceCode.INVOICE_NUMBER.getCode(), "IV");
		Assert.assertEquals(ReferenceCode.DOCUMENT_REFERENCE_NUMBER.getCode(), "LC");
		Assert.assertEquals(ReferenceCode.SERIAL_NUMBER.getCode(), "LS");
		Assert.assertEquals(ReferenceCode.ORDER_NUMBER.getCode(), "ON");
		Assert.assertEquals(ReferenceCode.ITEM_NUMBER.getCode(), "SE");
		Assert.assertEquals(ReferenceCode.PREVIOUS_TAX_INVOICE_NUMBER.getCode(), "ALT");
		Assert.assertEquals(ReferenceCode.DEBIT_NOTE_NUMBER.getCode(), "DL");
		Assert.assertEquals(ReferenceCode.CREDIT_NOTE_NUMBER.getCode(), "CD");
		Assert.assertEquals(ReferenceCode.MUTUAL_REFERENCE_NUMBER.getCode(), "ZZZ");
	}
	
	@Test
	public void shouldThrowIllegalArgumentExceptionWhenParsingNotExistedCode() {
		IllegalArgumentException e = assertThrows(IllegalArgumentException.class,
				() -> ReferenceCode.parse("Fighting!!"));
		assertThat(e.getMessage(), containsString("Parsing not existed code"));
	}
}
