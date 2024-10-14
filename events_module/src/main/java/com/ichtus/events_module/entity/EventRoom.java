package com.ichtus.events_module.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class EventRoom {
    private int capacity;
    private List<Accessory> accessories;
}
