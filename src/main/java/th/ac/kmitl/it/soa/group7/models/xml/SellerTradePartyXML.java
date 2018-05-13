package th.ac.kmitl.it.soa.group7.models.xml;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Builder;

@Builder
public class SellerTradePartyXML {
	@JacksonXmlProperty(localName = "ram:SellerTradeParty")
	public String id;
	@JacksonXmlProperty(localName = "ram:GlobalID")
	public String globalId;
	@JacksonXmlProperty(localName = "ram:Name")
	public String name;
}
