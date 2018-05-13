package th.ac.kmitl.it.soa.group7.forms;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class SellerForm {

    private String id;
    private String globalId;
    private String name;
    private String taxRegistrationId;
    private String branchId;
    private String email;
    private String building;
    private String buildingNumber;
    private String soi;
    private String village;
    private String moo;
    private String streetName;
    private String citySub;
    private String city;
    private String countrySub;
    private String country;
    private String postCode;
}