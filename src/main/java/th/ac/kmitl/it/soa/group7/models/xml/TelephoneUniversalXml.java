package th.ac.kmitl.it.soa.group7.models.xml;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import lombok.Builder;

@Builder
@JacksonXmlRootElement(localName = "ram:TelephoneUniversalXml")
public class TelephoneUniversalXml {
	@JacksonXmlProperty(localName = "ram:PhoneNumber")
	public String phoneNumber ;
}
