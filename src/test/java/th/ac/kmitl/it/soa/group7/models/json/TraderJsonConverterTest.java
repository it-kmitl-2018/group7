package th.ac.kmitl.it.soa.group7.models.json;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TraderTest {

    private String taxNumber = "0105522022883";
    private String branchNumber = "00000";
    private String nameEn = "TOYOTA THONBURI CO, LTD.";
    private String nameTh = "บริษัท โตโยต้า ธนบุรี จำกัด";
    private String email = "sales@toyotathonburi.com";
    private String telephone = "02-4799009";
    private String fax = "02-4799009";
    private AddressJsonConverter address = AddressJsonConverter.builder().build();

    @Test
    public void shouldGetAllInfo() {
        TraderJsonConverter trader = TraderJsonConverter.builder()
                .taxNumber(this.taxNumber)
                .branchNumber(this.branchNumber)
                .nameEn(this.nameEn)
                .nameTh(this.nameTh)
                .email(this.email)
                .telephone(this.telephone)
                .fax(this.fax)
                .address(this.address)
                .build();

        assertEquals(this.taxNumber, trader.taxNumber);
        assertEquals(this.branchNumber , trader.branchNumber);
        assertEquals(this.nameEn , trader.nameEn);
        assertEquals(this.nameTh , trader.nameTh);
        assertEquals(this.email , trader.email);
        assertEquals(this.telephone , trader.telephone);
        assertEquals(this.fax , trader.fax);
        assertEquals(this.address , trader.address);
    }