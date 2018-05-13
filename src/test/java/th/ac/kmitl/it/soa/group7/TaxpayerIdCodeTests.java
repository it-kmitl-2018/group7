package th.ac.kmitl.it.soa.group7;

import org.junit.Assert;
import org.junit.Test;

import th.ac.kmitl.it.soa.group7.definitions.TaxpayerIdCode;


public class TaxpayerIdCodeTests {
	@Test
	public void TaxpayerIdCodeOutputMatchTest() {
		Assert.assertEquals(TaxpayerIdCode.TAX_ID.getTaxpayerIdCode(), "TXID");
		Assert.assertEquals(TaxpayerIdCode.ID_CARD_NUMBER.getTaxpayerIdCode(), "NIDN");
		Assert.assertEquals(TaxpayerIdCode.PASSPORT_NUMBER.getTaxpayerIdCode(), "CCPT");
		Assert.assertEquals(TaxpayerIdCode.OTHER_ID_SCHEMA.getTaxpayerIdCode(), "OTHR");
	}

}
