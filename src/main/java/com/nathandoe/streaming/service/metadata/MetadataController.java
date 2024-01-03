package com.nathandoe.streaming.service.metadata;

import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.Collection;
import java.util.List;
import java.util.UUID;

@Controller
public class MetadataController {

    @QueryMapping
    Collection<Title> titles() {
        return List.of(new Title(UUID.randomUUID(), "Nates adventure", 2024));
    }

}
