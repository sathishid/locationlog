package com.arasoftwares.locationlog;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
    // location.latitude = latitude;5
    // location.longitude = longitude;
    // location.speed = speed;
    // locationRepository.save(location);
    // return "Success";
    // }

    @GetMapping("submit/{lat}")
    public Location submit(@PathVariable("lat") float latitude) {
        Location location = new Location();
        location.latitude = latitude;
        location.longitude = 1.4f;
        location.speed = 2.4f;
        return locationRepository.save(location);

    }

    @GetMapping("all")
    public Iterable<Location> getAll() {
        return locationRepository.findAll();
    }

}