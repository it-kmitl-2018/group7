package th.ac.kmitl.it.soa.group7.models.xml;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import lombok.Builder;

@Builder
@JacksonXmlRootElement(localName = "ram:EmailURIUniversalCommunication")
public class EmailURIUniversalCommunicationXml {
	@JacksonXmlProperty(localName = "ram:URIID")
	public String uriId;
}
