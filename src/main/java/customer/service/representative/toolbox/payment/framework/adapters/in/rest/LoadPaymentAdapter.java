package customer.service.representative.toolbox.payment.framework.adapters.in.rest;

import customer.service.representative.toolbox.payment.application.query.LoadPaymentQuery;
import customer.service.representative.toolbox.payment.application.query.LoadPaymentQuery.LoadPaymentCommand;

import customer.service.representative.toolbox.payment.domain.Payment;
import customer.service.representative.toolbox.payment.domain.Payment.PaymentId;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class LoadPaymentAdapter {

    private final LoadPaymentQuery loadPaymentQuery;

    @GetMapping(path = "/customer/service/representative/toolbox/payment/get/{paymentId}")
    Payment loadPayment(
            @PathVariable("paymentId") Long paymentId) {

        LoadPaymentCommand command = new LoadPaymentCommand(new PaymentId(paymentId));

        return loadPaymentQuery.loadPayment(command);
    }

}