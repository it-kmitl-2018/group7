package th.ac.kmitl.it.soa.group7.definitions;

import java.util.HashMap;
import java.util.Map;

import lombok.Getter;

public enum LanguageTypeCode {
    THAI ("tha", "ภาษาไทย"),
    ENGLISH ("eng", "ภาษาอังกฤษ"),
    CHINESE ("chi", "ภาษาจีน"),
    JAPAN ("jpn", "ภาษาญี่ปุ่น"),
    SPAIN ("spa", "ภาษาสเปน"),
    GERMAN ("ger", "ภาษาเยอรมัน");

    private @Getter String languageCode;
    private @Getter String languageName;

    LanguageTypeCode(String languageCode, String languageName) {
        this.languageCode = languageCode;
        this.languageName = languageName;
    }

    public static Map<String, LanguageTypeCode> mapper = new HashMap<>();
    static {
        for (LanguageTypeCode languageTypeCode : LanguageTypeCode.values()) {
            mapper.put(languageTypeCode.getLanguageCode(), languageTypeCode);
        }
    }

    public static LanguageTypeCode parse(String languageCode) {
        LanguageTypeCode languageTypeCode = mapper.get(languageCode);

        if (languageTypeCode == null) {
            throw new IllegalArgumentException("LanguageCode not exist" + languageCode);
        }
        return mapper.get(languageCode);
    }
}
