package com.umevent.management.features.event.model;

import java.util.List;

public record EventPlanResponse(
    String eventName,
    String styleSummary,
    List<String> retrievedMemories,
    List<String> nextActions
) {
}
