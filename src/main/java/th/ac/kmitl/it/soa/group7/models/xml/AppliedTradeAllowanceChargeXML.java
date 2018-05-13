package th.ac.kmitl.it.soa.group7.models.xml;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Builder;

@Builder
@JacksonXmlRootElement(localName = "ram:AppliedTradeAllowanceCharge")
public class AppliedTradeAllowanceChargeXML {
	@JacksonXmlProperty(localName = "ram:ChargeIndicator")
	public boolean chargeIndicator;
	@JacksonXmlProperty(localName = "ram:ActualAmount")
	public String actualAmount;
	@JacksonXmlProperty(localName = "ram:ReasonCode")
	public String reasonCode;
	@JacksonXmlProperty(localName = "ram:Reason")
	public String reason;
}