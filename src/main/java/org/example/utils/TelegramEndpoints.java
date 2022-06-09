package org.example.utils;

public final class TelegramEndpoints {
    private static final String BASE_URL = "https://api.telegram.org/bot" + System.getenv("TELEGRAM_TOKEN");

    public static final String GET_UPDATES = BASE_URL + "/getUpdates";
}
