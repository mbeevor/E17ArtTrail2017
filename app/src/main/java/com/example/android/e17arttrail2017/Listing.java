package com.example.android.e17arttrail2017;

/**
 * Constructor for creating individual listings for ArrayAdapter
 */

public class Listing {

    private String EventName;
    private String EventDate;
    private String EventLocation;
    private String EventDescription;
//    private int EventImage;

//    public Listing(String eventName, String eventDate, String eventLocation, String eventDescription, int eventImage) {
//        EventName = eventName;
//        EventDate = eventDate;
//        EventLocation = eventLocation;
//        EventDescription = eventDescription;
//        EventImage = eventImage;
//    }

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

//    public int getEventImage() {
//        return EventImage;
//    }
}

