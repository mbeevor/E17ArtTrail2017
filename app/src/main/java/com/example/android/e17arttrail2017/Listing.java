package com.example.android.e17arttrail2017;

import android.app.usage.UsageEvents;

/**
 * Constructor for creating individual listings for ArrayAdapter
 */

public class Listing {

    // constant value setting default as 'no image'
    private static final int NO_IMAGE = -1;
    private String EventName;
    private String EventDate;
    private String EventLocation;
    private String EventDescription;
    private int EventImage = NO_IMAGE;

    public Listing(String eventName, String eventDate, String eventLocation, String eventDescription, int eventImage) {
        EventName = eventName;
        EventDate = eventDate;
        EventLocation = eventLocation;
        EventDescription = eventDescription;
        EventImage = eventImage;
    }

    public Listing(String eventName, String eventDate, String eventLocation, String eventDescription) {
        EventName = eventName;
        EventDate = eventDate;
        EventLocation = eventLocation;
        EventDescription = eventDescription;

    }

    public String getEventName() {
        return EventName;
    }

    public String getEventDate() {
        return EventDate;
    }

    public String getEventLocation() {
        return EventLocation;
    }

    public String getEventDescription() {
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

