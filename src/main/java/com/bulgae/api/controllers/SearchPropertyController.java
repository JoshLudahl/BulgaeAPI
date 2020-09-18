package com.bulgae.api.controllers;

import com.bulgae.api.models.property.Property;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/search")
public class SearchPropertyController {

    @RequestMapping("/city")
    public ArrayList<Property> city(
            @RequestParam String city
    ) {
        //round up location by city
        return new ArrayList<>();
    }

    @RequestMapping("/state")
    public ArrayList<Property> state(
            @RequestParam String state
    ) {
        //round up location by state
        return new ArrayList<>();
    }

    @RequestMapping("/coords")
    public ArrayList<Property> coords(
            @RequestParam double lon,
            @RequestParam double lat
    ) {
        //round up locations by coordinates
        return new ArrayList<>();
    }
}
