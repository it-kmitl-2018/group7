package th.ac.kmitl.it.soa.group7;

import org.junit.Assert;
import org.junit.Test;

import th.ac.kmitl.it.soa.group7.definitions.TaxPayerIdCode;

public class TaxPayerIdCodeTests {
	@Test
	public void TaxPayerIdCodeOutputMatchTest() {
		Assert.assertEquals(TaxPayerIdCode.TAX_ID.getTaxPayerIdCode(), "TXID");
		Assert.assertEquals(TaxPayerIdCode.ID_CARD_NUMBER.getTaxPayerIdCode(), "NIDN");
		Assert.assertEquals(TaxPayerIdCode.PASSPORT_NUMBER.getTaxPayerIdCode(), "CCPT");
		Assert.assertEquals(TaxPayerIdCode.OTHER_ID_SCHEMA.getTaxPayerIdCode(), "OTHR");
	}

}
