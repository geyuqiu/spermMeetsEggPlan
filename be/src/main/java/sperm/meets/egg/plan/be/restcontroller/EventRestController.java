package sperm.meets.egg.plan.be.restcontroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sperm.meets.egg.plan.be.repository.EventRepository;

@RestController
public class EventRestController {

    EventRepository eventRepository;

    public EventRestController(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }
}
