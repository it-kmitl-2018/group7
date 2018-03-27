package th.ac.kmitl.it.soa.group7.models;

public class TaxInvoiceModel {
	public TaxInvoiceModel() {
	}

	public TaxInvoiceModel(String message) {
		this.message = message;
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

	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
