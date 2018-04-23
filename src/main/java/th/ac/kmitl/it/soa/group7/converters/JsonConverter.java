package th.ac.kmitl.it.soa.group7.converters;

import th.ac.kmitl.it.soa.group7.models.TaxInvoiceModel;

public class JsonConverter{
	//TODO Create toJSON method
	public JsonConverter(){}
	
	public JsonConverter(TaxInvoiceModel taxInvoiceModel){
		this.taxInvoiceModel = taxInvoiceModel;
	}

	private TaxInvoiceModel taxInvoiceModel;

	public String toJson(String data){
		return "This is JSON";
	}
}