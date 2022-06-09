package org.example.dto;

import com.google.gson.annotations.SerializedName;

public record MessageDto (
        @SerializedName("message_id")
        Integer id,
        @SerializedName("from")
        UserDto user,
        @SerializedName("sender_chat")
        ChatDto chat,
        @SerializedName("date")
        Integer date,
        @SerializedName("text")
        String text
) {
}
