package com.parcial.mutantes.controllers;

import com.parcial.mutantes.dto.StatsResponse;
import com.parcial.mutantes.services.StatsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stats")

public class StatsController {
    private final StatsService statsService;

    public StatsController (StatsService statsService){
        this.statsService= statsService;
    }

    @GetMapping
    public StatsResponse getStats(){
        return statsService.getStats();
    }
}
