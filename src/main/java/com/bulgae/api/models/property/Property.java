package com.bulgae.api.models.property;

import com.bulgae.api.models.users.Broker;

import java.util.ArrayList;

public class Property {
    private Address address;
    private Building building;
    private Coordinates location;

    private double price;
    private double lot;
    private int zipCode;
    private String description;
    private double taxes;
    private int daysOnMarket;
    private ArrayList<String> imageURLs;
    private String alert;
    private Broker listingAgent;
}
