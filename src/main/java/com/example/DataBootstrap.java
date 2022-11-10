package com.example;

import io.micronaut.runtime.event.annotation.EventListener;
import io.micronaut.runtime.server.event.ServerStartupEvent;
import jakarta.inject.Singleton;

@Singleton
public class DataBootstrap {

    private final WidgetRepository widgetRepository;

    public DataBootstrap(WidgetRepository widgetRepository) {
        this.widgetRepository = widgetRepository;
    }

    @EventListener
    void createSomeData(ServerStartupEvent event) {
        if (widgetRepository.count() == 0) {
            Widget widget = new Widget();
            widget.setName("Widget One");
            widgetRepository.save(widget);
        }
    }
}
