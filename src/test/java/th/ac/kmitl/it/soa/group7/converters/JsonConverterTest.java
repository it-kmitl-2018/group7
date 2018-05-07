package th.ac.kmitl.it.soa.group7.converters;

import com.fasterxml.jackson.annotation.JsonProperty;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import th.ac.kmitl.it.soa.group7.converters.JsonConverter;


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

        Assert.assertEquals(json, jsonConverter.toJson(new Json()));
    }
}