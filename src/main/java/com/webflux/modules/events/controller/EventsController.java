package com.webflux.modules.events.controller;

import com.webflux.modules.events.model.Events;
import com.webflux.modules.events.service.EventsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/events")
public class EventsController {

    private final EventsService service;

    @GetMapping(produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<Events> getEvents() {
        return service.findAll();
    }
}
