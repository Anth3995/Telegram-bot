package org.example.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public record UpdateDto (
        @JsonProperty("update_id")
        Integer updateId,
        @JsonProperty("message")
        MessageDto message
) {
}
