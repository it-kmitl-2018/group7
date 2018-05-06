package th.ac.kmitl.it.soa.group7;

import org.junit.Assert;
import org.junit.Test;

import th.ac.kmitl.it.soa.group7.models.BuyerInformation;

public class BuyerInformationTests {
	
	@Test
	public void SellerInformationOutputMatchTest() {
		BuyerInformation sellerInfo = new BuyerInformation();
		sellerInfo.setBuyerTaxId("0107536000986");
		sellerInfo.setStoreBranch("00000");
		sellerInfo.setBuyerNameEng("Kiatnakin Bank Public Company Limited");
		sellerInfo.setBuyerNameTh("ธนาคารเกียรตินาคิน จำกัด (มหาชน)");
		sellerInfo.setBuyerEmail("contact@kiatnakin.co.th");
		sellerInfo.setBuyerTelephone("02-1655555");
		sellerInfo.setBuyerFax("02-1655555");

		Assert.assertEquals(sellerInfo.getBuyerTaxId(), "0107536000986");
		Assert.assertEquals(sellerInfo.getStoreBranch(), "00000");
		Assert.assertEquals(sellerInfo.getBuyerNameEng(), "Kiatnakin Bank Public Company Limited");
		Assert.assertEquals(sellerInfo.getBuyerNameTh(), "ธนาคารเกียรตินาคิน จำกัด (มหาชน)");
		Assert.assertEquals(sellerInfo.getBuyerEmail(), "contact@kiatnakin.co.th");
		Assert.assertEquals(sellerInfo.getBuyerTelephone(), "02-1655555");
		Assert.assertEquals(sellerInfo.getBuyerFax(), "02-1655555");

	}
}
