package th.ac.kmitl.it.soa.group7;

import org.json.JSONException;
import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;

import th.ac.kmitl.it.soa.group7.converters.JsonConverter;
import th.ac.kmitl.it.soa.group7.models.BuyerInformation;
import th.ac.kmitl.it.soa.group7.models.TaxInvoiceModel;

public class TaxInvoiceModelTests {
	private String taxId = "0107536000986";
	private String storeBranch = "00000";
	private String nameEng = "Kiatnakin Bank Public Company Limited";
	private String nameTh = "ธนาคารเกียรตินาคิน จำกัด (มหาชน)";
	private String email = "contact@kiatnakin.co.th";
	private String telephone = "02-1655555";
	private String fax = "02-1655555";

	@Test
	public void shouldGetCorrectJson() throws JSONException {
		BuyerInformation buyerInformation = BuyerInformation.builder().taxId(this.taxId).storeBranch(storeBranch)
				.nameEng(nameEng).nameTh(nameTh).email(email).telephone(telephone).fax(fax).build();

		TaxInvoiceModel taxInvoiceModel = TaxInvoiceModel.builder().buyerInfo(buyerInformation).build();
		
		String expectedJsonString = "{\r\n" + 
				"    \"buyer\" : {\r\n" + 
				"        \"tax_number\" : \"0107536000986\",\r\n" + 
				"        \"branch_number\" : \"00000\",\r\n" + 
				"        \"name_en\" : \"Kiatnakin Bank Public Company Limited\",\r\n" + 
				"        \"name_th\" : \"ธนาคารเกียรตินาคิน จำกัด (มหาชน)\",\r\n" + 
				"        \"email\" : \"contact@kiatnakin.co.th\",\r\n" + 
				"        \"telephone\" : \"02-1655555\",\r\n" + 
				"        \"fax\" : \"02-1655555\",\r\n" + 
				"        \"address\" : null\r\n" + 
				"    }\r\n" + 
				"}";
		JsonConverter jsonConverter = new JsonConverter();
		System.out.println(jsonConverter.toJson(taxInvoiceModel));
		JSONAssert.assertEquals(jsonConverter.toJson(taxInvoiceModel), expectedJsonString, true);
	}
}
