package th.ac.kmitl.it.soa.group7.models.xml;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import lombok.Builder;

@Builder
@JacksonXmlRootElement(localName = "ram:SellerTradeParty")
public class InvoiceeTradePartyXml {
	@JacksonXmlProperty(localName = "ram:ID")
	public String id;
	@JacksonXmlProperty(localName = "ram:GlobalID")
	public String globalId;
	@JacksonXmlProperty(localName = "ram:Name")
	public String name;

}