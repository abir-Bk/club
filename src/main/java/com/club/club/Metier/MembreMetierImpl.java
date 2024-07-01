package com.club.club.Metier;

import com.club.club.Membre;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class MembreMetierImpl implements MembreMetier{
    @Override
    public Membre enregistrer(Membre membre) {
        return null;
    }

    @Override
    public Membre obtenirParId(Long id) {
        return null;
    }

    @Override
    public List<Membre> obtenirTous() {
        return List.of();
    }

    @Override
    public Membre mettreAJour(Long id, Membre membre) {
        return null;
    }

    @Override
    public void supprimer(Long id) {

    }
}
