package th.ac.kmitl.it.soa.group7.models;

public class HeaderContext {

	public HeaderContext() {
	}

	private String manualId;
	private String documentId;
	private String documentName;
	private String documentTypeCode;
	private String issueDateTime;
	private String purpose;
	private String purposeCode;
	private String globalId;
	private String creationDateTime;

	public String getManualId() {
		return manualId;
	}

	public void setManualId(String manualId) {
		this.manualId = manualId;
	}

	public String getDocumentId() {
		return documentId;
	}

	public void setDocumentId(String documentId) {
		this.documentId = documentId;
	}

	public String getDocumentName() {
		return documentName;
	}

	public void setDocumentName(String documentName) {
		this.documentName = documentName;
	}

	public String getDocumentTypeCode() {
		return documentTypeCode;
	}

	public void setDocumentTypeCode(String documentTypeCode) {
		this.documentTypeCode = documentTypeCode;
	}

	public String getIssueDateTime() {
		return issueDateTime;
	}

	public void setIssueDateTime(String issueDateTime) {
		this.issueDateTime = issueDateTime;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public String getPurposeCode() {
		return purposeCode;
	}

	public void setPurposeCode(String purposeCode) {
		this.purposeCode = purposeCode;
	}

	public String getGlobalId() {
		return globalId;
	}

	public void setGlobalId(String globalId) {
		this.globalId = globalId;
	}

	public String getCreationDateTime() {
		return creationDateTime;
	}

	public void setCreationDateTime(String creationDateTime) {
		this.creationDateTime = creationDateTime;
	}

}
