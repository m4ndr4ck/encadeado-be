package customer.service.representative.toolbox.payment.application.port.out;

import customer.service.representative.toolbox.payment.domain.Payment;
import customer.service.representative.toolbox.payment.domain.Payment.PaymentId;

public interface LoadPaymentOutPort {
    Payment loadPayment(PaymentId paymentId);
}
