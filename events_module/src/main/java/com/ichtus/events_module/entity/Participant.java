package com.ichtus.events_module.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Participant extends Person {
    private ParticipantRole role;
}
