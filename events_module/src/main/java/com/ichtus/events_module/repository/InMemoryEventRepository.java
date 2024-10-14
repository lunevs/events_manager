package com.ichtus.events_module.repository;

import com.ichtus.events_module.entity.ConferenceEvent;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class InMemoryEventRepository implements EventRepository {

    private final Map<Long, ConferenceEvent> conferenceEventList = new HashMap<>();

    @Override
    public void save(ConferenceEvent event) {
        conferenceEventList.put(event.getEventId(), event);
    }

    @Override
    public ConferenceEvent update(ConferenceEvent event) {
        if (conferenceEventList.containsKey(event.getEventId())) {
            conferenceEventList.put(event.getEventId(), event);
        }
        return null;
    }

    @Override
    public String toString() {
        String result = "";
        for (Map.Entry<Long, ConferenceEvent> item : conferenceEventList.entrySet()) {
            result = result.concat(item.getValue().getTitle() + " from " + item.getValue().getStartDateTime() + " to " + item.getValue().getEndDateTime() + "\n");
        }
        return result;
    }

    public Long getMaxId() {
        return conferenceEventList.keySet().stream().max(Long::compareTo).orElse(0L);
    }

    @Override
    public List<ConferenceEvent> getAllEvents() {
        return conferenceEventList.values().stream().toList();
    }
}
