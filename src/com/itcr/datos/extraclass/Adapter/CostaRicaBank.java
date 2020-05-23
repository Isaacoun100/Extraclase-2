package com.itcr.datos.extraclass.Adapter;

/**
 * CostaRicaBank is the Adaptee that receives the information from currency already converted so he can process it
 */

public class CostaRicaBank {

    private double colones = 0;

    public CostaRicaBank() {
    }

    /**
     * This method will return the balance in colones the person has with the CostaRicaBank
     *
     * @return colones
     */
    public double getTotalColones()
    {
        return this.colones;
    }

    /**
     * This method will return the colones to the bank
     * @param colones
     */
    public void getColones( double colones )
    {
        this.colones -= colones;
    }


    /**
     *This method will add the colones to the bank
     * @param colones
     */
    public void addColones( double colones )
    {
        this.colones += colones;
    }

}
