package org.example.dto;

import com.google.gson.annotations.SerializedName;

public record ChatDto(
        @SerializedName("id")
        Integer id,
        @SerializedName("type")
        String type,
        @SerializedName("username")
        String username,
        @SerializedName("bio")
        String bio,
        @SerializedName("description")
        String description
) {
}
