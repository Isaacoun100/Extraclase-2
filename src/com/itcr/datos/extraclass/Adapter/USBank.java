package com.itcr.datos.extraclass.Adapter;

public class USBank {

    /**
     * USBank will act as the client in this application example of the adapter design pattern
     * This code is based on https://informaticapc.com/patrones-de-diseno/adapter.php and is being used under the
     * copyright law stated in https://informaticapc.com/cookies-y-privacidad.php
     * @param args
     */

    public static void main(String[] args) {

        Currency convert = new Currency();

        convert.depositDollars(10);
        convert.depositDollars(5);
        convert.depositDollars(2);
        convert.depositDollars(3);
        convert.withdrawDollars(10);

        System.out.println("Your balance in colones is: " + convert.getColonesBalance());
        System.out.println("Your balance in dollars is: " + convert.getDollarBalance());

    }

}
