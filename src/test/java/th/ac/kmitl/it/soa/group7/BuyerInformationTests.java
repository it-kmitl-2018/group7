package th.ac.kmitl.it.soa.group7;

import org.json.JSONException;
import org.junit.Assert;
import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;

import th.ac.kmitl.it.soa.group7.converters.JsonConverter;
import th.ac.kmitl.it.soa.group7.models.BuyerInformation;

public class BuyerInformationTests {

	private String taxId = "0107536000986";
	private String storeBranch = "00000";
	private String nameEng = "Kiatnakin Bank Public Company Limited";
	private String nameTh = "ธนาคารเกียรตินาคิน จำกัด (มหาชน)";
	private String email = "contact@kiatnakin.co.th";
	private String telephone = "02-1655555";
	private String fax = "02-1655555";

	@Test
	public void buyerInformationOutputMatchTest() {
		BuyerInformation buyerInformation = BuyerInformation.builder().taxId(this.taxId).storeBranch(storeBranch)
				.nameEng(nameEng).nameTh(nameTh).email(email).telephone(telephone).fax(fax).build();

		Assert.assertEquals(buyerInformation.taxId, this.taxId);
		Assert.assertEquals(buyerInformation.storeBranch, this.storeBranch);
		Assert.assertEquals(buyerInformation.nameEng, this.nameEng);
		Assert.assertEquals(buyerInformation.nameTh, this.nameTh);
		Assert.assertEquals(buyerInformation.email, this.email);
		Assert.assertEquals(buyerInformation.telephone, this.telephone);
		Assert.assertEquals(buyerInformation.fax, this.fax);
	}

	@Test
	public void shouldGetCorrectJson() throws JSONException {
		BuyerInformation buyerInformation = BuyerInformation.builder().taxId(this.taxId).storeBranch(storeBranch)
				.nameEng(nameEng).nameTh(nameTh).email(email).telephone(telephone).fax(fax).build();
		String expectedJsonString = "{\r\n" + "    \"tax_number\" : \"0107536000986\",\r\n"
				+ "    \"branch_number\" : \"00000\",\r\n"
				+ "    \"name_en\" : \"Kiatnakin Bank Public Company Limited\",\r\n"
				+ "    \"name_th\" : \"ธนาคารเกียรตินาคิน จำกัด (มหาชน)\",\r\n"
				+ "    \"email\" : \"contact@kiatnakin.co.th\",\r\n" + "    \"telephone\" : \"02-1655555\",\r\n"
				+ "    \"fax\" : \"02-1655555\",\r\n" + "    \"address\" : null\r\n" + "}";

		JsonConverter jsonConverter = new JsonConverter();

		JSONAssert.assertEquals(jsonConverter.toJson(buyerInformation), expectedJsonString, true);
	}
}