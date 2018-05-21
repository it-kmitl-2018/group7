package th.ac.kmitl.it.soa.group7.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;

@Builder
public class TaxInvoiceModel {
	@JsonProperty("buyer")
	private BuyerInformation buyerInfo;
}