package com.club.club.Metier;

import com.club.club.Membre;

import java.util.List;

public interface MembreMetier {
    Membre enregistrer(Membre membre);
    Membre obtenirParId(Long id);
    List<Membre> obtenirTous();
    Membre mettreAJour(Long id, Membre membre);
    void supprimer(Long id);
}
