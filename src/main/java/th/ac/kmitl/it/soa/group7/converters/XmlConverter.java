
public Class XmlConverter{
	//TODO Create toXML method
	public XmlConverter(){}
	
	public XmlConverter(TaxInvoiceModel taxInvoiceModel){
		this.taxInvoiceModel = taxInvoiceModel;
	}

	private TaxInvoiceModel taxInvoiceModel;
	private String data = taxInvoiceModel.getData();

	public String toXML(String data){
		return "Take my XML";
	}



}