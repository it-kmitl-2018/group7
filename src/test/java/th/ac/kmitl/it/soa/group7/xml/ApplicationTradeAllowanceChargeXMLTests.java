package th.ac.kmitl.it.soa.group7.xml;

import org.junit.Assert;
import org.junit.Test;

import th.ac.kmitl.it.soa.group7.models.xml.AppliedTradeAllowanceChargeXML;

public class ApplicationTradeAllowanceChargeXMLTests {
	public boolean chargeIndicator = true;
	public String actualAmount = "THB";
	public String reasonCode = "061";
	public String reason = "โกงหนี้";

	@Test
	public void shouldGetCorrectXML() {
		AppliedTradeAllowanceChargeXML applicationTradeAllowanceCharge = AppliedTradeAllowanceChargeXML.builder()
				.chargeIndicator(chargeIndicator).actualAmount(actualAmount).reasonCode(reasonCode).reason(reason)
				.build();

		Assert.assertEquals(applicationTradeAllowanceCharge.chargeIndicator, this.chargeIndicator);
		Assert.assertEquals(applicationTradeAllowanceCharge.actualAmount, this.actualAmount);
		Assert.assertEquals(applicationTradeAllowanceCharge.reasonCode, this.reasonCode);
		Assert.assertEquals(applicationTradeAllowanceCharge.reason, this.reason);
	}
}
