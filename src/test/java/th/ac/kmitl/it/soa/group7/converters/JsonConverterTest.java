package th.ac.kmitl.it.soa.group7.converters;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JsonConverterTest {

    private class Json {

        @JsonProperty("strings")
        private List<String> strings = Arrays.asList("a", "b", "c");
    }

    private String json =
            "{\n" +
            "    \"strings\" : [\n" +
            "        \"a\",\n" +
            "        \"b\",\n" +
            "        \"c\"\n" +
            "    ]\n" +
            "}";

    @Test
    public void shouldGetCorrectJson() {
        JsonConverter jsonConverter = new JsonConverter();

        assertEquals(json, jsonConverter.toJson(new Json()));
    }
}