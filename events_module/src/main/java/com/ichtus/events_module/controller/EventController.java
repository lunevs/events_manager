package com.ichtus.events_module.controller;

import com.ichtus.events_module.dto.AddEventRequest;
import com.ichtus.events_module.entity.ConferenceEvent;
import com.ichtus.events_module.service.ConferenceEventService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/events")
@RequiredArgsConstructor
public class EventController {

    public final ConferenceEventService eventService;

    @GetMapping
    public List<ConferenceEvent> getAll() {
        return eventService.getAllEvents();
    }

    @PostMapping
    public void addEvent(@RequestBody AddEventRequest addEventRequest) {
        eventService.addEvent(addEventRequest);
    }

}
