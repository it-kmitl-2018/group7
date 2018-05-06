package th.ac.kmitl.it.soa.group7.models;


public class ReferenceDocumentModel {
    private String ReferenceDocId; //เลขที่ใบเอกสารอ้างอิง
    private String ReferenceDocDate; //วัน-เดือน-ปี ที่ออกใบเอกสารอ้างอิง
    private String ReferenceDocTypeCode; //รหัสเอกสารอ้างอิง

    public String getReferenceDocId() {
        return ReferenceDocId;
    }

    public void setReferenceDocId(String ReferenceDocId) {
        this.ReferenceDocId = ReferenceDocId;
    }

    public String getReferenceDocDate() {
        return ReferenceDocDate;
    }

    public void setReferenceDocDate(String ReferenceDocDate) {
        this.ReferenceDocDate = ReferenceDocDate;
    }

    public String getReferenceDocTypeCode() {
        return ReferenceDocTypeCode;
    }

    public void setReferenceDocTypeCode(String ReferenceDocTypeCode) {
        this.ReferenceDocTypeCode = ReferenceDocTypeCode;
    }
    
    
    
}
