package com.club.club.Metier;


import com.club.club.Task;

import java.util.List;

public interface TaskMetier {

    // Enregistrer une nouvelle tâche
    Task enregistrer(Task tache);

    // Obtenir une tâche par son ID
    Task obtenirParId(Long id);

    // Obtenir toutes les tâches
    List<Task> obtenirToutes();

    // Mettre à jour les informations d'une tâche
    Task mettreAJour(Long id, Task tache);

    // Supprimer une tâche
    void supprimer(Long id);
}
