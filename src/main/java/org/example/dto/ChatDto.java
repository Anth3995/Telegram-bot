package org.example.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public record ChatDto(
        @JsonProperty("id")
        Integer id,
        @JsonProperty("type")
        String type,
        @JsonProperty("username")
        String username,
        @JsonProperty("bio")
        String bio,
        @JsonProperty("description")
        String description
) {
}
