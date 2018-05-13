package th.ac.kmitl.it.soa.group7.models;

public class TaxInvoiceModel {
	public TaxInvoiceModel() {
		this.buyerInfo = new BuyerInformation();
		this.buyerAddressInformation = buyerInfo.getAddressInformation();
	}

	private BuyerInformation buyerInfo;
	private AddressInformation buyerAddressInformation;
	private String documentTypeCode;

	public BuyerInformation getBuyer() {
		return buyerInfo;
	}

	public void setDocumentTypeCode(String documentTypeCode) {
		this.documentTypeCode = documentTypeCode;
	}

	public String getDocumentTypeCode() {
		return documentTypeCode;
	}
}
