package th.ac.kmitl.it.soa.group7.models.json;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddressTest {

    private String lineOne = "สำนักงานใหญ่ เลขที่ 313/1";
    private String lineTwo = "ถนนรัชดาภิเษก แขวงบุคลโล เขตธนบุรี กรุงเทพมหานคร 10600";
    private String cityName = "ธนบุรี";
    private String citySubDivisionName = "บุคคโล";
    private String postCode = "10600";
    private String countrySubDivision = "กรุงเทพมหานคร";
    private String countryName = "TH";

    @Test
    public void shouldGetAllInfo() {
        Address address = Address.builder()
                .lineOne(this.lineOne)
                .lineTwo(this.lineTwo)
                .cityName(this.cityName)
                .citySubDivisionName(this.citySubDivisionName)
                .postCode(this.postCode)
                .countrySubDivision(this.countrySubDivision)
                .countryName(this.countryName)
                .build();

        assertEquals(this.lineOne , address.lineOne);
        assertEquals(this.lineTwo , address.lineTwo);
        assertEquals(this.cityName , address.cityName);
        assertEquals(this.citySubDivisionName , address.citySubDivisionName);
        assertEquals(this.postCode , address.postCode);
        assertEquals(this.countrySubDivision , address.countrySubDivision);
        assertEquals(this.countryName , address.countryName);
    }
}