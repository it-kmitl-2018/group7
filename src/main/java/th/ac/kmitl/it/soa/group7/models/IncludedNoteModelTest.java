package th.ac.kmitl.it.soa.group7.models;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IncludedNoteModelTest {
    private IncludedNoteModel includedNoteModel;
    
    @Before
    public void setup(){
        includedNoteModel = new IncludedNoteModel();
    }
    
    @Test
    public void includedNoteNotNullTest(){
        assertNotNull(includedNoteModel);
    }
    
    @Test
    public void includedNoteNullTest(){
        assertNull(includedNoteModel.getNoteSubject());
        assertNull(includedNoteModel.getNoteContent());
    }
    
    @Test
    public void includedNoteGetSetTest(){
        includedNoteModel.setNoteSubject("ขายสนามหญ้า");
        includedNoteModel.setNoteContent("รายละเอียด");
        
        assertEquals("ขายสนามหญ้า", includedNoteModel.getNoteSubject());
        assertEquals("รายละเอียด", includedNoteModel.getNoteContent());
    }
    
}
