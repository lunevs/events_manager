package com.ichtus.events_module.entity;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
public class ConferenceEvent {

    private Long eventId;
    private EventRoom eventRoom;
    private String description;
    private String title;
    private List<Participant> participants;
    private LocalDateTime startDateTime;
    private LocalDateTime endDateTime;
    private List<Visitor> visitors;

    public ConferenceEvent(String title) {
        this.title = title;
    }
}
