package th.ac.kmitl.it.soa.group7.models;

import org.junit.Assert;
import org.junit.Test;

class AddressTest {

    private String postCode = "10330";
    private String buildingName = "";
    private String soi = "จุฬาซอย 10";
    private String village = "";
    private String moo = "";
    private String streetName = "พระราม 6";
    private String cityName = "1004";
    private String citySubDivisionName = "100402";
    private String countryId = "TH";
    private String countrySubDivisionId = "10";
    private String buildingNumber = "799/89";

    @Test
    public void shouldGetAllInfo() {
        Address address = new Address();
        address.setPostCode(this.postCode);
        address.setBuildingName(this.buildingName);
        address.setSoi(this.soi);
        address.setVillage(this.village);
        address.setMoo(this.moo);
        address.setStreetName(this.streetName);
        address.setCityName(this.cityName);
        address.setCitySubDivisionName(this.citySubDivisionName);
        address.setCountryId(this.countryId);
        address.setCountrySubDivisionId(this.countrySubDivisionId);
        address.setBuildingNumber(this.buildingNumber);

        Assert.assertEquals(this.postCode, address.getPostCode());
        Assert.assertEquals(this.buildingName, address.getBuildingName());
        Assert.assertEquals(this.soi, address.getSoi());
        Assert.assertEquals(this.village, address.getVillage());
        Assert.assertEquals(this.moo, address.getMoo());
        Assert.assertEquals(this.streetName, address.getStreetName());
        Assert.assertEquals(this.cityName, address.getCityName());
        Assert.assertEquals(this.citySubDivisionName, address.getCitySubDivisionName());
        Assert.assertEquals(this.countryId, address.getCountryId());
        Assert.assertEquals(this.countrySubDivisionId, address.getCountrySubDivisionId());
        Assert.assertEquals(this.buildingNumber, address.getBuildingNumber());
    }
}