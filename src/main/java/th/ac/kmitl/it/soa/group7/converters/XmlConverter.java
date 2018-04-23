package th.ac.kmitl.it.soa.group7.converters;

import th.ac.kmitl.it.soa.group7.models.TaxInvoiceModel;

public class XmlConverter{
	//TODO Create toXML method
	public XmlConverter(){}
	
	public XmlConverter(TaxInvoiceModel taxInvoiceModel){
		this.taxInvoiceModel = taxInvoiceModel;
	}

	private TaxInvoiceModel taxInvoiceModel;


	public String toXML(String data){
		return "Take my XML";
	}



}