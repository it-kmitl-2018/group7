package th.ac.kmitl.it.soa.group7.models;

import java.util.ArrayList;
import java.util.List;

public class TaxInvoiceModel {
	public TaxInvoiceModel() {
		this.list = new ArrayList<Object>();
	}

	private TaxInvoiceModel taxInvoiceModel;
	private List<Object> list;

	// TODO implement Header to model
	public Object getNumber() {
		return "Tax invoice No. from Header";
	}

	// TODO implement Seller to model
	public SellerInformation getSeller() {
		return new SellerInformation();
	}

	// TODO implement Buyer to model
	public BuyerInformation getBuyer() {
		return new BuyerInformation();
	}

	// TODO implement TransactionDate to model
	public Object getTransactionDate() {
		return "transaction_date";
	}

	// TODO implement Note to model
	public Object getNote() {
		return "note";
	}

	// TODO implement Items to model
	public Object getItems() {
		return "List of items";
	}

	public void setItem(BuyerInformation buyerInformation, SellerInformation sellerInformation) {
		this.list.add(sellerInformation);
		this.list.add(buyerInformation);
	}
}
