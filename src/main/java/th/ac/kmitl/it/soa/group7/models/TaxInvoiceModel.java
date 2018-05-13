package th.ac.kmitl.it.soa.group7.models;

public class TaxInvoiceModel {
	public TaxInvoiceModel() {
		this.sellerInfo = new SellerInformation();
		this.sellerAddressInformation = sellerInfo.getAddressInformation();
	}

	private SellerInformation sellerInfo;
	private AddressInformation sellerAddressInformation;
	private String documentTypeCode;

	public void setDocumentTypeCode(String documentTypeCode) {
		this.documentTypeCode = documentTypeCode;
	}

	public String getDocumentTypeCode() {
		return documentTypeCode;
	}

	public SellerInformation getSeller() {
		return sellerInfo;
	}
}
