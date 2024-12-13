package com.IMANE.interfaces;

public interface Sujet {
    void souscrire(Observateur observateur);    // Ajouter un observateur
    void seDesabonner(Observateur observateur); // Retirer un observateur
    void notifierObservateurs(String message); // Notifier tous les observateurs
}
