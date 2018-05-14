package th.ac.kmitl.it.soa.group7.models;

import lombok.Data;

public @Data class BuyerInformation {
	private String taxId;
	private String storeBranch;
	private String nameEng;
	private String nameTh;
	private String email;
	private String telephone;
	private String fax;
}