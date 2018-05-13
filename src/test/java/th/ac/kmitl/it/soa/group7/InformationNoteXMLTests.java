package th.ac.kmitl.it.soa.group7;

import org.junit.Assert;
import org.junit.Test;

import th.ac.kmitl.it.soa.group7.models.xml.InformationNoteXML;

public class InformationNoteXMLTests {
	public String subject = "SalesCoupon";
	public String content = "SalesUpto 50%";

	@Test
	public void shouldGetCorrectXML() {
		InformationNoteXML informationNote = InformationNoteXML.builder().subject(subject).content(content).build();

		Assert.assertEquals(informationNote.subject, this.subject);
		Assert.assertEquals(informationNote.content, this.content);
	}
}