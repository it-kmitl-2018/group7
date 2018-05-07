package th.ac.kmitl.it.soa.group7;

import org.junit.Assert;
import org.junit.Test;

import th.ac.kmitl.it.soa.group7.converters.JsonConverter;
import th.ac.kmitl.it.soa.group7.models.AddressInformation;
import th.ac.kmitl.it.soa.group7.models.BuyerInformation;
import th.ac.kmitl.it.soa.group7.models.SellerInformation;
import th.ac.kmitl.it.soa.group7.models.TaxInvoiceModel;

public class GenerateJsonTests {
	private static final String JSON_EXAMPLE = "[\r\n" + "    {\r\n" + "        \"taxId\" : \"INV-123456\",\r\n"
			+ "        \"branch\" : \"00000\",\r\n" + "        \"nameEng\" : \"Beedle\",\r\n"
			+ "        \"nameTh\" : \"ไทยแลนด์\",\r\n" + "        \"email\" : \"hello@mail.com\",\r\n"
			+ "        \"telephone\" : \"06-5507-9511\",\r\n" + "        \"fax\" : \"06-5507-9511\",\r\n"
			+ "        \"addressInformation\" : {\r\n"
			+ "            \"addressLineOne\" : \"สำนักงานใหญ่ เลขที่ 313/1\",\r\n"
			+ "            \"addressLineTwo\" : \"ถนนรัชดาภิเษก แขวงบุคลโล เขตธนบุรี กรุงเทพมหานคร 10600\",\r\n"
			+ "            \"cityName\" : \"ธนบุรี\",\r\n" + "            \"citySubDivision\" : \"บุคคโล\",\r\n"
			+ "            \"postCode\" : \"10600\",\r\n"
			+ "            \"countrySubDivision\" : \"กรุงเทพมหานคร\",\r\n" + "            \"countryName\" : \"TH\"\r\n"
			+ "        }\r\n" + "    },\r\n" + "    {\r\n" + "        \"taxId\" : \"0107536000986\",\r\n"
			+ "        \"storeBranch\" : \"00000\",\r\n"
			+ "        \"nameEng\" : \"Kiatnakin Bank Public Company Limited\",\r\n"
			+ "        \"nameTh\" : \"ธนาคารเกียรตินาคิน จำกัด (มหาชน)\",\r\n"
			+ "        \"email\" : \"contact@kiatnakin.co.th\",\r\n" + "        \"telephone\" : \"02-1655555\",\r\n"
			+ "        \"fax\" : \"02-1655555\",\r\n" + "        \"addressInformation\" : {\r\n"
			+ "            \"addressLineOne\" : \"500 ถนนเพลินจิต\",\r\n"
			+ "            \"addressLineTwo\" : \"แขวงลุมพินี เขตปทุมวัน กรุงเทพมหานคร 10330\",\r\n"
			+ "            \"cityName\" : \"ปทุมวัน\",\r\n" + "            \"citySubDivision\" : \"ลุมพินี\",\r\n"
			+ "            \"postCode\" : \"10330\",\r\n"
			+ "            \"countrySubDivision\" : \"กรุงเทพมหานคร\",\r\n" + "            \"countryName\" : \"TH\"\r\n"
			+ "        }\r\n" + "    }\r\n" + "]";

	@Test
	public void GenerateObjectToJson() {
		JsonConverter jsc = new JsonConverter();
		SellerInformation sli = new SellerInformation();
		BuyerInformation bli = new BuyerInformation();
		TaxInvoiceModel tax = new TaxInvoiceModel();
		AddressInformation sellerAddressInfo = new AddressInformation();
		AddressInformation buyerAddressInfo = new AddressInformation();

		// Set seller address
		sellerAddressInfo.setAddressLineOne("สำนักงานใหญ่ เลขที่ 313/1");
		sellerAddressInfo.setAddressLineTwo("ถนนรัชดาภิเษก แขวงบุคลโล เขตธนบุรี กรุงเทพมหานคร 10600");
		sellerAddressInfo.setCityName("ธนบุรี");
		sellerAddressInfo.setCitySubDivision("บุคคโล");
		sellerAddressInfo.setPostCode("10600");
		sellerAddressInfo.setCountrySubDivision("กรุงเทพมหานคร");
		sellerAddressInfo.setCountryName("TH");
		// Set buyer address
		buyerAddressInfo.setAddressLineOne("500 ถนนเพลินจิต");
		buyerAddressInfo.setAddressLineTwo("แขวงลุมพินี เขตปทุมวัน กรุงเทพมหานคร 10330");
		buyerAddressInfo.setCityName("ปทุมวัน");
		buyerAddressInfo.setCitySubDivision("ลุมพินี");
		buyerAddressInfo.setPostCode("10330");
		buyerAddressInfo.setCountrySubDivision("กรุงเทพมหานคร");
		buyerAddressInfo.setCountryName("TH");
		// Set buyer informations
		bli.setTaxId("0107536000986");
		bli.setStoreBranch("00000");
		bli.setNameEng("Kiatnakin Bank Public Company Limited");
		bli.setNameTh("ธนาคารเกียรตินาคิน จำกัด (มหาชน)");
		bli.setEmail("contact@kiatnakin.co.th");
		bli.setTelephone("02-1655555");
		bli.setFax("02-1655555");
		bli.setAddressInformation(buyerAddressInfo);
		// Set seller informations
		sli.setTaxId("INV-123456");
		sli.setBranch("00000");
		sli.setNameEng("Beedle");
		sli.setNameTh("ไทยแลนด์");
		sli.setEmail("hello@mail.com");
		sli.setTelephone("06-5507-9511");
		sli.setFax("06-5507-9511");
		sli.setAddressInformation(sellerAddressInfo);
		// Add to Tax invoice model
		tax.setItem(bli, sli);
		// Assert.assertEquals(jsc.toJson(tax.getItem()), JSON_EXAMPLE);

		// System.out.println(jsc.toJson(tax.getItem()));
		System.out.println(jsc.toJson(tax));
	}
}
