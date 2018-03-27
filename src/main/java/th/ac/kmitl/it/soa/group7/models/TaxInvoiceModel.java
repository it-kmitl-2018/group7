package th.ac.kmitl.it.soa.group7.models;

public class TaxInvoiceModel {
	public TaxInvoiceModel() {
	}

	public TaxInvoiceModel(HeaderContext headerContext) {
		this.headerContext = headerContext;
	}

	private HeaderContext headerContext;

	public HeaderContext getHeaderContext() {
		return headerContext;
	}

	public void setHeaderContext(HeaderContext headerContext) {
		this.headerContext = headerContext;
	}
}
