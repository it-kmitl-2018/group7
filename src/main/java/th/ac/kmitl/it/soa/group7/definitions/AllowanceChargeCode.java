package th.ac.kmitl.it.soa.group7.definitions;

import java.util.HashMap;
import java.util.Map;

import lombok.Getter;

@Getter
public enum AllowanceChargeCode {
    STAMP_DUTY(28, "ค่าอากรแสตมป์", "Stamp duty"),
    BANK_CHARGES(30, "ค่าธรรมเนียมที่เกิดจากการทำธุรกรรมกับธนาคาร", "Bank charges"),
    MINIMUM_COMMISSION(52, "ค่าดำเนินการขั้นต่ำ", "Minimum commission"),
    TRANSFER_CHARGES(55, "ค่าธรรมเนียมจากการโอนเงิน", "Transfer charges"),
    MISCELLANEOUS_CHARGES(57, "ค่าเบ็ดเตล็ด", "Miscellaneous charges"),
    FOREIGN_EXCHANGE_CHARGES(58, "ค่าธรรมเนียมจากการเปลี่ยนสกุลเงิน", "Foreign exchange charges"),
    SPECIAL_AGREEMENT_CHARGE(65, "ส่วนลดหรือค่าธรรมเนียมที่เกิดจากข้อตกลงพิเศษทางการค้า",
            "An allowance or charge as specified in a special agreement"),
    SAMPLE_DISCOUNT(66, "ส่วนลดจากการขายสินค้าสำหรับทดลองตลาด", "Sample discount"),
    RUSH_DELIVERY_SURCHARGE(77, "ค่าธรรมเนียมจากการขนส่งสินค้าให้เร็วขึ้นกว่าปกติ", "Rush delivery surcharge"),
    LOADING_CHARGE(82, "ค่าธรรมเนียมจากการบรรทุกสินค้า", "Loading charge"),
    WAREHOUSING_CHARGE(85, "ค่าธรรมเนียมในการจัดเก็บสินค้า", "Warehousing charge"),
    REDUCTION_FROM_USUAL_PRICE(95, "ส่วนลดจากราคาปกติ", "A reduction from a usual or list price"),
    CHARGE_FOR_INSURANCE(96, "ค่าประกันสินค้าหรือบริการ", "Charge for insurance");

    private int code;
    private String descriptionTh;
    private String descriptionEn;
    
    AllowanceChargeCode(int code, String descriptionTh, String descriptionEn) {
        this.code = code;
        this.descriptionTh = descriptionTh;
        this.descriptionEn = descriptionEn;
    }
    
    public static Map<Integer, AllowanceChargeCode> mapper = new HashMap<>();
    static {
        for (AllowanceChargeCode referenceCode : AllowanceChargeCode.values()) {
            mapper.put(referenceCode.getCode(), referenceCode);
        }
    }

    public static AllowanceChargeCode parse(int code) {
    	AllowanceChargeCode codeEnum = mapper.get(code);

        if (codeEnum == null) {
            throw new IllegalArgumentException("Parsing not existed code " + code);
        }
        return mapper.get(code);
    }
    
}
