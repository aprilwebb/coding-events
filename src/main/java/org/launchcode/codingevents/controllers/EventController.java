package org.launchcode.codingevents.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Chris Bay
 */
@Controller
@RequestMapping("events")
public class EventController {

    @GetMapping
    public String displayAllEvents(Model model) {
//        List<String> events = new ArrayList<>();
//        events.add("Code With Pride");
//        events.add("Strange Loop");
//        events.add("Apple WWDC");
//        events.add("SpringOne Platform");
//        model.addAttribute("events", events);
//        return "events/index";
        Map<String, String> events = new HashMap<>();
        events.put("Women Who Code", "We help you build the skills you need to raise your " +
                "professional profile and achieve greater career success.");
        events.put("USF Summer Tech Camps", "The world's #1 STEM summer camp");
        events.put("Tampa Beginner Programmers", "This is a group for anyone who has never " +
                "written a computer program or is in the very early stages of learning. ");
        model.addAttribute("events", events);
        return "events/index";
    }

}
