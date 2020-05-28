package com.itcr.datos.extraclass.client;
import com.itcr.datos.extraclass.Facade.EncryptorFacade;
/*
The implementation of this class below is based on
the retrievable article on: https://examples.javacodegeeks.com/core-java/java-facade-design-pattern-example/
by author Abhishek Kothari. Adapted to this assignment by Alejandro Quesada, claiming no rights nor ownership over the source code in this class.
 */
public class Client {
    public static void main(String[] args) {

        //TODO: change this string to the desired one to encrypt when showing the example to an audience.
        String myText = "Encrypt this text";
        EncryptorFacade e= new EncryptorFacade();
        System.out.println("MD5 encryption");
        System.out.println(e.encrypt("MD5", myText));
        System.out.println("SHA encryption");
        System.out.println(e.encrypt("SHA", myText));
        System.out.println("SHA256 encryption");
        System.out.println(e.encrypt("SHA256", myText));
    }
}
