package th.ac.kmitl.it.soa.group7;

import org.junit.Assert;
import org.junit.Test;

import th.ac.kmitl.it.soa.group7.models.BuyerInformation;

public class BuyerInformationTests {
	
	@Test
	public void SellerInformationOutputMatchTest() {
		BuyerInformation sellerInfo = new BuyerInformation();
		sellerInfo.setTaxId("0107536000986");
		sellerInfo.setStoreBranch("00000");
		sellerInfo.setNameEng("Kiatnakin Bank Public Company Limited");
		sellerInfo.setNameTh("ธนาคารเกียรตินาคิน จำกัด (มหาชน)");
		sellerInfo.setEmail("contact@kiatnakin.co.th");
		sellerInfo.setTelephone("02-1655555");
		sellerInfo.setFax("02-1655555");

		Assert.assertEquals(sellerInfo.getTaxId(), "0107536000986");
		Assert.assertEquals(sellerInfo.getStoreBranch(), "00000");
		Assert.assertEquals(sellerInfo.getNameEng(), "Kiatnakin Bank Public Company Limited");
		Assert.assertEquals(sellerInfo.getNameTh(), "ธนาคารเกียรตินาคิน จำกัด (มหาชน)");
		Assert.assertEquals(sellerInfo.getEmail(), "contact@kiatnakin.co.th");
		Assert.assertEquals(sellerInfo.getTelephone(), "02-1655555");
		Assert.assertEquals(sellerInfo.getFax(), "02-1655555");

	}
}
