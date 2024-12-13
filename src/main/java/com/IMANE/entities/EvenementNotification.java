package com.IMANE.entities;

public class EvenementNotification {
    private final String agentNom;
    private final Transaction transaction;

    public EvenementNotification(String agentNom, Transaction transaction) {
        this.agentNom = agentNom;
        this.transaction = transaction;
    }

    public String getAgentNom() {
        return agentNom;
    }

    public Transaction getTransaction() {
        return transaction;
    }

    @Override
    public String toString() {
        return "EvenementNotification{" +
                "agentNom='" + agentNom + '\'' +
                ", transaction=" + transaction +
                '}';
    }
}
