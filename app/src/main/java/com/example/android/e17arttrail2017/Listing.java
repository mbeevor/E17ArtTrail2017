package com.example.android.e17arttrail2017;

import android.app.usage.UsageEvents;

/**
 * Constructor for creating individual listings for ArrayAdapter
 */

public class Listing {

    // constant value setting default as 'no image'
    private static final int NO_IMAGE = -1;
    private int EventName;
    private int EventDate;
    private int EventLocation;
    private int EventDescription;
    private int EventImage = NO_IMAGE;

    public Listing(int eventName, int eventDate, int eventLocation, int eventDescription, int eventImage) {
        EventName = eventName;
        EventDate = eventDate;
        EventLocation = eventLocation;
        EventDescription = eventDescription;
        EventImage = eventImage;
    }

    public Listing(int eventName, int eventDate, int eventLocation, int eventDescription) {
        EventName = eventName;
        EventDate = eventDate;
        EventLocation = eventLocation;
        EventDescription = eventDescription;

    }

    public int getEventName() {
        return EventName;
    }

    public int getEventDate() {
        return EventDate;
    }

    public int getEventLocation() {
        return EventLocation;
    }

    public int getEventDescription() {
        return EventDescription;
    }

    public int getEventImage() {
        return EventImage;
    }

    // boolean that checks if the listing has an image and to update the value accordingly
    public boolean hasImage() {
        return EventImage != NO_IMAGE;
    }
}

