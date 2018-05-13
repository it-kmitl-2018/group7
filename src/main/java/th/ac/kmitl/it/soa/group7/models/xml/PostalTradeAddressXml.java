package th.ac.kmitl.it.soa.group7.models.xml;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Builder;

import java.sql.Timestamp;

@Builder
public class PostalTradeAddressXml {

    @JacksonXmlProperty(localName = "postCode")
    public String postCode;

    @JacksonXmlProperty(localName = "buildingName")
    public String buildingName;

    @JacksonXmlProperty(localName = "lineOne")
    public String lineOne;

    @JacksonXmlProperty(localName = "lineTwo")
    public String lineTwo;

    @JacksonXmlProperty(localName = "lineThree")
    public String lineThree;

    @JacksonXmlProperty(localName = "lineFour")
    public String lineFour;

    @JacksonXmlProperty(localName = "lineFive")
    public String lineFive;

    @JacksonXmlProperty(localName = "streetName")
    public String streetName;

    @JacksonXmlProperty(localName = "cityName")
    public String cityName;

    @JacksonXmlProperty(localName = "citySubDivisionName")
    public String citySubDivisionName;
    
    @JacksonXmlProperty(localName = "countryId")
    public String countryId;
    
    @JacksonXmlProperty(localName = "countrySubDivisionId")
    public String countrySubDivisionId;
    
    @JacksonXmlProperty(localName = "buildingNumber")
    public String buildingNumber;
}
