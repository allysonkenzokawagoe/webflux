package com.webflux.modules.events.repository;

import com.webflux.modules.events.model.Events;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface EventsRepository extends ReactiveCrudRepository<Events, Long> {
}
