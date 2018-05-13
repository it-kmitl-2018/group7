package th.ac.kmitl.it.soa.group7.models.json;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import th.ac.kmitl.it.soa.group7.converters.JsonConverter;

class ItemJsonConverterTest {

    private String description = "Toyota Fortuner 3.0V AT 2014 TRD สีเทา ดีเซล 3,000 cc. เกียร์ออโต้";
    private int quantity = 1;
    private float pricePerItem = 3990000;
    private boolean haveVat = true;
    private float vatRate = 0.07f;

    @Test
    public void shouldGetAllInfo() {
        ItemJsonConverter item = ItemJsonConverter.builder()
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

    @Test
    public void shouldGetCorrectJson() {

        ItemJsonConverter item = ItemJsonConverter.builder()
                .description(this.description)
                .quantity(this.quantity)
                .pricePerItem(this.pricePerItem)
                .haveVat(this.haveVat)
                .vatRate(this.vatRate)
                .build();

        String json
                = "{\n"
                + "    \"description\": \"Toyota Fortuner 3.0V AT 2014 "
                + "TRD สีเทา ดีเซล 3,000 cc. เกียร์ออโต้\",\n"
                + "    \"quantity\": 1,\n"
                + "    \"price_per_item\": 3990000,\n"
                + "    \"have_vat\": true,\n"
                + "    \"vat_rate\": 0.07\n"
                + "}";

        JsonConverter jsonConverter = new JsonConverter();

        assertEquals(json, jsonConverter.toJson(item));
    }

}
