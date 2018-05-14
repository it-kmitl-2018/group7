package th.ac.kmitl.it.soa.group7.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TelephoneModelTest {

    private String phoneNumber = "0812345678";

    @Test
    public void shoudGetItAllInfo() {
        TelephoneModel telephoneUniversalModel
                = new TelephoneModel();
        telephoneUniversalModel.setPhoneNumber(phoneNumber);

        assertEquals(this.phoneNumber,
                telephoneUniversalModel.getPhoneNumber());
    }
}
