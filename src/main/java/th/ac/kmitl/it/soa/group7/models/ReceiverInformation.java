package th.ac.kmitl.it.soa.group7.models;

import lombok.Data;

public @Data class ReceiverInformation {
	private String id;
	private String name;
	private String branch;
	private String email;
	private String telePhone;
	private AddressInformation addressInformation;
}
