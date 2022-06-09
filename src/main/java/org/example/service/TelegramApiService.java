package org.example.service;

import org.example.dto.UpdateDto;

import java.util.List;

public interface TelegramApiService {
    List<UpdateDto> getUpdates();
}
