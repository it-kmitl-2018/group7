package th.ac.kmitl.it.soa.group7;

import org.junit.Assert;
import org.junit.Test;

import th.ac.kmitl.it.soa.group7.models.BuyerInformation;
import th.ac.kmitl.it.soa.group7.models.SellerInformation;
import th.ac.kmitl.it.soa.group7.models.TaxInvoiceModel;

public class TaxInvoiceModelTests {
	@Test
	public void checkMethodOutput() {
		TaxInvoiceModel taxInvoiceModel = new TaxInvoiceModel();
		BuyerInformation buyerInformation = new BuyerInformation();
		SellerInformation sellerInformation = new SellerInformation();
		taxInvoiceModel.setItem(buyerInformation, sellerInformation);

		Assert.assertEquals(taxInvoiceModel.getNumber(), "Tax invoice No. from Header");
		Assert.assertNotNull(taxInvoiceModel.getSeller());
		Assert.assertNotNull(taxInvoiceModel.getBuyer());

		Assert.assertEquals(taxInvoiceModel.getTransactionDate(), "transaction_date");
		Assert.assertEquals(taxInvoiceModel.getNote(), "note");
		Assert.assertEquals(taxInvoiceModel.getItems(), "List of items");
	}
}
