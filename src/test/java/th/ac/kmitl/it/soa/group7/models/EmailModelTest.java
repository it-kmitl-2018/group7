package th.ac.kmitl.it.soa.group7.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmailModelTest {
    private String UriId = "58070040@kmitl.ac.th";

    @Test
    public void shoudGetItAllInfo() {
        EmailModel emailURIUniversalModel = 
                new EmailModel();
        emailURIUniversalModel.setUriId(UriId);

        assertEquals(this.UriId, emailURIUniversalModel.getUriId());
    }
}