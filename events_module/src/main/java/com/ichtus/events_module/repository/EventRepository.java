package com.ichtus.events_module.repository;

import com.ichtus.events_module.entity.ConferenceEvent;

public interface EventRepository {
    void save(ConferenceEvent event);
    ConferenceEvent update(ConferenceEvent event);

}
