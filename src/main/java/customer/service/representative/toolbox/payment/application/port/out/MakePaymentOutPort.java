package customer.service.representative.toolbox.payment.application.port.out;

import customer.service.representative.toolbox.payment.domain.Payment;

public interface MakePaymentOutPort {

    void createPayment(Payment payment);

}
