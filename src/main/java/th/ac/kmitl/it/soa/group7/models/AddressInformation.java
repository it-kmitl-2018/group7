package th.ac.kmitl.it.soa.group7.models;

import lombok.Data;

public @Data class AddressInformation {
	private String addressLineOne;
	private String addressLineTwo;
	private String cityName;
	private String citySubDivision;
	private String postCode;
	private String countrySubDivision;
	private String countryName;
}
