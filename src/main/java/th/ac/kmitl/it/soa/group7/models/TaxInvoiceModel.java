package th.ac.kmitl.it.soa.group7.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder;
import th.ac.kmitl.it.soa.group7.models.json.NoteJson;

@Builder
public class TaxInvoiceModel {
	@JsonProperty("number")
	private String taxNumber;

	@JsonProperty("seller")
	private SellerInformation sellerInformation;

	@JsonProperty("buyer")
	private BuyerInformation buyerInfo;

	@JsonProperty("transaction_date")
	private Object transactionDate;

	@JsonProperty("note")
	private NoteJson note;

	@JsonProperty("items")
	private Object items;
}