package th.ac.kmitl.it.soa.group7;

import org.junit.Assert;
import org.junit.Test;

import th.ac.kmitl.it.soa.group7.models.AddressInformation;
import th.ac.kmitl.it.soa.group7.models.SenderInformation;

public class SenderInformationTests {
	@Test
	public void checkOutputMatch() {
		SenderInformation senderInformation = new SenderInformation();
		AddressInformation addressInformation = new AddressInformation();
		addressInformation.setAddressLineOne("สำนักงานใหญ่ เลขที่ 313/1");
		addressInformation.setCityName("Chonburi");

		senderInformation.setName("บริษัท โตโยต้า ธนบุรี จำกัด");
		senderInformation.setId("0105522022883");
		senderInformation.setBranch("00000");
		senderInformation.setEmail("sales@toyotathonburi.com");
		senderInformation.setTelePhone("02-4799009");
		senderInformation.setAddressInformation(addressInformation);

		Assert.assertEquals(senderInformation.getName(), "บริษัท โตโยต้า ธนบุรี จำกัด");
		Assert.assertEquals(senderInformation.getId(), "0105522022883");
		Assert.assertEquals(senderInformation.getBranch(), "00000");
		Assert.assertEquals(senderInformation.getEmail(), "sales@toyotathonburi.com");
		Assert.assertEquals(senderInformation.getTelePhone(), "02-4799009");
		Assert.assertEquals(senderInformation.getAddressInformation().getAddressLineOne(), "สำนักงานใหญ่ เลขที่ 313/1");
		Assert.assertEquals(senderInformation.getAddressInformation().getCityName(), "Chonburi");
	}
}
