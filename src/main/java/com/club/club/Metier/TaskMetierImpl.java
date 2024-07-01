package com.club.club.Metier;

import com.club.club.Task;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TaskMetierImpl implements TaskMetier{
    @Override
    public Task enregistrer(Task tache) {
        return null;
    }

    @Override
    public Task obtenirParId(Long id) {
        return null;
    }

    @Override
    public List<Task> obtenirToutes() {
        return List.of();
    }

    @Override
    public Task mettreAJour(Long id, Task tache) {
        return null;
    }

    @Override
    public void supprimer(Long id) {

    }
}
