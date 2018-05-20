package th.ac.kmitl.it.soa.group7;

import org.junit.Test;

import static org.junit.Assert.*;
import th.ac.kmitl.it.soa.group7.definitions.TaxType;

public class TaxTypeTest {
    @Test
    public void taxTypeGetTest(){
        assertEquals(TaxType.BUSINESS_LICENSE_FEE.getTaxCode(), "LAC");
        assertEquals(TaxType.BUSINESS_LICENSE_FEE.getTaxName(), "Business license fee");
        assertEquals(TaxType.VALUE_ADDED_TAX.getTaxCode(), "VAT");
        assertEquals(TaxType.VALUE_ADDED_TAX.getTaxName(), "Value added tax");
        assertEquals(TaxType.STATE_PROVINCIAL_SALES_TAX.getTaxCode(), "STT");
        assertEquals(TaxType.STATE_PROVINCIAL_SALES_TAX.getTaxName(), "State/provincial sales tax");
    }
    
}
