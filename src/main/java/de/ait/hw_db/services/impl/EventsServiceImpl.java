package de.ait.hw_db.services.impl;

import de.ait.hw_db.dtos.EventDto;
import de.ait.hw_db.repositories.EventsRepository;
import de.ait.hw_db.services.EventsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

import static de.ait.hw_db.dtos.EventDto.from;

@Service
@RequiredArgsConstructor
public class EventsServiceImpl implements EventsService {

    private final EventsRepository eventsRepository;
    @Override
    public List<EventDto> getAllEvents() {
        return from(eventsRepository.findAll());
    }
}
