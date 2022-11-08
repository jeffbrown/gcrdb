package com.example;

import io.micronaut.http.annotation.*;

@Controller("/gcrdb")
public class GcrdbController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}