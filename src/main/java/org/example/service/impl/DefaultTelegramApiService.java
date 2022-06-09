package org.example.service.impl;

import com.google.inject.Inject;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.example.dto.UpdateDto;
import org.example.service.TelegramApiService;
import org.example.utils.TelegramEndpoints;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.List;

import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class DefaultTelegramApiService implements TelegramApiService {
    private static final Logger LOG = LoggerFactory.getLogger(DefaultTelegramApiService.class);

    private final OkHttpClient client;
    private final ObjectMapper objectMapper;

    @Inject
    public DefaultTelegramApiService(OkHttpClient client, ObjectMapper objectMapper) {
        this.client = client;
        this.objectMapper = objectMapper;
    }

    @Override
    public List<UpdateDto> getUpdates() {
        HttpUrl.Builder urlBuilder = HttpUrl.parse(TelegramEndpoints.GET_UPDATES).newBuilder();
        urlBuilder.addQueryParameter("offset", "410811467");

        Request request = new Request.Builder()
            .url(urlBuilder.build())
            .build();

        try (Response response = client.newCall(request).execute()) {
            String json = response.body().string();
            JsonNode root = objectMapper.readTree(json);
            List<UpdateDto> updateDtos = objectMapper.readerForListOf(UpdateDto.class).readValue(root.get("result"));



        } catch (IOException e) {
            LOG.error("error", e);
        }
        return null;
    }
}
