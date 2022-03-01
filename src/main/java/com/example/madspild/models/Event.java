package com.example.madspild.models;

public class Event
{
    private final int year;
    private final int month;
    private final int day;
    private final String teaser;
    private final String description;

    public Event(int year, int month, int day, String teaser, String description)
    {
        this.year = year;
        this.month = month;
        this.day = day;
        this.teaser = teaser;
        this.description = description;
    }
}
