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
        referenceDocumentModel.setReferenceDocId("ABCDEFGHIJKLMNOPQRST123456789012345");
        assertEquals("ABCDEFGHIJKLMNOPQRST123456789012345", referenceDocumentModel.getReferenceDocId());
    }
    
    @Test
    private void referenceDocDateNullTest(){
        assertNull(referenceDocumentModel.getReferenceDocDate());
    }
    
    @Test
    private void referenceDocDateGetTest(){
        referenceDocumentModel.setReferenceDocDate("2002-07-21T08:35:30");
        assertEquals("2002-07-21T08:35:30", referenceDocumentModel.getReferenceDocDate());
    }
    
    @Test
    private void referenceDocTypeCodeNullTest(){
        assertNull(referenceDocumentModel.getReferenceDocTypeCode());
    }
    
    @Test
    private void referenceDocTypeCodeGetTest(){
        referenceDocumentModel.setReferenceDocTypeCode("ALQ");
        assertEquals("ALQ", referenceDocumentModel.getReferenceDocTypeCode());
    }
}
