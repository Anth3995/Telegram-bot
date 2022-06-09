package org.example.module;

import com.google.inject.AbstractModule;
import org.example.service.TelegramApiService;
import org.example.service.impl.DefaultTelegramApiService;

import okhttp3.OkHttpClient;

public class ApplicationModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(TelegramApiService.class).to(DefaultTelegramApiService.class);
    }
}
