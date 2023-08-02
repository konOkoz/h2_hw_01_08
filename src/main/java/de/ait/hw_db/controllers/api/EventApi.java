package de.ait.hw_db.controllers.api;

import de.ait.hw_db.dtos.EventDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/events")
public interface EventApi {

    @GetMapping
    List<EventDto> getAllEvents();
}
