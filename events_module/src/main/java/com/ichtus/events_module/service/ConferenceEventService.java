package com.ichtus.events_module.service;

import com.ichtus.events_module.dto.AddEventRequest;
import com.ichtus.events_module.entity.ConferenceEvent;
import com.ichtus.events_module.repository.InMemoryEventRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ConferenceEventService {

    private final InMemoryEventRepository repository;

    public List<ConferenceEvent> getAllEvents() {
        return repository.getAllEvents();
    }

    public void addEvent(AddEventRequest addEventRequest) {
        ConferenceEvent event = new ConferenceEvent(addEventRequest.getTitle());
        event.setDescription(addEventRequest.getDescription());
        event.setStartDateTime(addEventRequest.getStartDateTime());
        event.setEndDateTime(addEventRequest.getEndDateTime());
        event.setEventId(repository.getMaxId() + 1L);
        repository.save(event);
    }

    public void printStatus() {
        System.out.println(repository);
    }
}
