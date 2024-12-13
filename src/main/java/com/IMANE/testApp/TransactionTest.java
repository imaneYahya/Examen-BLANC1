package com.IMANE.testApp;

import com.IMANE.entities.Transaction;
import com.IMANE.entities.Type;

import java.util.Date;

public class TransactionTest {
    public static void main(String[] args) {
        Transaction transaction = new Transaction.Builder()
                .setId("12345FFF")
                .setDate(new Date())
                .setMontant(500.75)
                .setType(String.valueOf(Type.Vente))
                .build();

        System.out.println(transaction);

        try {
            Transaction transactionInvalide = new Transaction.Builder()
                    .setId("12345DDRE")
                    .setDate(new Date())
                    .setMontant(300.50)
                    .setType("Echange")
                    .build();
        } catch (IllegalArgumentException e) {
            System.out.println("Erreur : " + e.getMessage());
        }
    }
}
