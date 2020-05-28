package com.itcr.datos.extraclass.Facade;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
public class FatherSHA {

    /**
     * The implementation of this method below is based on
     * the retrievable article on: https://examples.javacodegeeks.com/core-java/java-facade-design-pattern-example/
     * by author Abhishek Kothari. Adapted and modified for this assignment by Alejandro Quesada
     * claiming no rights nor ownership over the source code in this.
     *
     * this method from the father class receives the text to encrypt and the format to encrypt this in.
     * @param text to be encrypted by the algorithm.
     * @param encryptionType string format for the encryption type, either SHA or SHA-256.
     * @return encrypted text in the previously set encryption type.
     */
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
