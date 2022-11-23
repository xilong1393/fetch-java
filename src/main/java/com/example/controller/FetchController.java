package com.example.controller;

import com.example.model.User;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@Slf4j
public class FetchController {

//    Logger logger = LogManager.getRootLogger();
    @GetMapping("/all")
    User[] all() {
        RestTemplate restTemplate = new RestTemplate();
        User[] list = restTemplate.getForObject("http://localhost:3000/v1/user/getAllUsers", User[].class);
        log.info(list[0].toString());
        return list;
    }
}
