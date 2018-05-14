package th.ac.kmitl.it.soa.group7.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;

@Builder
public class BuyerInformation {

	@JsonProperty("tax_number")
	public String taxId;

	@JsonProperty("branch_number")
	public String storeBranch;

	@JsonProperty("name_en")
	public String nameEng;

	@JsonProperty("name_th")
	public String nameTh;

	@JsonProperty("email")
	public String email;

	@JsonProperty("telephone")
	public String telephone;

	@JsonProperty("fax")
	public String fax;

	@JsonProperty("address")
	public AddressInformation addressInformation;
}