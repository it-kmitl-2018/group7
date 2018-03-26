package th.ac.kmitl.it.soa.group7.models;

import org.springframework.ui.ModelMap;

public class TaxInvoiceModel {// Collect Tax Invoice details
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
