package th.ac.kmitl.it.soa.group7.models.xml;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import lombok.Builder;

@Builder
@JacksonXmlRootElement(localName = "ram:IndividualTradeProductInstance")
public class IndividualTradeProductInstanceXML {
	@JacksonXmlProperty(localName = "ram:BatchID")
	public String batchId;
	@JacksonXmlProperty(localName = "ram:ExpiryDateTime")
	public String expiryDateTime;
}