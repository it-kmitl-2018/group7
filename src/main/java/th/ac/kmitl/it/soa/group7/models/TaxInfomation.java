package th.ac.kmitl.it.soa.group7.models;

import lombok.Data;

@Data
public class TaxInfomation {
    private String taxCode;
    private int calculatedRate;
    private String basisAmount;
}
