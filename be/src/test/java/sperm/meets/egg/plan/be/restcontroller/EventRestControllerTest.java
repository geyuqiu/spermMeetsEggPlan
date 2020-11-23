package sperm.meets.egg.plan.be.restcontroller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import sperm.meets.egg.plan.be.repository.EventRepository;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith({SpringExtension.class, MockitoExtension.class})
class EventRestControllerTest {

    @MockBean
    EventRestController eventRestController;

    @BeforeEach
    void setUp() {
//        eventRestController = new EventRestController(eventRepository);
    }

    @Test
    void home() {
        when(eventRestController.noProblem()).thenReturn("no problem");

        assertThat(eventRestController.noProblem()).isEqualTo("no problem");
    }
}
