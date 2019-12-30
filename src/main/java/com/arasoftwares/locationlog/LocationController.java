package com.arasoftwares.locationlog;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("location")
public class LocationController {

    @Autowired
    private LocationRepository locationRepository;

    @PostMapping()
    public Location postLocation(@RequestBody Location location) {
        return locationRepository.save(location);
    }

    // @PostMapping(path = "", consumes = { "multipart/form-data" })
    // public String postByUrl(@RequestParam("latitude") float latitude,
    // @RequestParam("longitude") float longitude,
    // @RequestParam("speed") float speed) {
    // Location location = new Location();
    // location.latitude = latitude;
    // location.longitude = longitude;
    // location.speed = speed;
    // locationRepository.save(location);
    // return "Success";
    // }

    @GetMapping("all")
    public Iterable<Location> getAll() {
        return locationRepository.findAll();
    }

}