package th.ac.kmitl.it.soa.group7;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.fasterxml.jackson.annotation.JsonProperty;

import th.ac.kmitl.it.soa.group7.converters.JsonConverter;

public class GenerateJsonTests {
	private class Json {

        @JsonProperty("strings")
        private List<String> strings = Arrays.asList("a", "b", "c");
    }
	
	@Test
	public void GenerateObjectToJson() {
		JsonConverter jasonConverter = new JsonConverter();
		Assert.assertEquals(jasonConverter.toJson("seller, A, B, C"), '"' + "seller, A, B, C" + '"');
	}
	
    @Test
    public void shouldGetCorrectJson() {
    	String json =
                "{\n" +
                "    \"strings\" : [\n" +
                "        \"a\",\n" +
                "        \"b\",\n" +
                "        \"c\"\n" +
                "    ]\n" +
                "}";
        JsonConverter jsonConverter = new JsonConverter();
        Assert.assertEquals(json, jsonConverter.toJson(new Json()));
    }
}
