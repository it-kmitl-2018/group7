package th.ac.kmitl.it.soa.group7.models;


public class ReferenceDocumentModel {
    private String referenceDocId; //เลขที่ใบเอกสารอ้างอิง
    private String referenceDocDate; //วัน-เดือน-ปี ที่ออกใบเอกสารอ้างอิง
    private String referenceDocTypeCode; //รหัสเอกสารอ้างอิง

    public String getReferenceDocId() {
        return referenceDocId;
    }

    public void setReferenceDocId(String ReferenceDocId) {
        this.referenceDocId = ReferenceDocId;
    }

    public String getReferenceDocDate() {
        return referenceDocDate;
    }

    public void setReferenceDocDate(String ReferenceDocDate) {
        this.referenceDocDate = ReferenceDocDate;
    }

    public String getReferenceDocTypeCode() {
        return referenceDocTypeCode;
    }

    public void setReferenceDocTypeCode(String ReferenceDocTypeCode) {
        this.referenceDocTypeCode = ReferenceDocTypeCode;
    }
    
    
    
}
