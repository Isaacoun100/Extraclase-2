package com.itcr.datos.extraclass.client;
import com.itcr.datos.extraclass.Facade.EncryptorFacade;
public class Client {
    /**
     * The implementation of this Class is based on
     * the retrievable article on: https://examples.javacodegeeks.com/core-java/java-facade-design-pattern-example/
     * by author Abhishek Kothari. Adapted to this assignment by Alejandro Quesada
     * claiming no rights nor ownership over the source code in this method.
     *
     * This method represents the client's requests for text encryption, sent to the facade class in the Facade package.
     * @param args
     *
     */
    public static void main(String[] args) {

        //change this string to the desired one to encrypt when showing the example to an audience.
        String myText = "sample text";
        EncryptorFacade e= new EncryptorFacade();
        System.out.println(myText + " is being encrypted...");
        System.out.println("MD5 encryption");
        System.out.println(e.encrypt("MD5", myText));
        System.out.println("SHA encryption");
        System.out.println(e.encrypt("SHA", myText));
        System.out.println("SHA256 encryption");
        System.out.println(e.encrypt("SHA256", myText));
    }
}
