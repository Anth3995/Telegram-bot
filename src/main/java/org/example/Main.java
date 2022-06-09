package org.example;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.example.module.ApplicationModule;
import org.example.service.TelegramApiService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger LOG = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new ApplicationModule());
        TelegramApiService telegramApiService = injector.getInstance(TelegramApiService.class);

        try {
            while (true) {
                telegramApiService.getUpdates();
                Thread.sleep(1000L);
            }
        } catch (Exception e) {
            LOG.error("Bot is crashed: {}", e.getMessage(), e);
            Thread.currentThread().interrupt();
            System.exit(1);
        }
    }
}
