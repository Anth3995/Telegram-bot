package org.example.dto;

import com.google.gson.annotations.SerializedName;

public record UpdateDto (
        @SerializedName("update_id")
        Integer updateId,
        @SerializedName("message")
        MessageDto message
){
}
