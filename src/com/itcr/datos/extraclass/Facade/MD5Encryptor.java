package com.itcr.datos.extraclass.Facade;
/*
The implementation of this class below is based on
the retrievable article on: https://examples.javacodegeeks.com/core-java/java-facade-design-pattern-example/
by author Abhishek Kothari. Adapted to this assignment by Alejandro Quesada, claiming no rights nor ownership over the source code in this class.
 */
import org.jetbrains.annotations.NotNull;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
public class MD5Encryptor {
    public String encrypt(@NotNull String text) {
        String hash = "";
        try {
            MessageDigest msgDigest = MessageDigest.getInstance("MD5");
            msgDigest.update(text.getBytes());

            byte textBytes[] = msgDigest.digest();

            StringBuffer buffer = new StringBuffer();
            for (int i = 0; i < textBytes.length; i++) {
                buffer.append(Integer.toString((textBytes[i] & 0xff) + 0x100, 16).substring(1));
            }

            hash = buffer.toString();
        }
        catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return hash;
    }
}