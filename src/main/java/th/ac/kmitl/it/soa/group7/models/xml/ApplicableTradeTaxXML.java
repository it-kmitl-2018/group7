package th.ac.kmitl.it.soa.group7.models.xml;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import lombok.Builder;
import th.ac.kmitl.it.soa.group7.definitions.DocumentType;

@Builder
@JacksonXmlRootElement(localName = "ram:ApplicableTradeTax")
public class ApplicableTradeTaxXML {
	@JacksonXmlProperty(localName = "ram:TypeCode")
	public DocumentType documentType;
	@JacksonXmlProperty(localName = "ram:CalculatedRate")
	public String calculatedRate;
	@JacksonXmlProperty(localName = "ram:BasisAmount")
	public String basisAmount;
	@JacksonXmlProperty(localName = "ram:CalculatedAmount")
	public String calculatedAmount;
}