package org.example.dto;

import com.google.gson.annotations.SerializedName;

public record UserDto(
        @SerializedName("id")
        Integer id,
        @SerializedName("username")
        String username
) {
}
