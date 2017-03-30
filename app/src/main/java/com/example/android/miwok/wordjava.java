package com.example.android.miwok;

/**
 * Created by Alhamdullah on 3/31/2017.
 */

public class wordjava {
    private String arabic;
    private String translation;
    private String reference;

    public wordjava(String arabic, String translation, String reference) {
        this.arabic = arabic;
        this.translation = translation;
        this.reference = reference;
    }

    public String getArabic() {
        return arabic;
    }

    public String getTranslation() {
        return translation;
    }

    public String getReference() {
        return reference;
    }
}
