package com.umevent.management.features.event.model;

import java.util.Map;

public record HistoricalEventPattern(
    String eventName,
    int year,
    Map<Integer, String> monthlyMilestones
) {
}
