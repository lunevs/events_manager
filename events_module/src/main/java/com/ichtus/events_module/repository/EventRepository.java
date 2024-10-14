package com.ichtus.events_module.repository;

import com.ichtus.events_module.entity.ConferenceEvent;

import java.util.List;

public interface EventRepository {
    void save(ConferenceEvent event);
    ConferenceEvent update(ConferenceEvent event);
    List<ConferenceEvent> getAllEvents();
}
