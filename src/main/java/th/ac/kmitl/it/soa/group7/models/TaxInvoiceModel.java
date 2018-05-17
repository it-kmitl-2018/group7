package th.ac.kmitl.it.soa.group7.models;

public class TaxInvoiceModel {
	public TaxInvoiceModel() {
		this.sellerAddressInformation = new AddressInformation();
		this.buyerAddressInformation = new AddressInformation();
	}

	private AddressInformation sellerAddressInformation;
	private AddressInformation buyerAddressInformation;
	private String documentTypeCode;

	public AddressInformation getSellerAddressInformation() {
		return sellerAddressInformation;
	}

	public void setAddressInformation(AddressInformation sellerAddressInformation,
			AddressInformation buyerAddressInformation) {
		this.sellerAddressInformation = sellerAddressInformation;
		this.buyerAddressInformation = buyerAddressInformation;
	}

	public AddressInformation getBuyerAddressInformation() {
		return buyerAddressInformation;
	}

	public void setDocumentTypeCode(String documentTypeCode) {
		this.documentTypeCode = documentTypeCode;
	}

	public String getDocumentTypeCode() {
		return documentTypeCode;
	}
}
