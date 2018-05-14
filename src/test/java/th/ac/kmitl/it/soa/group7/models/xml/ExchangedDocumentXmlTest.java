package th.ac.kmitl.it.soa.group7.models.xml;

import org.junit.Test;

import java.sql.Timestamp;

import static org.junit.Assert.assertEquals;
import th.ac.kmitl.it.soa.group7.definitions.DocumentType;

public class ExchangedDocumentXmlTest {

    private String id = "RDTIV0575526000058001";
    private String name = DocumentType.TAX_INVOICE.getDocumentName();
    private String typeCode = DocumentType.TAX_INVOICE.getDocumentCode();
    private Timestamp issueDateTime = new Timestamp(System.currentTimeMillis());
    private String purpose = "คำนวณราคาค่าบริการผิดพลาดสูงกว่าที่เป็นจริง";
    private String purposeCode = "DCNS03";
    private String globalId = "2.16.764.1.1.2.1.X.X.X";
    private Timestamp creationDateTime = new Timestamp(System.currentTimeMillis());
    private String subject = "หมายเหตุ";
    private String content = "";

    @Test
    public void shouldGetAllInfo() {
        ExchangedDocumentXml exchangedDocumentXml = ExchangedDocumentXml.builder()
                .id(id)
                .name(name)
                .typeCode(typeCode)
                .issueDateTime(issueDateTime)
                .purpose(purpose)
                .purposeCode(purposeCode)
                .globalId(globalId)
                .creationDateTime(creationDateTime)
                .subject(subject)
                .content(content)
                .build();

        assertEquals(this.id, exchangedDocumentXml.id);
        assertEquals(this.name, exchangedDocumentXml.name);
        assertEquals(this.typeCode, exchangedDocumentXml.typeCode);
        assertEquals(this.issueDateTime, exchangedDocumentXml.issueDateTime);
        assertEquals(this.purpose, exchangedDocumentXml.purpose);
        assertEquals(this.purposeCode, exchangedDocumentXml.purposeCode);
        assertEquals(this.globalId, exchangedDocumentXml.globalId);
        assertEquals(this.creationDateTime, exchangedDocumentXml.creationDateTime);
        assertEquals(this.subject, exchangedDocumentXml.subject);
        assertEquals(this.content, exchangedDocumentXml.content);
    }
}
