package th.ac.kmitl.it.soa.group7.models;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReferenceDocumentModelTest {
    private ReferenceDocumentModel referenceDocumentModel;
    
    @Before
    private void setup(){
        referenceDocumentModel = new ReferenceDocumentModel();
    }
    
    @Test
    private void referenceDocNotNullTest(){
        assertNotNull(referenceDocumentModel);
    }
    
    @Test
    private void referenceDocNullTest(){
        assertNull(referenceDocumentModel);
    }
    
    @Test
    private void referenceDocIdNullTest(){
        assertNull(referenceDocumentModel.getReferenceDocId());
    }
    
    @Test
    private void referenceDocIdGetTest(){
        referenceDocumentModel.setReferenceDocId("sd13549");
        assertEquals("sd13549", referenceDocumentModel.getReferenceDocId());
    }
    
    @Test
    private void referenceDocDateNullTest(){
        assertNull(referenceDocumentModel.getReferenceDocDate());
    }
    
    @Test
    private void referenceDocDateGetTest(){
        referenceDocumentModel.setReferenceDocDate("25-12-2561");
        assertEquals("25-12-2561", referenceDocumentModel.getReferenceDocDate());
    }
    
    @Test
    private void referenceDocTypeCodeNullTest(){
        assertNull(referenceDocumentModel.getReferenceDocTypeCode());
    }
    
    @Test
    private void referenceDocTypeCodeGetTest(){
        referenceDocumentModel.setReferenceDocTypeCode("SDAJJ598743");
        assertEquals("SDAJJ598743", referenceDocumentModel.getReferenceDocTypeCode());
    }
}
