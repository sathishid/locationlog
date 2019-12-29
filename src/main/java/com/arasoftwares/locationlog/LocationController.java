package com.arasoftwares.locationlog;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("location")
public class LocationController {

    @Autowired
    private LocationRepository locationRepository;

    @GetMapping("")
    public String postByUrl(@RequestParam(value = "lat") float lat, @RequestParam(value = "lng") float lng,
            @RequestParam(value = "speed") float speed

    ) {
        Location location = new Location();
        location.latitude = lat;
        location.longitude = lng;
        location.speed = speed;
        locationRepository.save(location);
        return "Success";
    }

    @GetMapping("all")
    public Iterable<Location> getAll(){
        return locationRepository.findAll();
    }

}