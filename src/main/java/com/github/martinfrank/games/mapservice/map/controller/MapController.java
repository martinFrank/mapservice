package com.github.martinfrank.games.mapservice.map.controller;

import com.github.martinfrank.games.mapservice.map.model.Map;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/maps") //https://restfulapi.net/resource-naming/ should be PLURAL!
public class MapController {

    @GetMapping("/generate")
    public ResponseEntity<Map> getMap() {
        return ResponseEntity.ok().body(new Map(64, 64));
    }
}
