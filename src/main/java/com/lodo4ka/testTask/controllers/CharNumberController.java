package com.lodo4ka.testTask.controllers;

import com.lodo4ka.testTask.services.CharNumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CharNumberController {

    private final CharNumberService charNumberService;

    @Autowired
    public CharNumberController(CharNumberService charNumberService) {
        this.charNumberService = charNumberService;
    }

    @GetMapping("/charNumber/get")
    public String getCharNumber(@RequestParam(value = "inputLine") String inputLine) {
        return charNumberService.getCharNumber(inputLine);
    }
}
