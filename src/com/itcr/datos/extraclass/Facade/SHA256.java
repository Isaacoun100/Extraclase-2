package com.itcr.datos.extraclass.Facade;
/*
 */
import org.jetbrains.annotations.NotNull;

public class SHA256 extends FatherSHA{
    /**
     * The implementation of this method is based on
     * the retrievable article on: https://examples.javacodegeeks.com/core-java/java-facade-design-pattern-example/
     * by author Abhishek Kothari. Adapted to this assignment by Alejandro Quesada
     * claiming no rights nor ownership over the source code in this method.
     *
     * this method receives the input text and encrypts it
     * @param text sent to the method by the facade implementation.
     * @return encrypted text in SHA-256 format.
     */
    public String encrypt(@NotNull String text) {
        return encryptText(text,"SHA-256");
    }
}