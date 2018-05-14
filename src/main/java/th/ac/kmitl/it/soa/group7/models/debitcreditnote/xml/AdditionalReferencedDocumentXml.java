package th.ac.kmitl.it.soa.group7.models.debitcreditnote.xml;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import lombok.Builder;
import th.ac.kmitl.it.soa.group7.definitions.DocumentType;

import java.sql.Timestamp;

@Builder
@JacksonXmlRootElement(localName = "ram:AdditionalReferencedDocument")
public class AdditionalReferencedDocumentXml {
	@JacksonXmlProperty(localName = "ram:IssuerAssignedID")
	public String issuerAssignedID;
	@JacksonXmlProperty(localName = "ram:IssueDateTime")
	public Timestamp issueDateTime;
	@JacksonXmlProperty(localName = "ram:ReferenceTypeCode")
	public DocumentType referenceTypeCode;
}
