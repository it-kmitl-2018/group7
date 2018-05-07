package th.ac.kmitl.it.soa.group7.models.json;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemTest {

    private String description = "Toyota Fortuner 3.0V AT 2014 TRD สีเทา ดีเซล 3,000 cc. เกียร์ออโต้";
    private int quantity = 1;
    private float pricePerItem = 3990000;
    private boolean haveVat = true;
    private float vatRate = 0.07f;

    @Test
    public void shouldGetAllInfo() {
        Item item = Item.builder()
                .description(this.description)
                .quantity(this.quantity)
                .pricePerItem(this.pricePerItem)
                .haveVat(this.haveVat)
                .vatRate(this.vatRate)
                .build();

        assertEquals(this.description, item.description);
        assertEquals(this.quantity, item.quantity);
        assertEquals(this.pricePerItem, item.pricePerItem);
        assertEquals(this.haveVat, item.haveVat);
        assertEquals(this.vatRate, item.vatRate);
    }
}