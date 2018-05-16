package th.ac.kmitl.it.soa.group7;

import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.*;
import th.ac.kmitl.it.soa.group7.models.AllowanceChargeInfomation;

public class AllowanceChargeInfomationTest {
    AllowanceChargeInfomation allowanceChargeInfomation;
    
    @Before
    public void setup(){
        allowanceChargeInfomation = new AllowanceChargeInfomation();
    }
    
    @Test
    public void allowanceChargeInfomationGetTest(){
        allowanceChargeInfomation.setChargeIndicator(true);
        allowanceChargeInfomation.setActualAmount("250.00");
        allowanceChargeInfomation.setAllowanceTypeCode(95);
        
        assertTrue(allowanceChargeInfomation.getChargeIndicator());
        assertEquals(allowanceChargeInfomation.getActualAmount(), "250.00");
        assertEquals(allowanceChargeInfomation.getAllowanceTypeCode(), 95);
    }
}
