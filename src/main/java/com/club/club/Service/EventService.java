package com.club.club.Service;

import com.club.club.DAO.EventRepository;
import com.club.club.Event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {

    @Autowired
    private EventRepository eventRepository;

    public List<Event> getAllEvents() {
        return eventRepository.findAll();
    }

    public Event getEventById(Long id) {
        return eventRepository.findById(id).orElse(null);
    }

    public Event createEvent(Event event) {
        return eventRepository.save(event);
    }

    public Event updateEvent(Long id, Event event) {
        Event existingEvent = eventRepository.findById(id).orElse(null);
        if (existingEvent != null) {
            existingEvent.setNom(event.getNom());
            existingEvent.setDescription(event.getDescription());
            existingEvent.setDate(event.getDate());
            existingEvent.setLieu(event.getLieu());
            return eventRepository.save(existingEvent);
        }
        return null;
    }

    public void deleteEvent(Long id) {
        eventRepository.deleteById(id);
    }
}
