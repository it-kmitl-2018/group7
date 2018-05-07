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

	public List<Object> getItem() {
		return list;
	}

	public Object getTaxInvoice() {
		return taxInvoiceModel;
	}

	public void setDocumentTypeCode(String documentTypeCode) {
		this.documentTypeCode = documentTypeCode;
	}

	public String getDocumentTypeCode() {
		return documentTypeCode;
	}

	public void setItem(BuyerInformation buyerInfo, SellerInformation sellerInfo) {
		this.list.add(sellerInfo);
		this.list.add(buyerInfo);
	}
}
