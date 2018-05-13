package th.ac.kmitl.it.soa.group7;

import org.junit.Test;

import org.junit.Assert;
import th.ac.kmitl.it.soa.group7.models.AddressInformation;
import th.ac.kmitl.it.soa.group7.models.TaxInvoiceModel;

public class TaxInvoiceModelTests {
	@Test
	public void CheckOutputMatch() {
		TaxInvoiceModel taxInvoiceModel = new TaxInvoiceModel();
		AddressInformation sellerAddressInformation = new AddressInformation();
		AddressInformation buyerAddressInformation = new AddressInformation();

		sellerAddressInformation.setAddressLineOne("Pramejairad Road.");
		sellerAddressInformation.setPostCode("20130");
		buyerAddressInformation.setAddressLineOne("Srilom Road.");
		buyerAddressInformation.setPostCode("10520");

		taxInvoiceModel.setAddressInformation(sellerAddressInformation, buyerAddressInformation);

		Assert.assertEquals(taxInvoiceModel.getSellerAddressInformation().getAddressLineOne(), "Pramejairad Road.");
		Assert.assertEquals(taxInvoiceModel.getSellerAddressInformation().getPostCode(), "20130");
		Assert.assertEquals(taxInvoiceModel.getBuyerAddressInformation().getAddressLineOne(), "Srilom Road.");
		Assert.assertEquals(taxInvoiceModel.getBuyerAddressInformation().getPostCode(), "10520");
	}
}
