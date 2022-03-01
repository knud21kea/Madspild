package com.example.madspild.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MadspildController
{
    @GetMapping("/")
    public String welcome()
    {
        return "index";
    }

    @GetMapping("/5raad")
    public String showAdvice()
    {
        return "5raad";
    }

    @GetMapping("/links")
    public String showLinks()
    {
        return "links";
    }

    @GetMapping("/events")
    public String showEvents()
    {
        return "events";
    }
}
