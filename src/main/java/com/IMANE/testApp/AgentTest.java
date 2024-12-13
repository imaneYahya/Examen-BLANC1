package com.IMANE.testApp;

import com.IMANE.entities.Agent;
import com.IMANE.entities.Transaction;

import java.util.Date;

public class AgentTest {
    public static void main(String[] args) {
        // Création des agents
        Agent agent1 = new Agent("YAHYA");
        Agent agent2 = new Agent("IMANE");
        Agent agent3 = new Agent("IMANE1");

        agent1.souscrire(agent2);
        agent1.souscrire(agent3);

        Transaction transaction1 = new Transaction.Builder().setId("12345FFF").setDate(new Date()).setMontant(10500.50).setType("Vente")
                .build();

        Transaction transaction2 = new Transaction.Builder().setId("12345DDRE").setDate(new Date()).setMontant(20000.75).setType("Achat")
                .build();
        agent1.ajouterTransaction(transaction1);
        agent1.ajouterTransaction(transaction2);
        agent2.souscrire(agent3);
        Transaction transaction3 = new Transaction.Builder().setId("345902JJJ").setDate(new Date()).setMontant(250.00).setType("Vente")
                .build();

        agent2.ajouterTransaction(transaction3);
    }
}
