package th.ac.kmitl.it.soa.group7;

import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.*;
import th.ac.kmitl.it.soa.group7.definitions.TaxType;
import th.ac.kmitl.it.soa.group7.models.TaxInfomation;

public class TaxInfomationTest {
    private TaxInfomation taxInfomation;
    
    @Before
    public void setup(){
        taxInfomation = new TaxInfomation();
    }
    
    @Test
    public void taxInfomationGetSetTest(){
        taxInfomation.setTaxCode(TaxType.VALUE_ADDED_TAX.getTaxCode());
        taxInfomation.setCalculatedRate(7);
        taxInfomation.setBasisAmount("1000.00");
        
        assertEquals(taxInfomation.getTaxCode(), "VAT");
        assertEquals(taxInfomation.getCalculatedRate(), 7);
        assertEquals(taxInfomation.getBasisAmount(), "1000.00");
    }
    
}
