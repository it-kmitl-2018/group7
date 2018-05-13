package th.ac.kmitl.it.soa.group7;

import org.junit.Assert;
import org.junit.Test;

import th.ac.kmitl.it.soa.group7.definitions.PurposeCode;

public class PurposeCodeTests {
	@Test
	public void PurposeCodeOutputMatchTest() {
		Assert.assertEquals(PurposeCode.INCREASE_PRODUCT_PRICE.getPurposeCode(), "DBNG01");
		Assert.assertEquals(PurposeCode.UNDER_CALCULATE_PRODUCT_PRICE.getPurposeCode(), "DBNG02");
		Assert.assertEquals(PurposeCode.OTHER_PRODUCT_REASON_DEBIT_NOTE.getPurposeCode(), "DBNG99");
		Assert.assertEquals(PurposeCode.INCREASE_SERVICE_PRICE.getPurposeCode(), "DBNS01");
		Assert.assertEquals(PurposeCode.UNDER_CALCULATE_SERVICE_PRICE.getPurposeCode(), "DBNS02");
		Assert.assertEquals(PurposeCode.OTHER_SERVICE_REASON_DEBIT_NOTE.getPurposeCode(), "DBNS99");
		Assert.assertEquals(PurposeCode.DISCOUNT_PRODUCT_PRICE.getPurposeCode(), "DCNG01");
		Assert.assertEquals(PurposeCode.PRODUCT_DAMAGED.getPurposeCode(), "DCNG02");
		Assert.assertEquals(PurposeCode.MISSING_PRODUCT_ITEMS.getPurposeCode(), "DCNG03");
		Assert.assertEquals(PurposeCode.OVER_CALCULATE_PRODUCT_PRICE.getPurposeCode(), "DCNG04");
		Assert.assertEquals(PurposeCode.RETURN_PRODUCT.getPurposeCode(), "DCNG05");
		Assert.assertEquals(PurposeCode.OTHER_PRODUCT_REASON_CREDIT_NOTE.getPurposeCode(), "DCNG99");
		Assert.assertEquals(PurposeCode.DISCOUNT_SERVICE_CHARGE.getPurposeCode(), "DCNS01");
		Assert.assertEquals(PurposeCode.INCOMPLETE_SERVICE_CHARGE.getPurposeCode(), "DCNS02");
		Assert.assertEquals(PurposeCode.OVER_CALCULATE_SERVICE_CHARGE.getPurposeCode(), "DCNS03");
		Assert.assertEquals(PurposeCode.CONTRACT_CANCELLATION.getPurposeCode(), "DCNS04");
		Assert.assertEquals(PurposeCode.OTHER_SERVICE_REASON_CREDIT_NOTE.getPurposeCode(), "DCNS99");
		Assert.assertEquals(PurposeCode.WRONG_NAME_AT_TAX_INVOICE.getPurposeCode(), "TIVC01");
		Assert.assertEquals(PurposeCode.WRONG_ADDRESS_AT_TAX_INVOICE.getPurposeCode(), "TIVC02");
		Assert.assertEquals(PurposeCode.OTHER_REASON_AT_TAX_INVOICE.getPurposeCode(), "TIVC99");
		Assert.assertEquals(PurposeCode.WRONG_NAME_AT_RECEIPT.getPurposeCode(), "RCTC01");
		Assert.assertEquals(PurposeCode.WRONG_ADDRESS_AT_RECEIPT.getPurposeCode(), "RCTC02");
		Assert.assertEquals(PurposeCode.RETURN_PRODUCT_OR_SERVICE_CANCELLATION_ALL.getPurposeCode(), "RCTC03");
		Assert.assertEquals(PurposeCode.RETURN_PRODUCT_OR_SERVICE_CANCELLATION_SOME.getPurposeCode(), "RCTC04");
		Assert.assertEquals(PurposeCode.OTHER_REASON_AT_RECEIPT.getPurposeCode(), "RCTC99");
	}
}
