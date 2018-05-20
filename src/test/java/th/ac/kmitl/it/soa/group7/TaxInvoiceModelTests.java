package th.ac.kmitl.it.soa.group7;

import org.json.JSONException;
import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;

import th.ac.kmitl.it.soa.group7.converters.JsonConverter;
import th.ac.kmitl.it.soa.group7.models.BuyerInformation;
import th.ac.kmitl.it.soa.group7.models.SellerInformation;
import th.ac.kmitl.it.soa.group7.models.TaxInvoiceModel;
import th.ac.kmitl.it.soa.group7.models.json.AddressJson;
import th.ac.kmitl.it.soa.group7.models.json.NoteJson;

public class TaxInvoiceModelTests {
	private String taxNumber = "INV-178324672";
	private String buyertaxNumber = "0107536000986";
	private String sellertaxNumber = "0105522022883";
	private BuyerInformation buyerInformation = new BuyerInformation();
	private SellerInformation sellerInformation = new SellerInformation();
	private Object transactionDate = "2018-05-14 14:20:00";
	private NoteJson note;
	private AddressJson buyerAddress;
	private AddressJson sellerAddress;
	private Object items = null;
	private JsonConverter jsonConverter = new JsonConverter();

	@Test
	public void shouldGetCorrectJsonData() throws JSONException {
		buyerInformation.setTaxId("0107536000986");
		buyerInformation.setStoreBranch("00000");
		buyerInformation.setNameEng("Kiatnakin Bank Public Company Limited");
		buyerInformation.setNameTh("ธนาคารเกียรตินาคิน จำกัด (มหาชน)");
		buyerInformation.setEmail("contact@kiatnakin.co.th");
		buyerInformation.setTelephone("02-1655555");
		buyerInformation.setFax("02-1655555");

		sellerInformation.setTaxId("0105522022883");
		sellerInformation.setBranch("00000");
		sellerInformation.setNameEng("TOYOTA THONBURI CO, LTD.");
		sellerInformation.setNameTh("บริษัท โตโยต้า ธนบุรี จำกัด");
		sellerInformation.setEmail("sales@toyotathonburi.com");
		sellerInformation.setTelephone("02-4799009");
		sellerInformation.setFax("02-4799009");

		note = NoteJson.builder().subject("หมายเหตุ").content(
				"\\n แบบรถ : Toyota Fortuner 3.0V AT 2014 TRD\\n เลขเครื่อง : 1KD-FTV\\n เลขตัวถัง : FN-83741\\n สี : สีเทา\\n")
				.build();

		TaxInvoiceModel taxInvoiceModel = TaxInvoiceModel.builder().taxNumber(taxNumber)
				.sellerInformation(sellerInformation).buyerInfo(buyerInformation).transactionDate(transactionDate)
				.note(note).items(items).build();

		String expectedJsonString = "{\r\n" + "    \"number\" : \"INV-178324672\",\r\n" + "    \"seller\" : {\r\n"
				+ "        \"taxId\" : \"0105522022883\",\r\n" + "        \"branch\" : \"00000\",\r\n"
				+ "        \"nameEng\" : \"TOYOTA THONBURI CO, LTD.\",\r\n"
				+ "        \"nameTh\" : \"บริษัท โตโยต้า ธนบุรี จำกัด\",\r\n"
				+ "        \"email\" : \"sales@toyotathonburi.com\",\r\n"
				+ "        \"telephone\" : \"02-4799009\",\r\n" + "        \"fax\" : \"02-4799009\"\r\n" + "    },\r\n"
				+ "    \"buyer\" : {\r\n" + "        \"taxId\" : \"0107536000986\",\r\n"
				+ "        \"storeBranch\" : \"00000\",\r\n"
				+ "        \"nameEng\" : \"Kiatnakin Bank Public Company Limited\",\r\n"
				+ "        \"nameTh\" : \"ธนาคารเกียรตินาคิน จำกัด (มหาชน)\",\r\n"
				+ "        \"email\" : \"contact@kiatnakin.co.th\",\r\n" + "        \"telephone\" : \"02-1655555\",\r\n"
				+ "        \"fax\" : \"02-1655555\"\r\n" + "    },\r\n"
				+ "    \"transaction_date\" : \"2018-05-14 14:20:00\",\r\n" + "    \"note\" : {\r\n"
				+ "        \"subject\" : \"หมายเหตุ\",\r\n"
				+ "        \"content\" : \"\\\\n แบบรถ : Toyota Fortuner 3.0V AT 2014 TRD\\\\n เลขเครื่อง : 1KD-FTV\\\\n เลขตัวถัง : FN-83741\\\\n สี : สีเทา\\\\n\"\r\n"
				+ "    },\r\n" + "    \"items\" : null\r\n" + "}";

		JSONAssert.assertEquals(jsonConverter.toJson(taxInvoiceModel), expectedJsonString, true);
	}

	@Test
	public void jsonAddressCheck() throws JSONException {
		String expectedJsonStringSeller = "{\r\n" + "    \"line_one\" : \"สำนักงานใหญ่ เลขที่ 313/1\",\r\n"
				+ "    \"line_two\" : \"ถนนรัชดาภิเษก แขวงบุคลโล เขตธนบุรี กรุงเทพมหานคร 10600\",\r\n"
				+ "    \"city_name\" : \"ธนบุรี\",\r\n" + "    \"city_sub_division_name\" : \"บุคคโลนี\",\r\n"
				+ "    \"post_code\" : \"10600\",\r\n" + "    \"country_sub_division\" : \"กรุงเทพมหานคร\",\r\n"
				+ "    \"country_code\" : \"TH\"\r\n" + "}";

		String expectedJsonStringBuyer = "{\r\n" + "    \"line_one\" : \"500 ถนนเพลินจิต\",\r\n"
				+ "    \"line_two\" : \"แขวงลุมพินี เขตปทุมวัน กรุงเทพมหานคร 10330\",\r\n"
				+ "    \"city_name\" : \"ปทุมวัน\",\r\n" + "    \"city_sub_division_name\" : \"ลุมพินี\",\r\n"
				+ "    \"post_code\" : \"10330\",\r\n" + "    \"country_sub_division\" : \"กรุงเทพมหานคร\",\r\n"
				+ "    \"country_code\" : \"TH\"\r\n" + "}";

		sellerAddress = AddressJson.builder().lineOne("สำนักงานใหญ่ เลขที่ 313/1")
				.lineTwo("ถนนรัชดาภิเษก แขวงบุคลโล เขตธนบุรี กรุงเทพมหานคร 10600").cityName("ธนบุรี")
				.citySubDivisionName("บุคคโลนี").postCode("10600").countrySubDivision("กรุงเทพมหานคร").countryCode("TH")
				.build();

		buyerAddress = AddressJson.builder().lineOne("500 ถนนเพลินจิต")
				.lineTwo("แขวงลุมพินี เขตปทุมวัน กรุงเทพมหานคร 10330").cityName("ปทุมวัน")
				.citySubDivisionName("ลุมพินี").postCode("10330").countrySubDivision("กรุงเทพมหานคร").countryCode("TH")
				.build();

		JSONAssert.assertEquals(jsonConverter.toJson(sellerAddress), expectedJsonStringSeller, true);
		JSONAssert.assertEquals(jsonConverter.toJson(buyerAddress), expectedJsonStringBuyer, true);
	}
}