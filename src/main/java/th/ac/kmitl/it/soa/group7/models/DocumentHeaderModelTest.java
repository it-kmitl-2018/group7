package th.ac.kmitl.it.soa.group7.models;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DocumentHeaderModelTest {
    private DocumentHeaderModel documentHeaderModel;
    
    @Before
    public void setup(){
        documentHeaderModel = new DocumentHeaderModel();
    }
    
    @Test
    public void documentHeaderNotNullTest(){
        assertNotNull(documentHeaderModel);
    }
    
    @Test
    public void documentHeaderNullTest(){
        assertNull(documentHeaderModel.getDoccumentId());
        assertNull(documentHeaderModel.getDoccumentName());
        assertNull(documentHeaderModel.getDoccumentTypeCode());
        assertNull(documentHeaderModel.getDoccumentIssueDate());
        assertNull(documentHeaderModel.getDoccumentPurpose());
        assertNull(documentHeaderModel.getDoccumentPurposeId());
        assertNull(documentHeaderModel.getDoccumentGlobalId());
        assertNull(documentHeaderModel.getDoccumentCreateDate());
    }
    
    @Test
    public void documentHeaderGetSetTest(){
        documentHeaderModel.setDoccumentId("380");
        documentHeaderModel.setDoccumentName("ใบแจ้งหนี้");
        documentHeaderModel.setDoccumentTypeCode("VAT");
        documentHeaderModel.setDoccumentIssueDate("2002-07-21T08:35:30");
        documentHeaderModel.setDoccumentPurpose("สินค้ำชำรุดเสียหาย");
        documentHeaderModel.setDoccumentPurposeId("001");
        documentHeaderModel.setDoccumentGlobalId("AIKWU123");
        documentHeaderModel.setDoccumentCreateDate("2000-08-21T08:35:30");
        
        assertEquals("380", documentHeaderModel.getDoccumentId());
        assertEquals("ใบแจ้งหนี้", documentHeaderModel.getDoccumentName());
        assertEquals("VAT", documentHeaderModel.getDoccumentTypeCode());
        assertEquals("2002-07-21T08:35:30", documentHeaderModel.getDoccumentIssueDate());
        assertEquals("สินค้ำชำรุดเสียหาย", documentHeaderModel.getDoccumentPurpose());
        assertEquals("001", documentHeaderModel.getDoccumentPurposeId());
        assertEquals("AIKWU123", documentHeaderModel.getDoccumentGlobalId());
        assertEquals("2000-08-21T08:35:30", documentHeaderModel.getDoccumentCreateDate());
    }
}
