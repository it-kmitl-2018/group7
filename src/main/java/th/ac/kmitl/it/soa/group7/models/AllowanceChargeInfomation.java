package th.ac.kmitl.it.soa.group7.models;

import lombok.Data;

@Data
public class AllowanceChargeInfomation {
    private Boolean chargeIndicator;
    private String actualAmount;
    private int allowanceTypeCode;
}