package sperm.meets.egg.plan.be.services;

import sperm.meets.egg.plan.be.domain.PaymentDetails;
import sperm.meets.egg.plan.be.domain.User;

class PaymentService {

    private final FraudService fraudService;

    private final PaymentGateway paymentGateway;

    PaymentService(FraudService fraudService, PaymentGateway paymentGateway) {
        this.fraudService = fraudService;
        this.paymentGateway = paymentGateway;
    }

    void processPayment(User user, PaymentDetails paymentDetails)
        throws FraudulentPaymentException {

        if(fraudService.isFraudulent(user, paymentDetails)) {
            throw new FraudulentPaymentException();
        }

        paymentGateway.sentPayment(paymentDetails);
    }
}
