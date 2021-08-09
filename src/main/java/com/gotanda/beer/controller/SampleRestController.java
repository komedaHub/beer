package com.gotanda.beer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.gotanda.beer.dto.SampleDto;

@RestController
public class SampleRestController {
    @RequestMapping("/rest")
    public SampleDto restSample(@RequestParam(name = "name", defaultValue = "bar") String name) {
        SampleDto dto = new SampleDto(1,name);
        return dto;
    }
}