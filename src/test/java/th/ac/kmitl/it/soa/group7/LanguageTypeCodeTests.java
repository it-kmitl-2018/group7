package th.ac.kmitl.it.soa.group7;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Assert;
import org.junit.Test;

import th.ac.kmitl.it.soa.group7.definitions.LanguageTypeCode;

public class LanguageTypeCodeTests {
	@Test
	public void LanguageTypeCodeOutputMatchTest() {
		Assert.assertEquals(LanguageTypeCode.THAI.getLanguageCode(), "tha");
		Assert.assertEquals(LanguageTypeCode.ENGLISH.getLanguageCode(), "eng");
		Assert.assertEquals(LanguageTypeCode.CHINESE.getLanguageCode(), "chi");
		Assert.assertEquals(LanguageTypeCode.JAPAN.getLanguageCode(), "jpn");
		Assert.assertEquals(LanguageTypeCode.SPAIN.getLanguageCode(), "spa");
		Assert.assertEquals(LanguageTypeCode.GERMAN.getLanguageCode(), "ger");
	}

	@Test
	public void shouldThrowIllegalArgumentExceptionWhenParsingNotExistedCode() {
		IllegalArgumentException e = assertThrows(IllegalArgumentException.class,
				() -> LanguageTypeCode.parse("Fighting!!"));
		assertThat(e.getMessage(), containsString("LanguageCode not exist"));
	}
}
