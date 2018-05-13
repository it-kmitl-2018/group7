package th.ac.kmitl.it.soa.group7.models.xml;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import lombok.Builder;

@Builder
@JacksonXmlRootElement(localName = "ram:DefinedTradeContact")
public class DefinedTradeContact {
	@JacksonXmlProperty(localName = "ram:PersonName")
	public String personName;
	@JacksonXmlProperty(localName = "ram:DepartmentName")
	public String departmentName;
}
