package com.itcr.datos.extraclass.Facade;
/*
Student created this class as a way to reduce the code duplication in the SHA and SHA256 encryptors. These had 7 lines of code
that only varied in one entry argument, therefore decided to make them inherit a method from this class, and for this method
to receive the desired encryption type as an entry argument.
 */
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
public class FatherSHA {

    protected String encryptText(String text, String encryptionType){
        String hash = "";
        try {
            MessageDigest digest = MessageDigest.getInstance(encryptionType);
            byte[] textBytes = digest.digest(text.getBytes(StandardCharsets.UTF_8));

            StringBuffer buffer = new StringBuffer();
            for (int i = 0; i < textBytes.length; i++) {
                buffer.append(Integer.toString((textBytes[i] & 0xff) + 0x100, 16).substring(1));
            }

            hash = buffer.toString();
        }
        catch(NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return hash;
    }
}
