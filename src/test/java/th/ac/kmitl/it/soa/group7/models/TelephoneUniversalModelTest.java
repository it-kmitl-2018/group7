package th.ac.kmitl.it.soa.group7.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TelephoneUniversalModelTest {

    private String phoneNumber = "0812345678";

    @Test
    public void shoudGetItAllInfo() {
        TelephoneUniversalModel telephoneUniversalModel
                = new TelephoneUniversalModel();
        telephoneUniversalModel.setPhoneNumber(phoneNumber);

        assertEquals(this.phoneNumber,
                telephoneUniversalModel.getPhoneNumber());
    }
}
