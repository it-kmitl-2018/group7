package th.ac.kmitl.it.soa.group7.definitions;

import lombok.Getter;

@Getter
public enum TaxpayerIdCode {
    TAX_ID("TXID", "เลขประจำตัวผู้เสียภาษีอากรสำหรับนิติบุคคล 13 หลัก รวมเลขสาขาอีก 5 หลัก", "Tax ID"),
    ID_CARD_NUMBER("NIDN", "เลขประจำตัวประชาชน 13 หลัก (สำหรับบุคคลธรรมดา)", "National Registration Identification Number"),
    PASSPORT_NUMBER("CCPT", "เลขหนังสือเดินทาง (Passport)", "Number assigned by an authority to identify the passport number of a person"),
    OTHER_ID_SCHEMA("OTHR", "ตัวระบุอื่นๆใช้ในการระบุเอกลักษณ์ผู้ซื้อนอกเหนือจาก Scheme TXID NIDN CCPT", "Other Identification scheme");
	
    public String taxpayerIdCode;
    public String nameTh;
    public String nameEn;
    
    TaxpayerIdCode(String taxpayerIdCode, String nameTh, String nameEn) {
		this.taxpayerIdCode = taxpayerIdCode;
		this.nameTh = nameTh;
		this.nameEn = nameEn;
	}
}
