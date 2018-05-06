package th.ac.kmitl.it.soa.group7;

import org.junit.Assert;
import org.junit.Test;

import th.ac.kmitl.it.soa.group7.models.SellerInformation;

public class SellerInformationTests {
	@Test
	public void SellerInformationOutputMatchTest() {
		SellerInformation sellerInfo = new SellerInformation();
		sellerInfo.setSellerTaxId("0105522022883");
		sellerInfo.setStoreBranch("00000");
		sellerInfo.setSellerNameEng("TOYOTA THONBURI CO, LTD.");
		sellerInfo.setSellerNameTh("บริษัท โตโยต้า ธนบุรี จำกัด");
		sellerInfo.setSellerEmail("sales@toyotathonburi.com");
		sellerInfo.setSellerTelephone("02-4799009");
		sellerInfo.setSellerFax("02-4799009");

		Assert.assertEquals(sellerInfo.getSellerTaxId(), "0105522022883");
		Assert.assertEquals(sellerInfo.getStoreBranch(), "00000");
		Assert.assertEquals(sellerInfo.getSellerNameEng(), "TOYOTA THONBURI CO, LTD.");
		Assert.assertEquals(sellerInfo.getSellerNameTh(), "บริษัท โตโยต้า ธนบุรี จำกัด");
		Assert.assertEquals(sellerInfo.getSellerEmail(), "sales@toyotathonburi.com");
		Assert.assertEquals(sellerInfo.getSellerTelephone(), "02-4799009");
		Assert.assertEquals(sellerInfo.getSellerFax(), "02-4799009");

	}

}
