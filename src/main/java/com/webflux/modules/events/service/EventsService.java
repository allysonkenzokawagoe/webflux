package com.webflux.modules.events.service;

import com.webflux.modules.events.model.Events;
import com.webflux.modules.events.repository.EventsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@RequiredArgsConstructor
@Service
public class EventsService {

    private final EventsRepository repository;

    public Flux<Events> findAll() {
        return repository.findAll();
    }
}
