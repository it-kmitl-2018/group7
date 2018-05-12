package th.ac.kmitl.it.soa.group7.definitions;

import lombok.Getter;

@Getter
public enum ReferenceCode {	
	INVOICE_NUMBER("IV", "เลขใบแจ้งหนี้", "Reference number to identify an invoice"),
    DOCUMENT_REFERENCE_NUMBER("LC", "เลขอ้างอิงระบุเอกสาร", "Reference number identifying the letter of credit document"),
    SERIAL_NUMBER("LS", "เลขบาร์โค้ด", "Bar coded label serial number"),
    ORDER_NUMBER("ON", "เลขที่สั่งซื้อออกโดยผู้ซื้อ", "Order document identifier, buyer assigned"),
    ITEM_NUMBER("SE", "เลขระบุสินค้า", "Identification number of an item which distinguishes this specific item out"
    		+ " of an number of identical items"),
    PREVIOUS_TAX_INVOICE_NUMBER("ALT", "เลขใบกำกับภาษีใบเดิม", "Previous tax control number"),
    DEBIT_NOTE_NUMBER("DL", "หมายเลขใบเพิ่มหนี้", "Debit Note Number"),
    CREDIT_NOTE_NUMBER("CD", "หมายเลขใบลดหนี้", "Credit Note Number"),
    MUTUAL_REFERENCE_NUMBER("ZZZ", "เอกสารอื่น ๆ", "Mutually defined reference number");
	
	private String code;
	private String descriptionTh;
	private String descriptionEn;

	ReferenceCode(String code, String descriptionTh, String descriptionEn) {
		this.code = code;
		this.descriptionTh = descriptionTh;
		this.descriptionEn = descriptionEn;
	}

}
