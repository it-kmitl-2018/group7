package th.ac.kmitl.it.soa.group7.models.json;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import th.ac.kmitl.it.soa.group7.converters.JsonConverter;

class AddressJsonTest {

    private String lineOne = "สำนักงานใหญ่ เลขที่ 313/1";
    private String lineTwo = "ถนนรัชดาภิเษก แขวงบุคลโล เขตธนบุรี กรุงเทพมหานคร 10600";
    private String cityName = "ธนบุรี";
    private String citySubDivisionName = "บุคคโล";
    private String postCode = "10600";
    private String countrySubDivision = "กรุงเทพมหานคร";
    private String countryCode = "TH";

    @Test
    public void shouldGetAllInfo() {
        AddressJson address = AddressJson.builder()
                .lineOne(this.lineOne)
                .lineTwo(this.lineTwo)
                .cityName(this.cityName)
                .citySubDivisionName(this.citySubDivisionName)
                .postCode(this.postCode)
                .countrySubDivision(this.countrySubDivision)
                .countryCode(this.countryCode)
                .build();

        assertEquals(this.lineOne, address.lineOne);
        assertEquals(this.lineTwo, address.lineTwo);
        assertEquals(this.cityName, address.cityName);
        assertEquals(this.citySubDivisionName, address.citySubDivisionName);
        assertEquals(this.postCode, address.postCode);
        assertEquals(this.countrySubDivision, address.countrySubDivision);
        assertEquals(this.countryCode, address.countryCode);
    }

    @Test
    public void shouldGetCorrectJson() {

        AddressJson address = AddressJson.builder()
                .lineOne(this.lineOne)
                .lineTwo(this.lineTwo)
                .cityName(this.cityName)
                .citySubDivisionName(this.citySubDivisionName)
                .postCode(this.postCode)
                .countrySubDivision(this.countrySubDivision)
                .countryCode(this.countryCode)
                .build();

        String expectedJsonString
                = "{\n"
                + "    \"line_one\": \"สำนักงานใหญ่ เลขที่ 313/1\",\n"
                + "    \"line_two\": \"ถนนรัชดาภิเษก แขวงบุคลโล เขตธนบุรี "
                + "กรุงเทพมหานคร 10600\",\n"
                + "    \"city_name\": \"ธนบุรี\",\n"
                + "    \"city_sub_division_name\": \"บุคคโล\",\n"
                + "    \"post_code\": \"10600\",\n"
                + "    \"country_sub_division\": \"กรุงเทพมหานคร\",\n"
                + "    \"country_name\": \"TH\"\n"
                + "}";

        JsonConverter jsonConverter = new JsonConverter();

        assertEquals(expectedJsonString, jsonConverter.toJson(address));
    }

}
