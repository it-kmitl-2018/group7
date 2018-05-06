package th.ac.kmitl.it.soa.group7;

import org.junit.Assert;
import org.junit.Test;

import th.ac.kmitl.it.soa.group7.models.BuyerInformation;

public class BuyerInformationTests {
	@Test
	public void SellerInformationOutputMatchTest() {
		BuyerInformation buyerInfo = new BuyerInformation();
		buyerInfo.setBuyerTaxId("0107536000986");
		buyerInfo.setStoreBranch("00000");
		buyerInfo.setBuyerNameEng("Kiatnakin Bank Public Company Limited");
		buyerInfo.setBuyerNameTh("ธนาคารเกียรตินาคิน จำกัด (มหาชน)");
		buyerInfo.setBuyerEmail("contact@kiatnakin.co.th");
		buyerInfo.setBuyerTelephone("02-1655555");
		buyerInfo.setBuyerFax("02-1655555");

		Assert.assertEquals(buyerInfo.getBuyerTaxId(), "0107536000986");
		Assert.assertEquals(buyerInfo.getStoreBranch(), "00000");
		Assert.assertEquals(buyerInfo.getBuyerNameEng(), "Kiatnakin Bank Public Company Limited");
		Assert.assertEquals(buyerInfo.getBuyerNameTh(), "ธนาคารเกียรตินาคิน จำกัด (มหาชน)");
		Assert.assertEquals(buyerInfo.getBuyerEmail(), "contact@kiatnakin.co.th");
		Assert.assertEquals(buyerInfo.getBuyerTelephone(), "02-1655555");
		Assert.assertEquals(buyerInfo.getBuyerFax(), "02-1655555");

	}
	
}
