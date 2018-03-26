package th.ac.kmitl.it.soa.group7.models;

import org.springframework.ui.ModelMap;

public class HeaderContext {

	public HeaderContext() {
	}

	public HeaderContext(String[] documentType) {
		this.documentType = documentType;
	}

	private String[] documentType;

	private String manualId;
	private String documentId;
	private String documentName;
	private String documentTypeCode;
	private String issueDateTime;
	private String purpose;
	private String purposeCode;
	private String globalId;
	private String creationDateTime;
	private ModelMap modelMap;

	public ModelMap getModelMap() {
		return modelMap;
	}

	public void setModelMap(ModelMap modelMap) {
		this.modelMap = modelMap;
	}

	public void setParameterFromHtml(ModelMap modelMap) {
		this.manualId = (String) modelMap.get(manualId);
		this.documentId = (String) modelMap.get(documentId);
		this.documentName = (String) modelMap.get(documentName);
		this.documentTypeCode = (String) modelMap.get(documentTypeCode);
		this.issueDateTime = (String) modelMap.get(issueDateTime);
		this.purpose = (String) modelMap.get(purpose);
		this.purposeCode = (String) modelMap.get(purposeCode);
		this.globalId = (String) modelMap.get(globalId);
		this.creationDateTime = (String) modelMap.get(creationDateTime);
	}

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

	public String[] getDocumentType() {
		return documentType;
	}

	public void setDocumentType(String[] documentType) {
		this.documentType = documentType;
	}

}
