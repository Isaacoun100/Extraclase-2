package com.itcr.datos.extraclass.Facade;

import org.jetbrains.annotations.NotNull;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
public class MD5Encryptor {

    /**
     *The implementation of this code  is based on
     * the retrievable article on: https://examples.javacodegeeks.com/core-java/java-facade-design-pattern-example/
     * by author Abhishek Kothari. Adapted to this assignment by Alejandro Quesada
     * claiming no rights nor ownership over the source code in this method.
     *
     * this method takes the text sent by the client to the facade and encrypts it
     * @param text the desired to-be-encrypted text that facade gives to the method, coming from the user.
     * @return encrypted text in MD5 format.
     */
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