package de.ait.hw_db.controllers;

import de.ait.hw_db.controllers.api.EventApi;
import de.ait.hw_db.dtos.EventDto;
import de.ait.hw_db.services.EventsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class EventsController implements EventApi {

    private final EventsService eventService;
    @Override
    public List<EventDto> getAllEvents() {
        return eventService.getAllEvents();
    }
}
