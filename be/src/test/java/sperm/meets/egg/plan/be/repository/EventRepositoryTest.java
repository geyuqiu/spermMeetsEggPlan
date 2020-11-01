package sperm.meets.egg.plan.be.repository;

import org.junit.jupiter.api.Test;

import static org.springframework.test.util.AssertionErrors.assertEquals;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import sperm.meets.egg.plan.be.domain.Event;


import java.util.List;

@DataJpaTest
public class EventRepositoryTest {

    @Autowired
    EventRepository eventRepository;

    @Test
    void smokeTest() {
        List<Event> events = eventRepository.findAll();

        eventRepository.save(new Event());

        List<Event> actual = eventRepository.findAll();
        assertEquals("expected size not equal to actual size",events.size() + 1, actual.size());
    }
}
