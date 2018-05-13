package th.ac.kmitl.it.soa.group7;

import org.junit.Assert;
import org.junit.Test;

import th.ac.kmitl.it.soa.group7.models.AddressInformation;
import th.ac.kmitl.it.soa.group7.models.ReceiverInformation;

public class ReceiverInformationTests {
	@Test
	public void checkOutputMatch() {
		ReceiverInformation receiverInformation = new ReceiverInformation();
		AddressInformation addressInformation = new AddressInformation();

		receiverInformation.setName("ธนาคารเกียรตินาคิน จำกัด (มหาชน)");
		receiverInformation.setId("0107536000986");
		receiverInformation.setBranch("00000");
		addressInformation.setAddressLineOne("500 ถนนเพลินจิต");
		addressInformation.setAddressLineTwo("แขวงลุมพินี เขตปทุมวัน กรุงเทพมหานคร 10330");
		receiverInformation.setAddressInformation(addressInformation);

		Assert.assertEquals(receiverInformation.getName(), "ธนาคารเกียรตินาคิน จำกัด (มหาชน)");
		Assert.assertEquals(receiverInformation.getId(), "0107536000986");
		Assert.assertEquals(receiverInformation.getBranch(), "00000");

		Assert.assertEquals(receiverInformation.getAddressInformation().getAddressLineOne(), "500 ถนนเพลินจิต");
		Assert.assertEquals(receiverInformation.getAddressInformation().getAddressLineTwo(),
				"แขวงลุมพินี เขตปทุมวัน กรุงเทพมหานคร 10330");
	}
}
