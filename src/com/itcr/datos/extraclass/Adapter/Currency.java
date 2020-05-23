package com.itcr.datos.extraclass.Adapter;

/**
 * Currency will act as the adapter as he manages the conversion between the two currencies so both banks can
 * interact without problems
 */

public class Currency implements Target{

    public Currency() { }
    CostaRicaBank newBank = new CostaRicaBank();

    /**
     * getColonesBalance returns the amount of money this person has in the Costa Rica Bank expressed in colones
     * @return Balance in colones
     */

    public double getColonesBalance(){
        return this.newBank.getTotalColones();
    }

    /**
     *getDollarsBalance returns the amount of money this person has in the Costa Rica Bank expressed in dollars
     * @return Balance in dollars
     */

    public double getDollarBalance(){
        return this.newBank.getTotalColones()/570;
    }

    //

    /**
     * This method will receive the amount in dollars the user wants to withdraw from the CostaRicaBank
     * @param dollars
     */

    @Override
    public void withdrawDollars(double dollars )
    {
        double colones = dollars * 570;
        newBank.getColones(colones);
    }
    @Override

    /**
     * This method will receive the amount in dollars the user wants to deposit to the CostaRicaBank
     * @param dollars
     */
    public void depositDollars(double dollars )
    {
        double colones = dollars * 570;
        newBank.addColones( colones );
    }

}
