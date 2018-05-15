package th.ac.kmitl.it.soa.group7.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AssociatedDocumentModelTest {
    
    private String lineID = "1";

    @Test
    public void shoudGetItAllInfo() {
        AssociatedDocumentModel associatedDocumentModel
                = new AssociatedDocumentModel();
        associatedDocumentModel.setLineID(lineID);

        assertEquals(this.lineID,
                associatedDocumentModel.getLineID());
    }
    
}
