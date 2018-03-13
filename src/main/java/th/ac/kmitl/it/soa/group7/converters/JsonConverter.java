
public Class JsonConverter{
	//TODO Create toJSON method
	public JsonConverter(){}
	
	public JsonConverter(TaxInvoiceModel taxInvoiceModel){
		this.taxInvoiceModel = taxInvoiceModel;
	}

	private TaxInvoiceModel taxInvoiceModel;
	private String data = taxInvoiceModel.getData();

	public String toJson(String data){
		return "This is JSON";
	}
}