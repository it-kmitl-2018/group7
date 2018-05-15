package th.ac.kmitl.it.soa.group7;

import org.junit.Assert;
import org.junit.Test;

import th.ac.kmitl.it.soa.group7.models.IncludedNote;

public class IncludedNoteTests {
	@Test
	public void AddressInformationOutputMatchTest() {
		IncludedNote noteInfo = new IncludedNote();
		noteInfo.setSubject("หมายเหตุ");
		noteInfo.setContent("\\n แบบรถ : Toyota Fortuner 3.0V AT 2014 TRD\\n เลขเครื่อง : 1KD-FTV\\n "
				+ "เลขตัวถัง : FN-83741\\n สี : สีเทา\\n");
		
		Assert.assertEquals(noteInfo.getSubject(), "หมายเหตุ");
		Assert.assertEquals(noteInfo.getContent(), "\\n แบบรถ : Toyota Fortuner 3.0V AT 2014 TRD\\n "
				+ "เลขเครื่อง : 1KD-FTV\\n เลขตัวถัง : FN-83741\\n สี : สีเทา\\n");
	}
	
}
