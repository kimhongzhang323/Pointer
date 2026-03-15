package com.umevent.management.features.minutes.model;

import jakarta.validation.constraints.NotBlank;

public record MinutesUpdateRequest(
    @NotBlank(message = "Minutes text is required") String rawText
) {
}
