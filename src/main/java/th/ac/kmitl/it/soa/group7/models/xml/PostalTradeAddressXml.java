package th.ac.kmitl.it.soa.group7.models.xml;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import lombok.Builder;


@Builder
@JacksonXmlRootElement(localName = "ram:PostalTradeAddress")
public class PostalTradeAddressXml {

    @JacksonXmlProperty(localName = "ram:PostCode")
    public String postCode;

    @JacksonXmlProperty(localName = "ram:BuildingName")
    public String buildingName;

    @JacksonXmlProperty(localName = "ram:LineOne")
    public String lineOne;

    @JacksonXmlProperty(localName = "ram:LineTwo")
    public String lineTwo;

    @JacksonXmlProperty(localName = "ram:LineThree")
    public String lineThree;

    @JacksonXmlProperty(localName = "ram:LineFour")
    public String lineFour;

    @JacksonXmlProperty(localName = "ram:LineFive")
    public String lineFive;

    @JacksonXmlProperty(localName = "ram:StreetName")
    public String streetName;

    @JacksonXmlProperty(localName = "ram:CityName")
    public String cityName;

    @JacksonXmlProperty(localName = "ram:CitySubDivisionName")
    public String citySubDivisionName;
    
    @JacksonXmlProperty(localName = "ram:CountryIDschemeID=\"3166-1 alpha-2\"")
    public String countryId;
    
    @JacksonXmlProperty(localName = "ram:CountrySubDivisionID")
    public String countrySubDivisionId;
    
    @JacksonXmlProperty(localName = "ram:BuildingNumber")
    public String buildingNumber;
}
