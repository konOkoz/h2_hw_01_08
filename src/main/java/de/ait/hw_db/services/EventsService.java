package de.ait.hw_db.services;

import de.ait.hw_db.dtos.EventDto;

import java.util.List;

public interface EventsService {
    List<EventDto> getAllEvents();
}
