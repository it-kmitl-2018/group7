package th.ac.kmitl.it.soa.group7.models.xml;

import org.junit.Assert;
import org.junit.Test;

public class PostalTradeAddressXmlTests {
    public String postCode = "10330";
    public String buildingName = "บริษัทตั้งใจทำงาน จำกัด";
    public String lineOne = "บริษัทตั้งใจทำงาน จำกัด";
    public String lineTwo = "";
    public String lineThree = "จุฬาซอย 10";
    public String lineFour = "หมู่บ้านสู้สู้พาร์ควิลล์";
    public String lineFive = "หมู่ที่ 9";
    public String streetName = "พระราม 6";
    public String cityName = "1004";
    public String citySubDivisionName = "100402";
    public String countryId = "TH";
    public String countrySubDivisionId = "10";
    public String buildingNumber = "799/89";

	@Test
	public void shouldGetCorrectXml() {
		PostalTradeAddressXml shipToTradeParty = PostalTradeAddressXml.builder()
				.postCode(postCode)
				.buildingName(buildingName)
				.lineOne(lineOne)
				.lineTwo(lineTwo)
				.lineThree(lineThree)
				.lineFour(lineFour)
				.lineFive(lineFive)
				.streetName(streetName)
				.cityName(cityName)
				.citySubDivisionName(citySubDivisionName)
				.countryId(countryId)
				.countrySubDivisionId(countrySubDivisionId)
				.buildingNumber(buildingNumber)
				.build();

		Assert.assertEquals(this.postCode, shipToTradeParty.postCode);
		Assert.assertEquals(this.buildingName, shipToTradeParty.buildingName);
		Assert.assertEquals(this.lineOne, shipToTradeParty.lineOne);
		Assert.assertEquals(this.lineTwo, shipToTradeParty.lineTwo);
		Assert.assertEquals(this.lineThree, shipToTradeParty.lineThree);
		Assert.assertEquals(this.lineFour, shipToTradeParty.lineFour);
		Assert.assertEquals(this.lineFive, shipToTradeParty.lineFive);
		Assert.assertEquals(this.streetName, shipToTradeParty.streetName);
		Assert.assertEquals(this.cityName, shipToTradeParty.cityName);
		Assert.assertEquals(this.citySubDivisionName, shipToTradeParty.citySubDivisionName);
		Assert.assertEquals(this.countryId, shipToTradeParty.countryId);
		Assert.assertEquals(this.countrySubDivisionId, shipToTradeParty.countrySubDivisionId);
		Assert.assertEquals(this.buildingNumber, shipToTradeParty.buildingNumber);
		
	}
}
