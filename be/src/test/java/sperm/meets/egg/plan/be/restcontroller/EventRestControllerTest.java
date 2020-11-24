package sperm.meets.egg.plan.be.restcontroller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith({SpringExtension.class, MockitoExtension.class})
class EventRestControllerShould {

    @MockBean
    EventRestController eventRestController;

    @BeforeEach
    void setUp() {
    }

    @Test void
    return_no_problem_after_calling_noProblem() {
        when(eventRestController.noProblem()).thenReturn("no problem");

        assertThat(eventRestController.noProblem()).isEqualTo("no problem");
    }
}
