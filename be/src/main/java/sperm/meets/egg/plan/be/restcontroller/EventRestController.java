package sperm.meets.egg.plan.be.restcontroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventRestController {
    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }
}