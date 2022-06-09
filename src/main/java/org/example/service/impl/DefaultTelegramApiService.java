package org.example.service.impl;

import org.example.dto.UpdateDto;
import org.example.service.TelegramApiService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class DefaultTelegramApiService implements TelegramApiService {
    private static final Logger log = LoggerFactory.getLogger(DefaultTelegramApiService.class);

    @Override
    public List<UpdateDto> getUpdates() {
        log.info("success");
        return null;
    }
}
