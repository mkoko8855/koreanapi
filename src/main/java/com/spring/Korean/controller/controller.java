package com.spring.Korean.controller;
//API 7/10 전부사용하기
import com.spring.Korean.service.openAPIService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.w3c.dom.Node;

import java.util.List;
import java.util.Map;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/api/catch")
@CrossOrigin("http://localhost:3000")
public class controller {

    private final openAPIService openAPIService;

    @GetMapping
    public ResponseEntity<?> getQuiz() {
//        Map<String, String> randomWord = openAPIService.findRandomWord();
        List<Map<String, String>> randomWord = openAPIService.findRandomWord();
        if(randomWord != null) {
            return ResponseEntity.ok().body(openAPIService.findRandomWord());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
