package th.ac.kmitl.it.soa.group7.models.xml;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Builder;

@Builder
public class SpecifiedTaxRegistrationXML {
	@JacksonXmlProperty(localName = "ram:SpecifiedTaxRegistration")
	public String id;
}
