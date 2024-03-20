package com.foodapp.springfoodapp.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/wellcome")
public class WellCome {

    @GetMapping
    public void wellComePage(){

    }
}
