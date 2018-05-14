package th.ac.kmitl.it.soa.group7.models;

import lombok.Data;

@Data
public class ProductInfomation {
    private String productId;
    private String productGlobalId;
    private String productName;
    private String productBatchId;
    private String productExpiryDateTime;
    private String productOriginCountryId;
}
