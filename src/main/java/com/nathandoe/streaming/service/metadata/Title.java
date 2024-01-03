package com.nathandoe.streaming.service.metadata;

import org.springframework.data.annotation.Id;

import java.util.UUID;

public record Title(@Id UUID id, String name, int releaseYear) {

}
