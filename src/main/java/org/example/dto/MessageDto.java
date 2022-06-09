package org.example.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public record MessageDto (
        @JsonProperty("message_id")
        Integer id,
        @JsonProperty("from")
        UserDto user,
        @JsonProperty("chat")
        ChatDto chat,
        @JsonProperty("date")
        Integer date,
        @JsonProperty("text")
        String text
) {
}
