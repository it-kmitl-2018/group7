package th.ac.kmitl.it.soa.group7.models.xml;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Builder;

@Builder
@JacksonXmlRootElement(localName = "ram:IncludedNote")
public class InformationNoteXML {
	@JacksonXmlProperty(localName = "ram:Subject")
	public String subject;
	@JacksonXmlProperty(localName = "ram:Content")
	public String content;
}