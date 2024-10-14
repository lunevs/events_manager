package com.ichtus.events_module.service;

import com.ichtus.events_module.repository.InMemoryEventRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ConferenceEventService {

    private final InMemoryEventRepository repository;



    public void printStatus() {
        System.out.println(repository);
    }
}
