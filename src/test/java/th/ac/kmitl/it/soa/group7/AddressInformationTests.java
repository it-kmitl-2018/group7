package th.ac.kmitl.it.soa.group7;

import org.junit.Assert;
import org.junit.Test;

import th.ac.kmitl.it.soa.group7.models.AddressInformation;

public class AddressInformationTests {
	@Test
	public void AddressInformationOutputMatchTest() {
		AddressInformation addressInfo = new AddressInformation();
		addressInfo.setAddressLineOne("สำนักงานใหญ่ เลขที่ 313/1");
		addressInfo.setAddressLineTwo("ถนนรัชดาภิเษก แขวงบุคลโล เขตธนบุรี กรุงเทพมหานคร 10600");
		addressInfo.setCityName("ธนบุรี");
		addressInfo.setCitySubDivision("บุคคโล");
		addressInfo.setPostCode("10600");
		addressInfo.setCountrySubDivision("กรุงเทพมหานคร");
		addressInfo.setCountryName("TH");

		Assert.assertEquals(addressInfo.getAddressLineOne(), "สำนักงานใหญ่ เลขที่ 313/1");
		Assert.assertEquals(addressInfo.getAddressLineTwo(), "ถนนรัชดาภิเษก แขวงบุคลโล เขตธนบุรี กรุงเทพมหานคร 10600");
		Assert.assertEquals(addressInfo.getCityName(), "ธนบุรี");
		Assert.assertEquals(addressInfo.getCitySubDivision(), "บุคคโล");
		Assert.assertEquals(addressInfo.getPostCode(), "10600");
		Assert.assertEquals(addressInfo.getCountrySubDivision(), "กรุงเทพมหานคร");
		Assert.assertEquals(addressInfo.getCountryName(), "TH");
	}

}
