package th.ac.kmitl.it.soa.group7;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import th.ac.kmitl.it.soa.group7.definitions.AllowanceChargeCode;

public class AllowanceChargeCodeTests {
	@Test
	public void allowanceChargeCodeOutputMatchTest() {
		Assert.assertEquals(AllowanceChargeCode.STAMP_DUTY.getCode(), 28);
		Assert.assertEquals(AllowanceChargeCode.BANK_CHARGES.getCode(), 30);
		Assert.assertEquals(AllowanceChargeCode.MINIMUM_COMMISSION.getCode(), 52);
		Assert.assertEquals(AllowanceChargeCode.TRANSFER_CHARGES.getCode(), 55);
		Assert.assertEquals(AllowanceChargeCode.MISCELLANEOUS_CHARGES.getCode(), 57);
		Assert.assertEquals(AllowanceChargeCode.FOREIGN_EXCHANGE_CHARGES.getCode(), 58);
		Assert.assertEquals(AllowanceChargeCode.SPECIAL_AGREEMENT_CHARGE.getCode(), 65);
		Assert.assertEquals(AllowanceChargeCode.SAMPLE_DISCOUNT.getCode(), 66);
		Assert.assertEquals(AllowanceChargeCode.RUSH_DELIVERY_SURCHARGE.getCode(), 77);
		Assert.assertEquals(AllowanceChargeCode.LOADING_CHARGE.getCode(), 82);
		Assert.assertEquals(AllowanceChargeCode.WAREHOUSING_CHARGE.getCode(), 85);
		Assert.assertEquals(AllowanceChargeCode.REDUCTION_FROM_USUAL_PRICE.getCode(), 95);
		Assert.assertEquals(AllowanceChargeCode.CHARGE_FOR_INSURANCE.getCode(), 96);
	}
	
	@Test
	public void shouldThrowIllegalArgumentExceptionWhenParsingNotExistedCode() {
		IllegalArgumentException e = assertThrows(IllegalArgumentException.class,
				() -> AllowanceChargeCode.parse(1412));
		assertThat(e.getMessage(), containsString("Parsing not existed code"));
	}
}
