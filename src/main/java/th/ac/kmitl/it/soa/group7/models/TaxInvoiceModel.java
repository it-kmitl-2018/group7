package th.ac.kmitl.it.soa.group7.models;

import java.util.ArrayList;
import java.util.List;

public class TaxInvoiceModel {
	public TaxInvoiceModel() {
		this.sellerInfo = new SellerInformation();
		this.buyerInfo = new BuyerInformation();
		this.sellerAddressInformation = sellerInfo.getAddressInformation();
		this.buyerAddressInformation = buyerInfo.getAddressInformation();
		this.list = new ArrayList<Object>();
	}

	private TaxInvoiceModel taxInvoiceModel;
	private String documentTypeCode;
	private SellerInformation sellerInfo;
	private BuyerInformation buyerInfo;
	private AddressInformation sellerAddressInformation;
	private AddressInformation buyerAddressInformation;
	private List<Object> list;

	public SellerInformation getSeller() {
		return sellerInfo;
	}

	public BuyerInformation getBuyer() {
		return buyerInfo;
	}

	//TODO implement Header to model
	public Object getNumber() {
		return "Tax invoice No. from Header";
	}

	public void setItem(BuyerInformation buyerInfo, SellerInformation sellerInfo) {
		this.sellerInfo = sellerInfo;
		this.buyerInfo = buyerInfo;
		this.list.add(sellerInfo);
		this.list.add(buyerInfo);
	}
}