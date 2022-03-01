package com.example.madspild.controllers;

import com.example.madspild.models.Event;
import com.example.madspild.services.Timetable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class MadspildController
{

    Timetable tt = new Timetable();

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
    public String showEvents(Model model)
    {
        ArrayList<Event> listOfEvents = tt.getListOfEvents();
        model.addAttribute("events", listOfEvents);
        return "events";
    }
}
