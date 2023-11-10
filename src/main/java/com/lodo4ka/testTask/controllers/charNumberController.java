package com.lodo4ka.testTask.controllers;

import com.lodo4ka.testTask.services.CharNumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class charNumberController {

    private final CharNumberService charNumberService;

    @Autowired
    public charNumberController(CharNumberService charNumberService) {
        this.charNumberService = charNumberService;
    }

    @GetMapping("/charNumber/get")
    public String getCharNumber(@RequestParam(value = "inputLine") String inputLine) {
        return charNumberService.getCharNumber(inputLine);
    }
}
