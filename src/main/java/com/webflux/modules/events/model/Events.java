package com.webflux.modules.events.model;

import com.fasterxml.jackson.databind.EnumNamingStrategy;
import com.fasterxml.jackson.databind.annotation.EnumNaming;
import com.webflux.modules.events.enums.EType;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@EntityScan
@Table(name = "EVENTS")
public class Events {

    @Id
    private Double id;

    @Column
    private EType type;
}
