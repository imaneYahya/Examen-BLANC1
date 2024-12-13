package com.IMANE.testApp;

import com.IMANE.entities.Agent;

public class ObserverTest {
    public static void main(String[] args) {
        // Création des agents
        Agent agent1 = new Agent("YAHYA1");
        Agent agent2 = new Agent("YAHYA2");
        Agent agent3 = new Agent("YAHYA3");

        agent1.souscrire(agent2);
        agent1.souscrire(agent3);
        agent1.notifierObservateurs("Mise à jour .");
        agent3.souscrire(agent1);
        agent3.notifierObservateurs("Nouvelle transaction enregistrée.");
        agent1.seDesabonner(agent2);
        agent1.notifierObservateurs("Deuxième mise à jour.");
    }
}
