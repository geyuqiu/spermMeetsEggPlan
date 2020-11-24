package sperm.meets.egg.plan.be.services;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import sperm.meets.egg.plan.be.domain.PaymentDetails;
import sperm.meets.egg.plan.be.domain.User;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith({MockitoExtension.class})
class PaymentServiceShould {

    @Mock
    FraudService fraudService;

    @Mock
    PaymentGateway paymentGateway;

    PaymentService paymentService;
    User user;
    PaymentDetails paymentDetails;


    @BeforeEach
    void setUp() {
        paymentService = new PaymentService(fraudService, paymentGateway);
        user = new User();
        paymentDetails = new PaymentDetails();
    }

    @Test void
    throw_exception_when_fraudulent_payment_processed() {

        when(fraudService.isFraudulent(user, paymentDetails)).thenReturn(true);

        assertThrows(FraudulentPaymentException.class,
            () -> {
                paymentService.processPayment(user, paymentDetails);
            });
        verifyZeroInteractions(paymentGateway);
        verify(paymentGateway, never()).sentPayment(paymentDetails);
    }

    @Test void
    process_payment_when_it_is_legit() throws FraudulentPaymentException {
        when(fraudService.isFraudulent(user, paymentDetails)).thenReturn(false);

        paymentService.processPayment(user, paymentDetails);

        verify(paymentGateway).sentPayment(paymentDetails);
    }
}
