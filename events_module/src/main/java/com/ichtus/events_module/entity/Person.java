package com.ichtus.events_module.entity;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Person {
    private String name;
    private String surname;
    private String email;
    private String phoneNumber;
}
