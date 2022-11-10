package com.example;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/widgets")
public class GcrdbController {

    private final WidgetRepository widgetRepository;

    public GcrdbController(WidgetRepository widgetRepository) {
        this.widgetRepository = widgetRepository;
    }

    @Get
    public HttpResponse<Iterable<Widget>> index() {
        return HttpResponse.ok(widgetRepository.findAll());
    }
}