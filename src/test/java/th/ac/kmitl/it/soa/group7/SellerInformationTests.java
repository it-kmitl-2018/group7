package th.ac.kmitl.it.soa.group7;

import org.junit.Assert;
import org.junit.Test;

import th.ac.kmitl.it.soa.group7.models.SellerInformation;

public class SellerInformationTests {
	@Test
	public void SellerInformationOutputMatchTest() {
		SellerInformation sellerInfo = new SellerInformation();
		sellerInfo.setTaxId("0105522022883");
		sellerInfo.setBranch("00000");
		sellerInfo.setNameEng("TOYOTA THONBURI CO, LTD.");
		sellerInfo.setNameTh("บริษัท โตโยต้า ธนบุรี จำกัด");
		sellerInfo.setEmail("sales@toyotathonburi.com");
		sellerInfo.setTelephone("02-4799009");
		sellerInfo.setFax("02-4799009");

		Assert.assertEquals(sellerInfo.getTaxId(), "0105522022883");
		Assert.assertEquals(sellerInfo.getBranch(), "00000");
		Assert.assertEquals(sellerInfo.getNameEng(), "TOYOTA THONBURI CO, LTD.");
		Assert.assertEquals(sellerInfo.getNameTh(), "บริษัท โตโยต้า ธนบุรี จำกัด");
		Assert.assertEquals(sellerInfo.getEmail(), "sales@toyotathonburi.com");
		Assert.assertEquals(sellerInfo.getTelephone(), "02-4799009");
		Assert.assertEquals(sellerInfo.getFax(), "02-4799009");

	}

}
