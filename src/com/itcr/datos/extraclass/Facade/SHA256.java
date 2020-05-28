package com.itcr.datos.extraclass.Facade;
/*
The implementation of this class below is based on
the retrievable article on: https://examples.javacodegeeks.com/core-java/java-facade-design-pattern-example/
by author Abhishek Kothari. Adapted to this assignment by Alejandro Quesada, claiming no rights nor ownership over the source code in this class.
 */
import org.jetbrains.annotations.NotNull;

public class SHA256 extends FatherSHA{

    public String encrypt(@NotNull String text) {
        return encryptText(text,"SHA-256");
    }
}