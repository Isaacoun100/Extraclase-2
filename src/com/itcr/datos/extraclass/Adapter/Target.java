package com.itcr.datos.extraclass.Adapter;

public interface Target {

        /**
         * Target is the interface that interacts between the Currency class and the main class, this interface offers
         * only the two needed requests the USBank class needs, those are, to deposit and withdraw dollars from the
         * CostaRicaBank
         *
         * @param dollars
         */

        void withdrawDollars(double dollars );
        void depositDollars(double dollars );
}
