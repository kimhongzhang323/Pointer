package com.umevent.management.infrastructure.google.model;

import java.time.LocalDateTime;

public record GoogleItem(
    String id,
    String title,
    String source,
    String link,
    LocalDateTime lastUpdated
) {
}
