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
        listOfEvents.add(new Event(22,3,2,"The Boys præsentere...", "En ny hjemmeside er oprettet til at hjælpe folk undgå madspild."));
        listOfEvents.add(new Event(22,3,4,"Workshop...", "Et møde blev holdt på KEA, hvor befolkningen kunne diskutere med lokale repræsentanter om hvordan man kan reducere madspild derhjemme."));
        listOfEvents.add(new Event(22,3,11,"Quiz-nat...", "Kom og lær mere om madspild, og få detaljerne helt på plads."));
        listOfEvents.add(new Event(22,3,21,"Oplysningsdag...","d. 21 er madspilds-oplysningsdag! Vi holder frivilligt arbejde hvor folk kan komme og hjælpe med os med at stoppe madspild.\nMere information løbende.."));
    }

    public ArrayList<Event> getListOfEvents() {
        return listOfEvents;
    }
}
