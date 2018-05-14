package th.ac.kmitl.it.soa.group7;

import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.*;
import th.ac.kmitl.it.soa.group7.models.ProductInfomation;

public class ProductInfomationTest {
    ProductInfomation productInfomation;
    
    @Before
    public void setup(){
        productInfomation = new ProductInfomation();
    }
    
    @Test
    public void productInfomationGetSetTest(){
        productInfomation.setProductId("ABCDEFG1234556");
        productInfomation.setProductGlobalId("12345678901234");
        productInfomation.setProductName("BeggingForPass");
        productInfomation.setProductBatchId("14052561");
        productInfomation.setProductExpiryDateTime("2018-05-15T00:00:00");
        productInfomation.setProductOriginCountryId("TH");
        
        assertEquals(productInfomation.getProductId(), "ABCDEFG1234556");
        assertEquals(productInfomation.getProductGlobalId(), "12345678901234");
        assertEquals(productInfomation.getProductName(), "BeggingForPass");
        assertEquals(productInfomation.getProductBatchId(), "14052561");
        assertEquals(productInfomation.getProductExpiryDateTime(), "2018-05-15T00:00:00");
        assertEquals(productInfomation.getProductOriginCountryId(), "TH");
    }
}