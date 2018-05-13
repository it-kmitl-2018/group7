package th.ac.kmitl.it.soa.group7.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmailURIUniversalModelTest {
    private String UriId = "58070040@kmitl.ac.th";

    @Test
    public void shoudGetItAllInfo() {
        EmailURIUniversalModel emailUriUniversalCommunication = 
                new EmailURIUniversalModel();
        emailUriUniversalCommunication.setUriId(UriId);

        assertEquals(this.UriId, emailUriUniversalCommunication.getUriId());
    }
}