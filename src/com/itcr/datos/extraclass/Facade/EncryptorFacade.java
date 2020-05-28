package com.itcr.datos.extraclass.Facade;
/*

 */
public class EncryptorFacade {

    /**
     *The implementation of this method is based on
     * the retrievable article: https://examples.javacodegeeks.com/core-java/java-facade-design-pattern-example/
     * by author Abhishek Kothari. Adapted to this assignment by Alejandro Quesada,
     * claiming no rights nor ownership over the source code in this method.
     * @param type : client input for desired encryption output.
     * @param text : client input of text that must be encrypted.
     * @return encrypted output in the desired encryption algorythm.
     */
    public String encrypt(String type, String text) {
        String hash = "";
        if (type == "MD5") {
            MD5Encryptor e = new MD5Encryptor();
            hash = e.encrypt(text);
        } else if (type == "SHA") {
            SHAEncryptor e = new SHAEncryptor();
            hash = e.encrypt(text);
        } else if (type == "SHA256") {
            SHA256 e = new SHA256();
            hash = e.encrypt(text);
        }
        return hash;
    }
}