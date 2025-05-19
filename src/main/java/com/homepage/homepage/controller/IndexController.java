package com.homepage.homepage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @GetMapping("/index")
    public String index() {
        return "index.html";
    }

    @GetMapping("/reservation")
    public String reservation() {
        return "reservation.html";
    }

    @GetMapping("/trainer")
    public String trainer() {
        return "trainer.html";
    }

    @GetMapping("/location")
    public String location() {
        return "location.html";
    }

    @GetMapping("/program")
    public String program() {
        return "program.html";
    }


}
