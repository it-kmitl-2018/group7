package th.ac.kmitl.it.soa.group7.definitions;

import java.util.HashMap;
import java.util.Map;

import lombok.Getter;

@Getter
public enum TaxPayerIdCode {
    TAX_ID("TXID", "เลขประจำตัวผู้เสียภาษีอากรสำหรับนิติบุคคล 13 หลัก รวมเลขสาขาอีก 5 หลัก", "Tax ID"),
    ID_CARD_NUMBER("NIDN", "เลขประจำตัวประชาชน 13 หลัก (สำหรับบุคคลธรรมดา)", "National Registration Identification Number"),
    PASSPORT_NUMBER("CCPT", "เลขหนังสือเดินทาง (Passport)", "Number assigned by an authority to identify the passport number of a person"),
    OTHER_ID_SCHEMA("OTHR", "ตัวระบุอื่นๆใช้ในการระบุเอกลักษณ์ผู้ซื้อนอกเหนือจาก Scheme TXID NIDN CCPT", "Other Identification scheme");
	
    public String taxPayerIdCode;
    public String nameTh;
    public String nameEn;
    
    TaxPayerIdCode(String taxPayerIdCode, String nameTh, String nameEn) {
		this.taxPayerIdCode = taxPayerIdCode;
		this.nameTh = nameTh;
		this.nameEn = nameEn;
	}
    
    public static Map<String, TaxPayerIdCode> mapper = new HashMap<>();
    static {
        for (TaxPayerIdCode taxPayerIdCode : TaxPayerIdCode.values()) {
            mapper.put(taxPayerIdCode.getTaxPayerIdCode(), taxPayerIdCode);
        }
    }

    public static TaxPayerIdCode parse(String code) {
        return mapper.get(code);
    }
}
