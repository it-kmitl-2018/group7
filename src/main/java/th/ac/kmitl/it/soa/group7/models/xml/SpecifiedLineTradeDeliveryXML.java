package th.ac.kmitl.it.soa.group7.models.xml;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Builder;

@Builder
@JacksonXmlRootElement(localName = "ram:SpecifiedLineTradeDelivery")
public class SpecifiedLineTradeDeliveryXML {
	@JacksonXmlProperty(localName = "ram:BilledQuantity")
	public String billedQuantity;
	@JacksonXmlProperty(localName = "ram:PerPackageUnitQuantity")
	public String perPackageUnitQuantity;
}
