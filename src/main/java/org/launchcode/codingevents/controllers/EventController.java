package org.launchcode.codingevents.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Controller
@RequestMapping("events")
public class EventController {

   // private static List<String> events = new ArrayList<>();
    private static HashMap<String, String> events = new HashMap<>();

    @GetMapping
    public String displayAllEvents(Model model) {
        events.put("Coding & Cocktails: The Garnish | Introduction to CSS", "Join us for our monthly coding series, Coding & Cocktails. Women are invited to attend sessions to get an introduction to website building in a fun, laid-back atmosphere");
        events.put("SHIFT Tech Transformation Summit", "A day of virtual sessions to learn from industry leaders from Centene, Broadcom, Mastercard, Penn Interactive, NGA, and others as they discuss the future of talent in the tech industry." );
        events.put("gRPC A new Rest replacement ?", "Tom Collins of First Street Software will demonstrate gRPC." +
                "Its the new hotness to replace or work with REST. So think of it as binary REST calls. They are using it as a binary communication for microservices as well. VS2022 makes it pretty easy really.");
        model.addAttribute("events", events);
        return "events/index";
    }

    // this method lives at /events/create
    @GetMapping("create")
    public String renderCreateForm(){
        return "events/create";
    }

    // this method lives at /events/create
    @PostMapping("create")
    public String createEvent(@RequestParam String eventName, @RequestParam String description){
        events.put(eventName, description);
        return "redirect:/events";
    }

}
