package th.ac.kmitl.it.soa.group7;

import org.junit.Assert;
import org.junit.Test;

import th.ac.kmitl.it.soa.group7.definitions.TaxPayerIdCode;

public class TaxPayerIdCodeTests {
	@Test
	public void TaxPayerIdCodeOutputMatchTest() {
		Assert.assertEquals(TaxPayerIdCode.TAX_ID, TaxPayerIdCode.parse("TXID"));
		Assert.assertEquals(TaxPayerIdCode.ID_CARD_NUMBER, TaxPayerIdCode.parse("NIDN"));
		Assert.assertEquals(TaxPayerIdCode.PASSPORT_NUMBER, TaxPayerIdCode.parse("CCPT"));
		Assert.assertEquals(TaxPayerIdCode.OTHER_ID_SCHEMA, TaxPayerIdCode.parse("OTHR"));
	}

}
