package com.example.madspild.services;

import com.example.madspild.models.Event;

import java.util.ArrayList;

public class Timetable
{
    private ArrayList<Event> listOfEvents = new ArrayList<>();

    public Timetable()
    {
        addEvents();
    }

    public void addEvents() {
        listOfEvents.add(new Event(22,3,2,"The Boys present...", "An event where a new website to help home users to reduce food waste is launched."));
        listOfEvents.add(new Event(22,3,4,"Workshop...", "A meeting hosted at KEA, where residents can talk to local representatives about how to reduce food waste in the home."));
    }

    public ArrayList<Event> getListOfEvents() {
        return listOfEvents;
    }
}
