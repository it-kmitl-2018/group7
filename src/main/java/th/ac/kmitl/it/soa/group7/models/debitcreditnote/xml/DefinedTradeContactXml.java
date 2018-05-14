package th.ac.kmitl.it.soa.group7.models.debitcreditnote.xml;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import lombok.Builder;

@Builder
@JacksonXmlRootElement(localName = "ram:DefinedTradeContact")
public class DefinedTradeContactXml {
	@JacksonXmlProperty(localName = "ram:PersonName")
	public String personName;
	@JacksonXmlProperty(localName = "ram:DepartmentName")
	public String departmentName;
}