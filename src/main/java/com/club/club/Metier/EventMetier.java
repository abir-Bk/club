package com.club.club.Metier;

import com.club.club.DAO.EventRepository;
import com.club.club.Event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EventMetier {
    private final EventRepository eventRepository;

    @Autowired
    public EventMetier(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    public Event enregistrer(Event evenement) {
        return eventRepository.save(evenement);
    }

    public Event obtenirParId(Long id) {
        Optional<Event> event = eventRepository.findById(id);
        return event.orElse(null);
    }

    public List<Event> obtenirTous() {
        return eventRepository.findAll();
    }

    public Event mettreAJour(Long id, Event evenement) {
        if (eventRepository.existsById(id)) {
            evenement.setId(id);
            return eventRepository.save(evenement);
        } else {
            return null;
        }
    }

    public void supprimer(Long id) {
        eventRepository.deleteById(id);
    }
}
